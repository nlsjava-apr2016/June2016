package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGParameters {
 
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Parameters({"fname","lname","company"})
  @Test
  public void insertEmployee(String fname, String lname, String company) {
	  //Class level method
	  System.out.println(fname+ " " +lname + " - " + company );
	 
  }

}
