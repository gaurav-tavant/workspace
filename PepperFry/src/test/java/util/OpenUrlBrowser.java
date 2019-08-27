package util;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrlBrowser {
	
	//private String BROWSER;
	
	public WebDriver openBrowser(WebDriver driver) throws InterruptedException, IOException {
		ReadExcel browserUrl=new ReadExcel();
		String browserName=browserUrl.readBrowser();
		String urlName=browserUrl.readUrl();
		System.out.println(browserName+" "+urlName);
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "sources\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().setPosition(new Point(300,10));
		Thread.sleep(1000);
		driver.get(urlName);
		Thread.sleep(1000);
		}
		if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "sources\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().setPosition(new Point(300,10));
		Thread.sleep(1000);
		driver.get(urlName);
		Thread.sleep(1000);
		}
		return driver;
	}
	
	
	/*public WebDriver openBrowser(WebDriver driver) throws InterruptedException, IOException {
		ReadExcel browserUrl=new ReadExcel();
		//String browserName=browserUrl.readBrowser();
		String urlName=browserUrl.readUrl();
		System.out.println(BROWSER+" "+urlName);
		if(BROWSER.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "sources\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().setPosition(new Point(300,10));
		Thread.sleep(1000);
		driver.get(urlName);
		Thread.sleep(1000);
		}
		if(BROWSER.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver", "sources\\geckodriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().setPosition(new Point(300,10));
		Thread.sleep(1000);
		driver.get(urlName);
		Thread.sleep(1000);
		}
		return driver;
	}
	*/
	
	public void closeBrowser(WebDriver driver) throws InterruptedException {
		
		driver.close();
		
	}
}