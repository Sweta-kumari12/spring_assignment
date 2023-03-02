package com.assignment.question2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringTest {

    private ApplicationContext context;
    private QuestionString question;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContextString.xml");
        question = (QuestionString) context.getBean("String");
    }

    @Test
    public void testAnswersList() {
        List<String> expected = Arrays.asList("Paris", "Lyon", "Marseille");
        List<String> actual = question.getAnswers();
        assertEquals(expected, actual);
    }
}