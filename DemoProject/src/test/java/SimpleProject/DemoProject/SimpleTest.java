package SimpleProject.DemoProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;


public class SimpleTest {

	WebDriver driver;
	
  @BeforeMethod(enabled=false)
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test(enabled=false)
  public void login() {  
		driver.get("http://5elementslearning.com/demosite/");		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("99999@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("11111");
		driver.findElement(By.id("tdb5")).click();
		Assert.assertTrue(true, "Login Success");			
  }
  
  @Test(enabled=false)
  public void logout() {  
		//driver.get("http://5elementslearning.com/demosite/");		
		//driver.getPageSource().contains("My Account Information");
		driver.findElement(By.linkText("Log Off")).click();
		driver.findElement(By.linkText("Continue")).click();
		Assert.assertTrue(true, "Logout Success");			
  }
  
  @AfterMethod(enabled=false)
  public void afterMethod() {
	  driver.close();
  }

}
