package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class One {

	public static void main(String[] args) throws InterruptedException {
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
			
			driver.findElement(By.linkText("DVD Movies->")).click();
			driver.findElement(By.linkText("Action")).click();
			driver.findElement(By.linkText("Speed")).click();
			driver.findElement(By.id("tdb4")).click();
			System.out.println("chk1");

			driver.findElement(By.linkText("DVD Movies->")).click();
			driver.findElement(By.linkText("Action")).click();
			driver.findElement(By.linkText("The Matrix")).click();
			driver.findElement(By.id("tdb4")).click();
			System.out.println("chk2");

			driver.findElement(By.linkText("DVD Movies->")).click();
			driver.findElement(By.linkText("Action")).click();
			driver.findElement(By.linkText("Under Siege")).click();
			driver.findElement(By.id("tdb4")).click();
			System.out.println("chk3");

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/input[1]")).clear();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/input[1]")).sendKeys("3");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/input[1]")).clear();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/input[1]")).sendKeys("4");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/input[1]")).clear();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/input[1]")).sendKeys("5");
			
			driver.findElement(By.linkText("Checkout")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[4]/table[1]/tbody/tr/td[2]/input")).click();
			driver.findElement(By.id("tdb6")).click();
			driver.findElement(By.id("tdb5")).click();
			
			
			
			
		}
		else{
			System.out.println("Please login again");
		}	
	}

}
