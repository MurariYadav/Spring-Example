package com.app.emp;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Course {
	private int CourseFee;

	public Course() {
		super();
	}

	public int getCourseFee() {
		return CourseFee;
	}

	public void setCourseFee(int courseFee) {
		CourseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [CourseFee=" + CourseFee + "]";
	}
	

}
