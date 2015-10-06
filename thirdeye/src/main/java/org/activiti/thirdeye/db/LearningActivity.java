package org.activiti.thirdeye.db;

/**
 * @author Venkatapathy Subramanian
 */

public class LearningActivity {
	String LAName;
	String activitiID;
	
	public void setLAName(String LAName){
		this.LAName=LAName;
	}
	
	public void setActivitiID(String activityID){
		this.activitiID=activityID;
	}
	
	public String getLAName(){
		return this.LAName;
	}
	
	public String getAcitivityID(){
		return this.activitiID;
		
	}
}
