package com.app.emp;

import org.springframework.beans.factory.annotation.Required;

public abstract class Student {
	private int stdId;
	private String stdName;
	private String stdCourse;
    private Course cS;
	public Student() {
		super();
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	@Required
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCourse() {
		return stdCourse;
	
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	public abstract Course getNewChild(); 
	public Course getcS() {
		
	 cS=getNewChild();
		return cS;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCourse=" + stdCourse + ", cS=" + cS + "]";
	}
	
}
