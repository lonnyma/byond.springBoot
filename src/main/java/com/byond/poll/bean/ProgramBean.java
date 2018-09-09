package com.byond.poll.bean;

import java.sql.Date;
import java.util.List;

public class ProgramBean {

	
  private Long programId;
  private String programName;
  private Date startTime;
  private Date endTime;
  private List<QuestionBean> questionList;
  private Character isRelate;
  private Character isRelease;
  private String remark;
  
  public ProgramBean(){
	  
  }
  
  public ProgramBean(String programName,Date startTime,Date endTime, Character isRelate,Character isRelease){
	  this.programName=programName;
	  this.endTime=endTime;
	  this.startTime=startTime;
	  this.isRelate=isRelate;
	  this.isRelease=isRelease;
	  
  }
  
  
  public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public Long getProgramId() {
	return programId;
}
public void setProgramId(Long programId) {
	this.programId = programId;
}
public String getProgramName() {
	return programName;
}
public void setProgramName(String programName) {
	this.programName = programName;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public List<QuestionBean> getQuestionList() {
	return questionList;
}
public void setQuestionList(List<QuestionBean> questionList) {
	this.questionList = questionList;
}

public Character getIsRelate() {
	return isRelate;
}

public void setIsRelate(Character isRelate) {
	this.isRelate = isRelate;
}

public Character getIsRelease() {
	return isRelease;
}

public void setIsRelease(Character isRelease) {
	this.isRelease = isRelease;
}
  

}
