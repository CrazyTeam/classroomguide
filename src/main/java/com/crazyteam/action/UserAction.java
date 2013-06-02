package com.crazyteam.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.crazyteam.entity.User;
import com.crazyteam.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * 
 * @author jiangsuyong
 *
 */
@Component(value="userAction")
public class UserAction extends ActionSupport {


	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login() throws Exception
	{
		return LOGIN;
	}
	/**
	 * 注销
	 * @return
	 * @throws Exccption
	 */
	public String logout() throws Exception
	{
		return null;
	}
	/**
	 * 注册
	 * @return
	 * @throws Exception
	 */
	public String register() throws Exception
	{
		User user = new User();
		user.setEmail("1013598664@qq.com");
		user.setForbid(false);
		user.setName("linving");
		user.setPassword("a1008611");
		user.setWeight(1);
		userService.saveUser(user);
		return SUCCESS;
	}

}
