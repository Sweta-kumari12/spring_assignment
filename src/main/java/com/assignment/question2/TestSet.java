package com.assignment.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSet.xml");
        QuestionSet question1 = (QuestionSet) context.getBean("Set");
        System.out.println(question1.getQuestion());
        System.out.println(question1.getAnswers());
    }
}