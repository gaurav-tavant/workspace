package utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowserUrl {

	//WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver openbrowserurl(WebDriver driver) throws IOException, InterruptedException {
		
		ReadBrowserUrl readBrowserUrl=new ReadBrowserUrl();
		String browser=readBrowserUrl.readBrowser();
		String url=readBrowserUrl.readUrl();
		
		if (browser.equals("chrome")) {
			
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
			System.setProperty("webdriver.chrome.driver", "sources\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(1000);
			driver.get(url);
			Thread.sleep(1000);
		}
		return driver;				
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	
}
