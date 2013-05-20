package com.crazyteam.service;

import com.crazyteam.entity.User;
import com.crazyteam.util.Page;

public interface UserService {
	public 	Boolean saveUser(User user);
	public Boolean updateUser(User user);
	public Boolean deleteUser(User user);
	public User findUserbyId(Integer userid);
	public User findUserByName(String name);
	public Page<User> listUser(Integer page);
}
