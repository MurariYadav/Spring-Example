package com.app.xml.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.xml.student.Student;
//OK

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext aac=
			new ClassPathXmlApplicationContext("config.xml");
	Student st=aac.getBean(Student.class,"sObj");
	/*Object ob=aac.getBean("stObj");
	Student st=(Student)ob;
	*/System.out.println(st);
	aac.registerShutdownHook();
	
}
}
