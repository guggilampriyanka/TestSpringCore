package com.priyanka.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("com/priyanka/spring/springcore/dependencycheck/config1.xml");
		/*Prescription prescription= (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);*/
		

		University university = (University) ctx.getBean("university");
		System.out.println(university.hashCode());
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2.hashCode());
		
	}
}
