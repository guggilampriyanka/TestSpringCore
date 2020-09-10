package com.priyanka.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	Addition(int a,double b)
	{
		System.out.println("inside constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
}
