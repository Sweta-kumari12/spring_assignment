package com.assignment.question5;

class ConsoleLogger implements Logger {
	  @Override
	  public void log(String message) {
	    System.out.println(message);
	  }
	}