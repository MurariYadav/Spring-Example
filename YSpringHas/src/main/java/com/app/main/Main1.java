package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.product.Product;

public class Main1 {
public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
Product p=ac.getBean(Product.class,"pObj");
System.out.println(p);

}
}
