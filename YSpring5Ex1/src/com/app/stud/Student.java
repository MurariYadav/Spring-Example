package com.app.stud;

public class Student {
	private int StudId;
	private String StudName;
	private String StudCourse;
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
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
