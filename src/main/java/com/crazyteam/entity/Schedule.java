package com.crazyteam.entity;
import com.crazyteam.util.WeekDay;

/**
 * 
 * 
 * @author jiangsuyong
 *
 */
public class Schedule {
	private Integer id;
	private Course course;
	private WeekDay weekDay;
	private Integer lession;
	private Classroom classroom;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public WeekDay getweekDay(){
		return weekDay;
	}
	public void setweekDay(WeekDay weekDay){
		this.weekDay=weekDay;
	}
	public Integer getLession() {
		return lession;
	}
	public void setLession(Integer lession) {
		this.lession = lession;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	
}
