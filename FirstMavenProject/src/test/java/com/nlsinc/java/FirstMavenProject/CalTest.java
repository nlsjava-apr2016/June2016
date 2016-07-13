package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalTest {
Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before method");
		cal= new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method");
	}

	@Test
	public void firsttest() {
		int actual = cal.add(2, 3);
		int expected = 5;
		System.out.println("first test");
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void secondtest() {
		int actual = cal.sub(2, 3);
		int expected = -1;
		System.out.println("second test");
		Assert.assertEquals(expected, actual);

	}

}
