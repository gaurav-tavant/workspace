package Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetDriver {
	
	void chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://5elementslearning.com/demosite/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("99999@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("11111");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("tdb")).click();
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
	
	void firefox() {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
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
	
	void ie() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://5elementslearning.com/demosite/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(10000);
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
	
	void FindAtag() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://5elementslearning.com/demosite/");
		List<WebElement> eleList=driver.findElements(By.tagName("a"));
		for(int i=0;i<eleList.size();i++) {
		System.out.println(eleList.get(i).getText());
		System.out.println(eleList.get(i).getAttribute("href"));
		}			
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SetDriver obj=new SetDriver();
		obj.chrome();
		//obj.firefox();
		//obj.ie();
		//obj.FindAtag();
	}

}
