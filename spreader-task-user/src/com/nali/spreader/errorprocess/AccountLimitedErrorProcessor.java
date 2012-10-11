package com.nali.spreader.errorprocess;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nali.spreader.constants.TaskErrorCode;
import com.nali.spreader.factory.result.DefaultErrorProcessor;
import com.nali.spreader.service.IGlobalRobotUserService;
import com.nali.spreader.service.IGlobalUserService;

@Component
public class AccountLimitedErrorProcessor extends DefaultErrorProcessor<Long> {
	private static Logger logger = Logger.getLogger(AccountLimitedErrorProcessor.class);
	@Autowired
	private IGlobalRobotUserService globalRobotUserService;
	@Autowired
	private IGlobalUserService globalUserService;
	
	@Override
	public String getErrorCode() {
		return TaskErrorCode.accountLimited.getCode();
	}

	@Override
	public void handleError(Long userId, Map<String, Object> contextContents, Long uid, Date errorTime) {
		if(!uid.equals(userId)) {
			throw new IllegalArgumentException("uid!=userId, uid:"+uid+", userId:"+userId);
		}
		logger.warn("account limited:" + uid);
		globalRobotUserService.accountLimited(uid);
		globalUserService.removeUser(uid);
	}

}