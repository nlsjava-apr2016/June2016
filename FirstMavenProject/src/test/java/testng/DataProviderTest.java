package testng;

import org.testng.annotations.Test;

import utilities.ExcelUtility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataProviderTest {
  
  @DataProvider(name="empData")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Venkat", "Balaji","netlogic" },
      new Object[] { "Lakshmi", "Venkat","google"},
      new Object[] { "Vinayak", "Shiva","google"},
    };
  }
  
  @DataProvider(name="excelData")
  public Object[][] getExcelData(){
	  return ExcelUtility.getWorksheetData("D:\\junk\\EmpBook.xlsx", "emp");
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
 
  @Test(dataProvider="excelData")
  public void insertEmployee(String fname, String lname, String company) {
	  //Class level method
	  System.out.println(fname+ " " +lname + " - " + company );
  }
  
  @Test(dataProvider="empData")
  public void insertEmployeeData(String fname, String lname, String company) {
	  //Class level method
	  System.out.println(fname+ " " +lname + " - " + company );
  }

}
