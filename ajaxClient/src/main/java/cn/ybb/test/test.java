package cn.ybb.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ybb.dao.UserDao;
import cn.ybb.entity.User;
public class test {
	ApplicationContext ac;
	@Before
	public void init(){
		 ac = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void findUser(){
		UserDao dao = ac.getBean("userDao",UserDao.class);
	}
}
