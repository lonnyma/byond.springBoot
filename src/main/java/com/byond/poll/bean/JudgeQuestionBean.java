package com.byond.poll.bean;



public class JudgeQuestionBean extends QuestionBean {

	private String[] resultOption;
	
	public JudgeQuestionBean(String qType, String qName, Character qAvailability,
			String[] resultOption) {
		super(qType, qName, qAvailability);

		this.resultOption=resultOption;
	}
	public String[] getResultOption() {
		return resultOption;
	}

	public void setResultOption(String[] resultOption) {
		this.resultOption = resultOption;
	}

}
