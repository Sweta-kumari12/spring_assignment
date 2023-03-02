package com.assignment.question2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

    private ApplicationContext context;
    private QuestionMap question;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContextMap.xml");
        question = (QuestionMap) context.getBean("QuestionMap");
    }

    @Test
    public void testAnswersMap() {
        Map<Integer, String> expected = new HashMap<>();
        expected.put(1, "Jupiter");
        expected.put(2, "Saturn");
        expected.put(3, "Uranus");
        expected.put(4, "Neptune");

        Map<Integer, String> actual = question.getAnswers();
        assertEquals(expected, actual);
    }
}