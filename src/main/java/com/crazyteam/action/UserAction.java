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
	private User user;
	private static final long serialVersionUID = 7652872498317019704L;
	
	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
	private Map session;
	public void setSession(Map session) {
		this.session = session;
	}
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
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
			return  "qqqq";
		}
	}
	/**
	 * 注销
	 * @return
	 * @throws Exccption
	 */
	public String logout() throws Exception
	{
		session.remove("admin");
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
