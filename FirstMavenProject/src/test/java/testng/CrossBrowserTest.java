package testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CrossBrowserTest {
	String url = "https://www.travelocity.com";
	String node = "http://vinzy16:4c889904-bb10-4aa7-8887-02fff267e974@ondemand.saucelabs.com:80/wd/hub";
	String name = "nls_ff_12345";
	WebDriver driver;

@Parameters({"browserType","env"})
  @BeforeClass
  public void beforeClass(String browserType, String env) {
	Reporter.log("inside before class");
	DesiredCapabilities cap = null;
		if(browserType.equals("firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
		}
		else if(browserType.equals("chrome")){
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
		}
		
		if(env.equals("mac"))
		cap.setPlatform(Platform.MAC);
		else
		cap.setPlatform(Platform.WINDOWS);
		
		Random r = new Random(1000);
		name = name + r.nextLong();
		cap.setCapability("name", name);
		
		try {
			driver = new RemoteWebDriver(new URL(node), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("before class done " + browserType);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class done " );
	  driver.quit();
  }
  
  @Test
  public void f() {
	  Reporter.log("inside test class done " );
	  String title =  driver.getTitle();
	  System.out.println(title);
	  Assert.assertTrue(true);
  }

}
