package com.crazyteam.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.crazyteam.dao.UserDao;
import com.crazyteam.entity.User;

@Component(value = "userDao")
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

}
