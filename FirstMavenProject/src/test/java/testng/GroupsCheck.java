package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupsCheck {
	
   @BeforeClass
  public void beforeClass() {
	   System.out.println("This is cars test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("End of cars");
  }
  
  @Test(groups={"BMW","SUV"})
  public void bmwx3(){
	  System.out.println("bmwx3");
  }
  @Test(groups={"BMW","SUV","Premium"})
  public void bmwx5(){
	  System.out.println("bmwx5");
  }
  @Test(groups={"AUDI","Sedan"})
  public void audia4(){
	  System.out.println("Audi A4");
  }
  @Test(groups={"AUDI","Sedan","Premium"})
  public void audia8(){
	  System.out.println("Audi A8");
  }
  
  @Test(groups={"AUDI","SUV"})
  public void audiq5(){
	  System.out.println("Audi Q5");
  }
  
  @Test(groups={"AUDI","SUV","Premium"})
  public void audiq7(){
	  System.out.println("Audi Q7");
  }
  
 @Test(groups={"Honda","Sedan"})
  public void hondacity(){
	  System.out.println("Honda City");
  }
  
 @Test(groups={"Hyundai","Hatch"})
  public void hyundaii10(){
	  System.out.println("Hyundai I10");
  }
  
  @Test(groups={"Suzuki","Hatch"})
  public void altok10(){
	  System.out.println("Alto k10");
  }

}
