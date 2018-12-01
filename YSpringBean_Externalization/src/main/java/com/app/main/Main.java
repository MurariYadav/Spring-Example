package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.std.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student s1=ac.getBean(Student.class,"sObj");
		System.out.println(s1);
int	count=ac.getBeanDefinitionCount();
	System.out.println(count);
		String[] s=ac.getBeanDefinitionNames();
		for(String ss:s) {
		System.out.println(ss);
		}
	}

}
