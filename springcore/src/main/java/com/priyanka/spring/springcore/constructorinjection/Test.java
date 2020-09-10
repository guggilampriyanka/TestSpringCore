package com.priyanka.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyanka.spring.springcore.dependencycheck.University;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("com/priyanka/spring/springcore/constructorinjection/config.xml");
		Employee employee= (Employee) ctx.getBean("employee");
		System.out.println(employee.hashCode());
		System.out.println(employee);
		
	}
}
