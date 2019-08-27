package Day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDow {
 static	int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://5elementslearning.com/demosite/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Continue")).click();
	
		Select dropDown=new Select(driver.findElement(By.name("country")));
		
		dropDown.selectByValue("50");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByVisibleText("India");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByIndex(238);
		System.out.println(dropDown.getFirstSelectedOption().getText());
	
		List<WebElement> countryList=dropDown.getOptions();
		
		for(WebElement conList:countryList){
			
			//System.out.println(conList.getText());
			if(conList.getText().equals("India")) 
			{
				System.out.println("country found at index "+count);
			}
			else {
				count++;
				continue;
			}	
			
		}	
	}
}
