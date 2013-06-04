package com.crazyteam.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.crazyteam.dao.UserDao;
import com.crazyteam.entity.User;


public class UserDaoImpl  implements UserDao {


	private SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		  sessionFactory.getCurrentSession().save(user);
		  return true;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
