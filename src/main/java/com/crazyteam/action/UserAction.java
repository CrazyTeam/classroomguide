package com.crazyteam.action;

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
	
	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
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
		return null;
	}

}
