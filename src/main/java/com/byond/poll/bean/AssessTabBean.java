package com.byond.poll.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AssessTabBean {

	private HashMap<String, List<ChoiceQuestionBean>> selectMap=new HashMap<String, List<ChoiceQuestionBean>>();
    private HashMap<String, List<JudgeQuestionBean>> judgeMap=new HashMap<String, List<JudgeQuestionBean>>();
	 private List<ChoiceQuestionBean> choiceList=null; 
	 private List<JudgeQuestionBean> judgeList=null;
	 ChoiceQuestionBean cqMB=null;
   public AssessTabBean(List<QuestionBean> questionlist){
    	if(null==questionlist)return;
    	initAssessTab(questionlist);
    	classifyChoice(choiceList);
    }   
        
    
    private void initAssessTab(List<QuestionBean> questionlist){
    	QuestionBean qMB=null;		
		choiceList=new ArrayList<ChoiceQuestionBean>();
		 judgeList=new ArrayList<JudgeQuestionBean>();    	
		
		JudgeQuestionBean jqMB=null;
		String resultOption[]=null;
		String resultKey[]=null;
		//进行分类处理
		for(int i=0;i<questionlist.size();i++){
		 qMB=questionlist.get(i);
		 //归类选择题
		 if("select".equals(qMB.getQuestionType())){
			 //取得当前题目下的结果选项
			 resultOption=qMB.getAnswerOption().split("￥");
			 resultKey=qMB.getAnswerKey().split("￥");
		
			 cqMB=new ChoiceQuestionBean(qMB.getQuestionType(), 
					 qMB.getQuestionName(), qMB.getQuestionAvailability(),
					 resultOption[0], resultOption,resultKey);
			 //保存id
			 cqMB.setQuestionId(qMB.getQuestionId());
			 //压入选择题列表中
			 choiceList.add(cqMB);
			 //判断题目
		 }else if("judge".equals(qMB.getQuestionType())){
			 //取得当前题目下的结果选项
			 resultOption=qMB.getAnswerOption().split("￥");
		
			 jqMB=new JudgeQuestionBean(qMB.getQuestionType(), 
					 qMB.getQuestionName(), qMB.getQuestionAvailability(),
					 resultOption);
			 //保存id
			 jqMB.setQuestionId(qMB.getQuestionId());
			//压入判断题列表中
			 judgeList.add(jqMB);
		 }
		 // 扩展内容  其他题型
		 
		 selectMap.put("select", choiceList);
		 judgeMap.put("judge", judgeList);
		 
	 }
    }
    
    /**
     * 功能描述：对所有选择题进行分组
     * @param choiceList
     */
    private void classifyChoice(List<ChoiceQuestionBean> choiceList){
    	if(null==choiceList)return;
    	ArrayList<ChoiceQuestionBean> singleChoiceList=new ArrayList<ChoiceQuestionBean>();
    	ArrayList<ChoiceQuestionBean> multipleChoiceList=new ArrayList<ChoiceQuestionBean>();
    	for(int i=0;i<choiceList.size();i++){    		
    		cqMB=choiceList.get(i);
    		if("one".equals(cqMB.getSelectOption()))
    			singleChoiceList.add(cqMB);
    		else if("many".equals(cqMB.getSelectOption()))
    			multipleChoiceList.add(cqMB);
    	}
    	 selectMap.put("singleChoice", singleChoiceList);
    	 selectMap.put("multipleChoice", multipleChoiceList);
    }
    
    
    
    public HashMap<String, List<ChoiceQuestionBean>> getSelectMap() {
		return selectMap;
	}
	public void setSelectMap(HashMap<String, List<ChoiceQuestionBean>> selectMap) {
		this.selectMap = selectMap;
	}
	public HashMap<String, List<JudgeQuestionBean>> getJudgeMap() {
		return judgeMap;
	}
	public void setJudgeMap(HashMap<String, List<JudgeQuestionBean>> judgeMap) {
		this.judgeMap = judgeMap;
	}

	
	
	
}
