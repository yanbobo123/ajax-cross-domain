package cn.ybb.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import cn.ybb.dao.UserDao;
import cn.ybb.entity.User;
@Service("userService")
public class UserServiceSpringImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	/**
	 * ��ѯ
	 */
	@Override
	public List<User> findUser(String name , HttpServletRequest request) throws Exception{
		List<User> users = new ArrayList<User>();
		if(name.trim()!=null && !"".equals(name)){
			 users = userDao.findUserById(name);
		}else{
			users = userDao.findAll();
		}
		return users;
	}

	/**
	 * ����
	 */
	@Override
	public void updateById(User user) throws Exception{
		userDao.updateById(user);
	}

	/**
	 * ����
	 */
	@Override
	public void insertUser(User user,HttpServletRequest request) throws Exception{
		userDao.saveUser(user);
	}

	/**
	 * ɾ��
	 */
	@Override
	public void deleteById(int id) throws Exception{
		userDao.deleteById(id);
	}

}
