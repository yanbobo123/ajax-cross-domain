package cn.ybb.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.ybb.entity.User;

public interface UserService {
	
	public List<User> findUser(String name,HttpServletRequest request) throws Exception;
	
	public void updateById(User user) throws Exception;
	
	public void insertUser(User user,HttpServletRequest request) throws Exception;
	
	public void deleteById(int id) throws Exception;
	
	
}
