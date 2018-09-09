package com.byond.poll.bean;





public class ChoiceQuestionBean extends QuestionBean {

	private String selectOption;
	private String[] resultOption;
	private String[] resulltKey;
	
	public ChoiceQuestionBean(String qType, String qName, Character qAvailability,
			String selectOption,String[] resultOption,String[] resulltKey ) {
		super(qType, qName, qAvailability);
		this.selectOption=selectOption;
		this.resultOption=resultOption;
		this.resulltKey=resulltKey;
	
	}

	public String getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}

	public String[] getResultOption() {
		return resultOption;
	}

	public void setResultOption(String[] resultOption) {
		this.resultOption = resultOption;
	}

	public String[] getResulltKey() {
		return resulltKey;
	}

	public void setResulltKey(String[] resulltKey) {
		this.resulltKey = resulltKey;
	}



}
