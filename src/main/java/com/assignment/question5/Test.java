package com.assignment.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	  private DataService dataService;
	  private Logger logger;
	  private String requiredProperty;

	  public Test() {}

	  public Test(DataService dataService, Logger logger) {
	    this.dataService = dataService;
	    this.logger = logger;
	  }

	  public void setRequiredProperty(String requiredProperty) {
	    this.requiredProperty = requiredProperty;
	  }

	  public void doSomething() {
	    String data = dataService.retrieveData();
	    logger.log(data);
	    System.out.println("Required property: " + requiredProperty);
	  }

	  public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContentquestion5.xml");
	    AnnotationDemo demo = context.getBean(AnnotationDemo.class);
	    demo.doSomething();
	  }
	}