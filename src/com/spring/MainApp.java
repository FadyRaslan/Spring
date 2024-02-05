package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring container file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.XML");
		//retrieve bean from spring container 
				Sport football = context.getBean("mySport",Sport.class);
		//calling methods in bean
				football.start();
		//close the context
				context.close();
	}
	
}
		
		
		
		
		
		
		
		
		
		
		/*
		Sport foSport=new Volleyball();
		foSport.start();
		
		Football football=new Football();
		football.start();
		Basketball basketball=new Basketball();
		basketball.start();
		*/

