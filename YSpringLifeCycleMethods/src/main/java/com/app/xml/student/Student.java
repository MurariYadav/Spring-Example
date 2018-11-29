package com.app.xml.student;
//OK
public class Student {
	private int stId;
	private String stName;
	private String stFee;
	public Student() {
		super();
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStFee() {
		return stFee;
	}
	public void setStFee(String stFee) {
		this.stFee = stFee;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stFee=" + stFee + "]";
	}
	public void hi() {
		System.out.println("xml init method");
		
	}
	public void bye() {
		System.out.println("xml destroy method");
	}

}
