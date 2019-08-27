package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://5elementslearning.com/demosite/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("99999@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("11111");
		driver.findElement(By.id("tdb5")).click();
		if(driver.getPageSource().contains("My Account Information")) {
			System.out.println("Logged in sucessfully");
		}
		driver.findElement(By.linkText("View or change my account information.")).click();
		boolean bool1=driver.findElement(By.name("gender")).isSelected();
		if(bool1) {
			System.out.println("Male");
		}
		else {
			System.out.println("Female");
		}
		String lname=driver.findElement(By.name("lastname")).getAttribute("value");
		System.out.println(lname);
		driver.findElement(By.name("telephone")).clear();
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		driver.findElement(By.id("tdb5")).submit();
		if(driver.getPageSource().contains("Your account has been successfully updated.")) {
			System.out.println("Profile udated sucessfully");
		}
		else {
			System.out.println("Profile not upated");
		}
		
		driver.findElement(By.id("tdb4")).click();
		//5ElementsLearning
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("5ElementsLearning")){
			System.out.println("Logged out sucessfull");
		}
		else {
			System.out.println("Not logged out");
		}		
	}
}
