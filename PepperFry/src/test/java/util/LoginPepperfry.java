package util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPepperfry {
	
	public WebDriver userLogin(WebDriver driver, WebDriverWait wait) throws InterruptedException, IOException {
		wait=new WebDriverWait(driver, 20);
		//WebElement loginLink=driver.findElement(By.linkText("Login"));
		//wait.until(ExpectedConditions.visibilityOf(loginLink));
		try {
			Thread.sleep(500);
			if (driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")).isDisplayed()) {
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
				driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.linkText("Login")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]"))));
		ReadExcel userData=new ReadExcel();
		String userCred=userData.readUserCredentials();
		String[] idPwd=userCred.split("~");	
		try {
			Thread.sleep(500);
			if (driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")).isDisplayed()) {
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
				driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
		driver.findElement(By.name("user[new]")).sendKeys(idPwd[0]);
		try {
			Thread.sleep(500);
			if (driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")).isDisplayed()) {
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
				driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.name("password")).sendKeys(idPwd[1]);
		try {
			Thread.sleep(500);
			if (driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")).isDisplayed()) {
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
				driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.name("logSubmit")).click();
		Thread.sleep(1000);
		return driver;		
	}
	
	public WebDriver verifyLoginAction(WebDriver driver, String expectedName) {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Hi Gaurav')]")).getText(), expectedName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return driver;	
	}

}
