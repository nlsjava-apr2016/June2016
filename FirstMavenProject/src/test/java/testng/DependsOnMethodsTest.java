package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	public int result;
	
  @Test
  public void registration() {
	  System.out.println("reg done");
	  result = 0;
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods={"registration"},alwaysRun=true, enabled=false)
  public void login() {
	  if(result == 0)
	  System.out.println("login done");
  }
}
