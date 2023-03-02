package com.assignment.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextString.xml");
        QuestionString question1 = (QuestionString) context.getBean("String");
        System.out.println(question1.getQuestion());
        System.out.println(question1.getAnswers());
    }
}