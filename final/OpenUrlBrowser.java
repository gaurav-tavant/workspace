package util;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlBrowser {
	
	//WebDriver driver; 
	
	public WebDriver openBrowser(WebDriver driver) throws InterruptedException, IOException {
		ReadExcel browserUrl=new ReadExcel();
		String browserName=browserUrl.readBrowser();
		String urlName=browserUrl.readUrl();
		System.out.println(browserName+" "+urlName);
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "sources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().setPosition(new Point(300,10));
		Thread.sleep(1000);
		driver.get(urlName);
		Thread.sleep(1000);
		}
		return driver;
	}
	
	public void closeBrowser(WebDriver driver) throws InterruptedException {
		
		driver.close();
		
	}
}