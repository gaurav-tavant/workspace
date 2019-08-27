package Day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestPom {
 
	WebDriver driver;
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void loginLogout() {
		driver.get("http://5elementslearning.com/demosite/");	
		POMExample login=new POMExample(driver);
		POMLogout logout=new POMLogout(driver);
		login.loginAcc("abc@demo.com", "demo@123");
		if(driver.getPageSource().contains("My Account Informatio")) {
			Assert.assertTrue(true, "Valid user");
			logout.callLogOff();
		}
		else {
			Assert.fail("Invalid user");
		}

  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
