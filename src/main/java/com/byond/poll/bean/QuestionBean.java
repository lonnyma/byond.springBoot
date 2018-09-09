package com.byond.poll.bean;



public class QuestionBean {

	private Long questionId;
	private String questionType;
	private String questionName;
    private  Character questionAvailability;//有效性
    private String answerOption;//问题选项
    private String answerKey;
    private String remark;
    
    public QuestionBean(){
    	
    }
    
    
    public String getAnswerKey() {
		return answerKey;
	}


	public void setAnswerKey(String answerKey) {
		this.answerKey = answerKey;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public QuestionBean(String qType,String qName,Character qAvailability){

    	this.questionName=qName;
    	this.questionType=qType;
    	this.questionAvailability=qAvailability;
    }
    
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public Character getQuestionAvailability() {
		return questionAvailability;
	}
	public void setQuestionAvailability(Character questionAvailability) {
		this.questionAvailability = questionAvailability;
	}
	public String getAnswerOption() {
		return answerOption;
	}
	public void setAnswerOption(String answerOption) {
		this.answerOption = answerOption;
	}

    
    
    
}
