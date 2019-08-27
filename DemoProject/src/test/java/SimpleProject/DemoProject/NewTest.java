package SimpleProject.DemoProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest {

	WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		report=new ExtentReports("report"+"\\ExtentReportResult.html");
		test = report.startTest("ExtentDemo-LoginLogout test");
  }
  
  @Test
  public void login() throws InterruptedException {  
		driver.get("http://5elementslearning.com/demosite/");		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("99999@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("11111");
		driver.findElement(By.id("tdb5")).click();
		Thread.sleep(50000000);
		if(driver.getPageSource().contains("My Account Information")){
			System.out.println("Login Success");
			//driver.findElement(By.linkText("Log Off")).click();
			//driver.findElement(By.linkText("Continue")).click();
			Assert.assertTrue(true, "Login Success");	
			test.log(LogStatus.PASS, "Login completed success");
		}else {
			System.out.println("Login --- failed");
			test.log(LogStatus.FAIL, "Login not sucess");
			Assert.fail("Incorrect Username Password");
		}
  }
  
 
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  report.endTest(test);
	  report.flush();
  }

}

