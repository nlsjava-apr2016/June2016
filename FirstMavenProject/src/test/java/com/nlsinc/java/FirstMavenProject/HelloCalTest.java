package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class HelloCalTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void firsttest() {
		Calculator cal = new Calculator();
		int actual = cal.add(2, 3);
		int expected = 5;
		System.out.println("first test");
		Assert.assertEquals(expected, actual);
		
		int h = cal.add(2, 3);
		if( h!=5)
			h=5;
		
		boolean result = false;
		if(result == true){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.println("hello");
		System.out.println("hello world");

	}

}
