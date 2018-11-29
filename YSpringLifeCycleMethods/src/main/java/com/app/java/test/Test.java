package com.app.java.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.java.Student;

//OK


public class Test {
public static void main(String[] args) {
	AbstractApplicationContext aac=
			new ClassPathXmlApplicationContext("javaconfig.xml");
	Student st=aac.getBean(Student.class,"javaObj");
	/*Object ob=aac.getBean("stObj");
	Student st=(Student)ob;
	*/System.out.println(st);
	aac.registerShutdownHook();
	
}
}
