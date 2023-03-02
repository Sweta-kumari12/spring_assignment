package com.assignment.question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationontextquestion6.xml");
		DatabaseConfig b=context.getBean("bank1",DatabaseConfig.class);
		b.details();

	}

}