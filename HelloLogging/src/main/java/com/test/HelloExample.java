package com.test;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		obj.runMe("test");
		
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.info("This is warn : " + parameter);
		logger.info("This is error : " + parameter);
		logger.info("This is fatal : " + parameter);
		logger.info("This is debug : " + parameter);
		logger.info("This is info : " + parameter);
	}
	
}