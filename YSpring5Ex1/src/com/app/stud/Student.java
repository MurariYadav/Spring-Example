package com.app.stud;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int StudId;
	private String StudName;
	private String StudCourse;
	public int getStudId() {
		return StudId;
	}
	@Required
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	@Required
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getStudCourse() {
		return StudCourse;
	}
	public void setStudCourse(String studCourse) {
		StudCourse = studCourse;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudName=" + StudName + ", StudCourse=" + StudCourse + "]";
	}
	

}
