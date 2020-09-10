package com.priyanka.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/priyanka/spring/springcore/map/mapconfig.xml");
		Customer customer= (Customer) ctx.getBean("customer");
		System.out.println(customer);
	}
}
