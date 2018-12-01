package com.app.emp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double EmpSal;
	private List<String> EmpPrjs;
	private Set<String> EmpAddr;
	private Map<Integer,String> EmpContacts;
	private Properties EmpGender;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	public List<String> getEmpPrjs() {
		return EmpPrjs;
	}
	public void setEmpPrjs(List<String> empPrjs) {
		EmpPrjs = empPrjs;
	}
	public Set<String> getEmpAddr() {
		return EmpAddr;
	}
	public void setEmpAddr(Set<String> empAddr) {
		EmpAddr = empAddr;
	}
	public Map<Integer, String> getEmpContacts() {
		return EmpContacts;
	}
	public void setEmpContacts(Map<Integer, String> empContacts) {
		EmpContacts = empContacts;
	}
	public Properties getEmpGender() {
		return EmpGender;
	}
	public void setEmpGender(Properties empGender) {
		EmpGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + ", EmpPrjs=" + EmpPrjs
				+ ", EmpAddr=" + EmpAddr + ", EmpContacts=" + EmpContacts + ", EmpGender=" + EmpGender + "]";
	}
	

}
