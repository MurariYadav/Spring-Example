package com.app.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.emp.Employee;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext("configuration.xml");
	Employee e=ac.getBean(Employee.class,"eObj");
	System.out.println(e);
	System.out.println(e.getClass());
}
}
