package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.emp.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student s1=ac.getBean(Student.class,"sObj");
		System.out.println("ST Details :"+s1.hashCode());
		System.out.println("Course :"+s1.getcS().hashCode());
		System.out.println(s1);
		
		Student s2=ac.getBean(Student.class,"sObj");
		System.out.println("ST Details :"+s2.hashCode());
		System.out.println("Course :"+s2.getcS().hashCode());
		System.out.println(s2);
		
	}

}
