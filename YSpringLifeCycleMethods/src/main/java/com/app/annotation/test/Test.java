package com.app.annotation.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.annotation.Student.Student;



public class Test {
public static void main(String[] args) {
	AbstractApplicationContext aac=
			new ClassPathXmlApplicationContext("annotationconfig.xml");
	Student st=aac.getBean(Student.class,"SObj");
	/*Object ob=aac.getBean("stObj");
	Student st=(Student)ob;
	*/System.out.println(st);
	aac.registerShutdownHook();
	
}
}
