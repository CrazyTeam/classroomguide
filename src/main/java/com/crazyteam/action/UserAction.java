package com.crazyteam.action;

import java.util.Map;

import com.crazyteam.entity.User;
import com.crazyteam.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * 
 * @author jiangsuyong
 *
 */
public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 7652872498317019704L;
	
	private User user;
	private Map<Object,Object> session;
	private UserService userService;
	public void setSession(Map<Object,Object> session) {
		this.session = session;
	}
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception
	{

		User u=userService.findUserByName(user.getName());
		if(u==null)
		{
			return  LOGIN;
		}else if(!u.getPassword().equals(user.getPassword()))
		{
			return  LOGIN;
		}
		else
		{
			session.put("name", user.getName());
			return  SUCCESS;
		}
	}
	/**
	 * 注销
	 * @return
	 * @throws Exccption
	 */
	public String logout() throws Exception
	{
		session.remove("name");
		return SUCCESS;
	}
	/**
	 * 注册
	 * @return
	 * @throws Exception
	 */
	public String register() throws Exception
	{
		return null;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
