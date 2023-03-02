package com.assignment.question5;

import javax.annotation.Resource;

public class AnnotationDemo {

  // Demonstration of @Resource
  @Resource(name = "myDataService")
  private DataService dataService;

 
  private Logger logger;

  // Demonstration of @Required
  private String requiredProperty;

 
  public void setRequiredProperty(String requiredProperty) {
    this.requiredProperty = requiredProperty;
  }

  public void doSomething() {
    // Use the data service to retrieve some data
    String data = dataService.retrieveData();
    // Log the data using the logger
    logger.log(data);
    // Print out the required property
    System.out.println("Required property: " + requiredProperty);
  }
}


