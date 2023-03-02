package com.assignment.question2;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {

    private ApplicationContext context;
    private QuestionSet question;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContextSet.xml");
        question = (QuestionSet) context.getBean("Set");
    }

    @Test
    public void testAnswersSet() {
        Set<String> expected=new HashSet<>();
        expected.add("Asia");
        expected.add("Africa");
        expected.add("North America");
        expected.add("South America");
        expected.add("Antarctica");
        expected.add("Europe");
        expected.add("Australia");

        Set<String> actual = question.getAnswers();
        assertEquals(expected, actual);
    }
}