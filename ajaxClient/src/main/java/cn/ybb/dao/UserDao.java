package cn.ybb.dao;

import java.util.List;

import cn.ybb.entity.User;

public interface UserDao {
	public void saveUser(User user);
	
	public void deleteById(int id);
	
	public void updateById(User user);
	
	public List<User> findUserById(String name);
	
	public List<User> findAll();
}
