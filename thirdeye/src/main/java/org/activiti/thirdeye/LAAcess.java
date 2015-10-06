package org.activiti.thirdeye;

import org.activiti.thirdeye.db.LaDao;
import org.activiti.thirdeye.db.LearningActivityDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LAAcess {
public static void main(String args[]){
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
	
	LearningActivityDAO laDAO=(LearningActivityDAO)context.getBean("LearningActivityDao");
	System.out.println(laDAO.getLearningActivities().get(0)[1]);
}
}
