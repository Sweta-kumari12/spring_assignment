package com.assignment.question2;

import java.util.Map;

public class QuestionMap {
	   private int questionId;
	   private String question;
	   private Map<Integer, String> answers;
	   
	   // getters and setters
	   
	   
	   public void display() {
	      System.out.println("Question: " + question);
	      for (Map.Entry<Integer, String> entry : answers.entrySet()) {
	         System.out.println(entry.getKey() + ". " + entry.getValue());
	      }
	   }

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	}