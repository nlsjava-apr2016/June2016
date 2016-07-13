package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Cal2Test {
	Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
		cal= new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void multest() {
		int actual = cal.mul(2, 3);
		int expected = 6;
		System.out.println("mul test");
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void divtest() {
		int actual = cal.div(2, 0);
		int expected = 0;
		System.out.println("div test");
		Assert.assertEquals(expected, actual);
	}
	
	@Ignore
	@Test(timeout=1000)
	public void infinitetest(){
		cal.infinite();
	}

}
