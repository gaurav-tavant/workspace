package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterUser {
	
	static String fname="amit";
	public WebDriver userRegister(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("//a[@id='registerPopupLink']//b[contains(text(),'Register')]")).click();
		Thread.sleep(1000);
		try {
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")).isDisplayed()) {
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
				driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("amit@yopmail.com");
		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys("1234585646");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("gupta");
		driver.findElement(By.name("password1")).clear();
		driver.findElement(By.name("password1")).sendKeys("amit@123");
		driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();;
		//Click signup button
		driver.findElement(By.id("formSubmit-popup_reg_form")).click();
		return driver;		
	}
	
	public WebDriver verifyRegister(WebDriver driver) {
		String winhandle = driver.getWindowHandle();
		driver.switchTo().window(winhandle);
		driver.findElement(By.xpath("//div[@id='offerPopups']//a[@class='popup-close']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Hi amit')]")).getText(), fname);
		return driver;		
	}
}
