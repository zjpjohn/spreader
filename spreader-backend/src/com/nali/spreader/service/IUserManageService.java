package com.nali.spreader.service;

import com.nali.common.pagination.PageResult;
import com.nali.spreader.config.UserTagParamsDto;
import com.nali.spreader.data.User;

public interface IUserManageService {
	/**
	 * 获取用户信息分页数据
	 * 
	 * @param utp
	 * @param start
	 * @param limit
	 * @return
	 */
	public PageResult<User> findUserInfo(UserTagParamsDto utp, Integer start,
			Integer limit);

	/**
	 * 查询用户的真人粉丝详细信息
	 * 
	 * @param id
	 * @param start
	 * @param limit
	 * @return
	 */
	public PageResult<User> findUserFansInfo(Long id, Integer start,
			Integer limit);

}
