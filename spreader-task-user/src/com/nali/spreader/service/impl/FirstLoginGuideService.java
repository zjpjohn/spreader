package com.nali.spreader.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nali.common.model.Limit;
import com.nali.spreader.dao.ICrudUserDao;
import com.nali.spreader.dao.IFirstLoginGuideDao;
import com.nali.spreader.data.User;
import com.nali.spreader.data.UserExample;
import com.nali.spreader.service.IFirstLoginGuideService;

@Service
public class FirstLoginGuideService implements IFirstLoginGuideService {
	@Autowired
	private IFirstLoginGuideDao firstLoginGuideDao;
	@Autowired
	private ICrudUserDao crudUserDao;
	
	@PostConstruct
	public void init() throws Exception {
		boolean initFlagOn = firstLoginGuideDao.isInitFlagOn();
		if(initFlagOn==false) {
			UserExample example = new UserExample();
			int start=0;
			while(true) {
				Limit limit = Limit.newInstanceForLimit(start, 100);
				example.createCriteria().andCreateTimeLessThan(new SimpleDateFormat("yyyy-MM-dd").parse("2012-03-28")).andIsRobotEqualTo(true);
				example.setLimit(limit);
				List<User> list = crudUserDao.selectByExample(example);
				if(list.size()==0) {
					break;
				}
				for (User user : list) {
					firstLoginGuideDao.init(user.getId());
				}
				start+=list.size();
			}
			
			firstLoginGuideDao.setInitFlagOn();
		}
	}

	@Override
	public void guide(Long uid) {
		firstLoginGuideDao.guide(uid);
	}

	@Override
	public boolean isUserGuide(Long uid) {
		return firstLoginGuideDao.isUserGuide(uid);
	}

}
