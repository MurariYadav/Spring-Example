package com.app.std;

public class Student {
	private int stdId;
	private String stdName;
	private String stdSubject;
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
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdSubject() {
		return stdSubject;
	}
	public void setStdSubject(String stdSubject) {
		this.stdSubject = stdSubject;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdSubject=" + stdSubject + "]";
	}
	

}
