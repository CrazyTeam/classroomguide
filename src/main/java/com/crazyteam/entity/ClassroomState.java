package com.crazyteam.entity;

import java.util.Date;

/**
 * 
 * @author jiangsuyong
 *
 */
public class ClassroomState {
	private Integer id;
	private Integer state;
	private Classroom classroom;
	
	private Integer time;
	private Date day;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
}
