package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.admin.Admin;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext ac=
			new ClassPathXmlApplicationContext("configuration.xml");
	Admin ad=ac.getBean(Admin.class,"aObj");
	System.out.println(ad);
	
	}

}
