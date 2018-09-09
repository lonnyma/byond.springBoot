package com.byond.poll.bean;

public class AnswerBean {
	
	private Long answerId;
	private Long programId;
	private Long objId;
	private Long questionId;
	private String questionAnswer;
	private String answerRemark;
	
	public AnswerBean (){
		
	}
	public Long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public Long getObjId() {
		return objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getAnswerRemark() {
		return answerRemark;
	}
	public void setAnswerRemark(String answerRemark) {
		this.answerRemark = answerRemark;
	}
	
	
}
