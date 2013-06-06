package com.crazyteam.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazyteam.dao.UserDao;
import com.crazyteam.entity.User;
import com.crazyteam.service.UserService;
import com.crazyteam.util.Page;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Boolean saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
		return true;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserbyId(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> listUser(Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

}
