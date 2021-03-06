package com.baoy.dao;

import java.util.List;

import com.baoy.bean.User;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 上午10:21:29
 *
 *          desc: ...
 */
public interface UserDao {
	public List<User> getAllUsers();
	public void delUserById(int userId);
	public User getUserById(int userId);
	public void updateUser(User user);
	public void addUser(User user);
}
