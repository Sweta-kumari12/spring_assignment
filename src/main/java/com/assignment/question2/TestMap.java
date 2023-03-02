package com.assignment.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextMap.xml");
	      QuestionMap question = (QuestionMap) context.getBean("QuestionMap");
	      question.display();
	   }
	}