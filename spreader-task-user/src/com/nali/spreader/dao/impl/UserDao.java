package com.nali.spreader.dao.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.common.model.Limit;
import com.nali.common.util.CollectionUtils;
import com.nali.spreader.config.ContentDto;
import com.nali.spreader.config.UserDto;
import com.nali.spreader.config.UserTagParamsDto;
import com.nali.spreader.dao.IUserDao;
import com.nali.spreader.data.KeyValue;
import com.nali.spreader.data.User;
import com.nali.spreader.dto.FilterUserDto;

@Repository
public class UserDao implements IUserDao {
	private static final String LAST_FETCH_TIME_KEY_PREFIX = "LastFetchTime_";
	private static final String LAST_GET_UID = "gen_ximalaya_get_last_uid";
	@Autowired
	private SqlMapClientTemplate sqlMap;
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public Long assignUser(User user) {
		return (Long) sqlMap.insert("spreader_user.assignUser", user);
	}
	
//	@PostConstruct
//	public void init() {
//		
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<KeyValue<Long, Long>> findUidToWebsiteUidMapByDto(UserDto dto) {
		return sqlMap.queryForList("spreader_user.findUidToWebsiteUidMapByDto", dto);
	}

	@Override
	public Date getAndTouchLastFetchTime(Long uid) {
		return (Date) redisTemplate.opsForValue().getAndSet(LAST_FETCH_TIME_KEY_PREFIX + uid, new Date());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUserFansInfoByDto(UserDto dto) {
		return (List<User>) sqlMap.queryForList("spreader_user.findUserFansInfoByDto", dto);
	}

	@Override
	public void increaseRobotFansCount(Long uid) {
		sqlMap.update("spreader_user.increaseRobotFansCount", uid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUserAndTagInfoList(UserTagParamsDto utp) {
		return sqlMap.queryForList("spreader_user.getUserAndTagInfoByDto", utp);
	}

	@Override
	public Integer countUserAndTagNumer(UserTagParamsDto utp) {
		return (Integer) sqlMap.queryForObject("spreader_user.getUserAndTagCountByDto", utp);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Long> findContentIdByDto(ContentDto dto) {
		return sqlMap.queryForList("spreader_content.findContentIdByDto", dto);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUserFansInfoList(UserTagParamsDto utp) {
		return sqlMap.queryForList("spreader_user.getUserFansInfoByDto", utp);
	}

	@Override
	public Integer countUserFansNumer(UserTagParamsDto utp) {
		return (Integer) sqlMap.queryForObject("spreader_user.getUserFansCountByDto", utp);
	}

	@Override
	public int countByProperties(Map<String, Object> properties) {
		return (Integer) sqlMap.queryForObject("spreader_user.countByProperties", properties);
	}

	@Override
	public List<Long> queryUidsByProperties(Map<String, Object> properties, Limit limit) {
		properties.put("limit", limit);
		return sqlMap.queryForList("spreader_user.queryUidsByProperties", properties);
	}

	@Override
	public List<User> queryNoAvatarRobotUser() {
		return sqlMap.queryForList("spreader_user.queryNoAvatarRobotUser");
	}

	@Override
	public List<Long> queryUidsByProperties(Map<String, Object> properties) {
		return sqlMap.queryForList("spreader_user.queryUidsByProperties", properties);
	}

	@Override
	public boolean updateCtrlGid(long uid, long gid) {
		Map parameterMap = CollectionUtils.newHashMap(2);
		parameterMap.put("uid", uid);
		parameterMap.put("gid", gid);
		return this.sqlMap.update("spreader_user.updaetCtrlGid", parameterMap) > 0;
	}

	@Override
	public Map<Long, Long> queryGids(List<Long> uids) {
		if (!CollectionUtils.isEmpty(uids)) {
			List<User> userList = this.sqlMap.queryForList("spreader_user.queryGids", uids);
			if (!CollectionUtils.isEmpty(userList)) {
				Map<Long, Long> gidMap = CollectionUtils.newHashMap(userList.size());
				for (User user : userList) {
					gidMap.put(user.getId(), user.getCtrlGid());
				}
				return gidMap;
			}
		}
		return Collections.emptyMap();
	}

	@Override
	public String getUserPassword(Long uid) {
		return (String) this.sqlMap.queryForObject("spreader_user.queryUserPassword", uid);
	}

	@Override
	public int updateUserArticles(Long uid) {
		return this.sqlMap.update("spreader_user.updateUserArticles", uid);
	}

	@Override
	public List<Long> getUidByNickName(String nickName) {
		if (StringUtils.isEmpty(nickName)) {
			return Collections.emptyList();
		}
		return sqlMap.queryForList("spreader_user.getUidByNickName", nickName);
	}

	@Override
	public List<Long> queryPostContentUids(FilterUserDto param) {
		return sqlMap.queryForList("spreader_user.queryPostContentUids", param);
	}

	@Override
	public String queryNickNameByWebsiteUid(Map<String, Object> param) {
		return (String) sqlMap.queryForObject("spreader_user.queryNickNameByWebsiteUid", param);
	}

	@Override
	public List<Long> queryAttenLimitUids(Map<String,Object> param) {
		return sqlMap.queryForList("spreader_user.queryAttenLimitUids", param);
	}

	@Override
	public void settingLastUid(Long uid) {
		redisTemplate.opsForValue().getAndSet(LAST_GET_UID, uid);
	}

	@Override
	public Long getLastUid() {
		return (Long) redisTemplate.opsForValue().get(LAST_GET_UID);
	}

	@Override
	public List<Long> getUidsByLastUidAndLimit(Map<String, Object> param) {
		return sqlMap.queryForList("spreader_user.getUidsByLastUidAndLimit", param);
	}

	@Override
	public List<Long> queryFansLimitUids(Map<String, Object> param) {
		return sqlMap.queryForList("spreader_user.queryFansLimitUids", param);
	}

	@Override
	public int updateAttentions(Long id) {
		return sqlMap.update("spreader_user.updateAttentions", id);
	}
}
