package com.crazyteam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * 
 * @author jiangsuyong
 * @since 2013/5/15
 * 
 *
 */
@Entity
public class User {
	@Id
	private Integer id;
	private String name;
	private String password;
	private float weight;
	private Boolean forbid;
	private String email;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float level) {
		this.weight = level;
	}
	public Boolean getForbid() {
		return forbid;
	}
	public void setForbid(Boolean forbid) {
		this.forbid = forbid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
