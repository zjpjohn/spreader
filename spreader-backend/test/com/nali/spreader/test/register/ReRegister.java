package com.nali.spreader.test.register;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nali.spreader.dao.ICrudRobotRegisterDao;
import com.nali.spreader.data.RobotRegister;
import com.nali.spreader.data.RobotRegisterExample;
import com.nali.spreader.factory.TaskProduceLine;
import com.nali.spreader.factory.passive.AutowireProductLine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
public class ReRegister {
	@Autowired
	private ICrudRobotRegisterDao crudRobotRegisterDao;
	@AutowireProductLine
	private TaskProduceLine<Long> registerWeiboAccount;
	
	@Test
	public void test() {
		RobotRegisterExample example = new RobotRegisterExample();
		example.createCriteria().andEmailIsNotNull();
		List<RobotRegister> list = crudRobotRegisterDao.selectByExample(example);
		for (RobotRegister robotRegister : list) {
			registerWeiboAccount.send(robotRegister.getId());
		}
	}

}
