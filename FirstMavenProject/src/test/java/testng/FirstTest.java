package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTest {
	
  @Test(priority=0)
  public void f() {
	  System.out.println("Actual first test");
  }
  
  @Test(priority=1)
  public void a() {
	  System.out.println("Actual second test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method test1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method test1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Aftrr test test	1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Beefore suite First test");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After suite test");
  }

}
