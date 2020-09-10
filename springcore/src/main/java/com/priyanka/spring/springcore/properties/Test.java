package com.priyanka.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/priyanka/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguage countriesAndLang= (CountriesAndLanguage) ctx.getBean("countriesAndLang");
		System.out.println(countriesAndLang);
	}
}
