package com.nali.spreader.factory.regular;

import java.util.Date;
import java.util.List;

import com.nali.common.pagination.PageResult;
import com.nali.spreader.factory.config.desc.ConfigDefinition;
import com.nali.spreader.factory.config.desc.ConfigableInfo;
import com.nali.spreader.model.RegularJob;
import com.nali.spreader.model.RegularJob.JobDto;

public interface RegularScheduler {
	
	/**
	 * 生成cron调度
	 */
	Long scheduleCronTrigger(String name, Object config, String desc, String cron);
	
	/**
	 * 生成simple调度
	 * @param repeatInternal 毫秒
	 */
	Long scheduleSimpleTrigger(String name, Object config, String desc, Date start, int repeatTimes, int repeatInternal);
	
	/**
	 * 查看已有调度
	 */
	PageResult<RegularJob> findRegularJob(String name, Integer triggerType, int page, int pageSize);
	
	/**
	 * 取消调度
	 */
	void unSchedule(Long id);
	
	/**
	 * 列出调度元信息
	 */
	List<ConfigableInfo> listRegularObjectInfos();

	/**
	 * 按名字取ConfigDefinition，如果不是一个有参数的调度，则返回null
	 */
	ConfigDefinition getConfigDefinition(String name);
	
	/**
	 * 按名字取ConfigableInfo
	 */
	ConfigableInfo getConfigableInfo(String name);

	/**
	 * 获取已有配置
	 */
	JobDto getConfig(Long id);
}