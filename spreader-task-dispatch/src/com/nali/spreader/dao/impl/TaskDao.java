package com.nali.spreader.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.common.model.Limit;
import com.nali.common.util.CollectionUtils;
import com.nali.spreader.dao.ITaskDao;
import com.nali.spreader.dto.TaskResultDto;
import com.nali.spreader.model.ActiveTaskDto;
import com.nali.spreader.model.ClientTask;
import com.nali.spreader.model.TaskBatch;
import com.nali.spreader.model.UserTaskCount;
import com.nali.spreader.model.UserTaskCount.QueryDto;

@Repository
public class TaskDao implements ITaskDao {
    @Autowired
    private SqlMapClientTemplate sqlMap;
    
	@SuppressWarnings("unchecked")
	@Override
	public List<UserTaskCount> countUserTask() {
		return sqlMap.queryForList("spreader.countUserTask");
	}

	@Override
	public Long insertTaskBatch(TaskBatch batch) {
		return (Long) sqlMap.insert("spreader.insertTaskBatch", batch);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClientTask> assignTasksSelect(UserTaskCount dto) {
		return sqlMap.queryForList("spreader.assignTasksSelect", dto);
	}

	@Override
	public int expireTasks(Date now) {
		return sqlMap.update("spreader.expireTasks", now);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserTaskCount> countTask(QueryDto queryDto) {
		return sqlMap.queryForList("spreader.countTaskByTaskTypeAndPriority", queryDto);
	}

	@Override
	public int activeTasks(ActiveTaskDto dto) {
		return sqlMap.update("spreader.activeTasks", dto);
	}

	@Override
	public int refreshPriority(String priorityExpression) {
		return sqlMap.update("spreader.refreshPriority", priorityExpression);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TaskResultDto> selectTaskResult(Long resultId,int status,Limit limit) {
		Map<String, Object> param = CollectionUtils.newHashMap(3);
		param.put("resultId", resultId);
		param.put("taskStatus", status);
		param.put("limit", limit);
		return sqlMap.queryForList("spreader.selectTaskResult", param);
	}

	@Override
	public int countTaskResultDto(Long resultId, int status) {
		Map<String, Object> param = CollectionUtils.newHashMap(2);
		param.put("resultId", resultId);
		param.put("taskStatus", status);
		return (Integer) sqlMap.queryForObject("spreader.countTaskResultDto", param);
	}
}