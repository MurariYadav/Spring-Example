package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.stud.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("configuration.xml");
		Student s=ac.getBean(Student.class,"StObj");
		System.out.println(s);
		System.out.println(ac.getBeanDefinitionCount());//get all beans created by container
		String names[]=ac.getBeanDefinitionNames();//get all beans name
		for(String name:names) {
			System.out.println(name);
		}
		
	}
	
	}
