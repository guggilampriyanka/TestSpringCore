package com.priyanka.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/priyanka/spring/springcore/reftypes/reftypesconfig1.xml");
		ShoppingCart shoppingCart= (ShoppingCart) ctx.getBean("shoppingCart");
		System.out.println(shoppingCart);
	}
}
