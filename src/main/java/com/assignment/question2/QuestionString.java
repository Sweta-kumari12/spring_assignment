package com.assignment.question2;

import java.util.List;

public class QuestionString {
    private int questionId;
    private String question;
    private List<String> answers; // or String[] answers
    
    public QuestionString(int questionId, String question, List<String> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
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

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
    
    // getters and setters
    
}