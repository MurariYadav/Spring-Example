package com.app.annotation.Student;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Student {
private int sId;
private String sName;
private String sFee;
public Student() {
	super();
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsFee() {
	return sFee;
}
public void setsFee(String sFee) {
	this.sFee = sFee;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sFee=" + sFee + "]";

}
@PostConstruct
	public void postConstruct() {
		System.out.println(" annotation init method");
	}
@PreDestroy
	public void preDestroy() {
		System.out.println("annotation destroy method");
}
}
