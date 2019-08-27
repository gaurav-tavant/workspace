package SimpleProject.DemoProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutTest {
	
	void chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://5elementslearning.com/demosite/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("99999@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("11111");
		driver.findElement(By.id("tdb5")).click();
		
		if(driver.getPageSource().contains("My Account Information")) {
			System.out.println("Logged in sucessfully, going to log off");
		driver.findElement(By.linkText("Log Off")).click();
		driver.findElement(By.linkText("Continue")).click();
		}
		else {
			System.out.println("Not logged in");
		}
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		LoginLogoutTest obj=new LoginLogoutTest();
		//obj.chrome();
	}

}
