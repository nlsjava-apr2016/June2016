package com.nlsinc.java.FirstMavenProject;

import org.apache.log4j.Logger;

public class LoggingTest {
	final static Logger logger = Logger.getLogger(LoggingTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		logger.debug("main method starting");
		int a = 10, b =20;
		
		a=a*b;
		a=b-a;
		b=b*a*9;
		a = 10/0;
		logger.debug("main method at line 14");
		System.out.println(a);
		a = a*b/3;
		b = b*5;
		logger.info(b);
		
		System.out.println("main method end");
		logger.debug("method end");
		}
		catch(Exception e){
			logger.error(e);
		}
		

	}

}
