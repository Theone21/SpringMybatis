package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.UserDao;
import com.itheima.po.User;

public class DaoTest {
	
	
	@Test
	public void findByIdTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = userDao.findUserById(22);
		System.out.println(user.getName());
	}

}
