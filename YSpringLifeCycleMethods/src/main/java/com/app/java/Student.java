package com.app.java;
//OK
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean{

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("java init method");
		
	}
	public void destroy() {
		System.out.println("java destroy method");
	}
	
}