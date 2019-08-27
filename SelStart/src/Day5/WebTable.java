package Day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://5elementslearning.com/demosite/");

		WebElement webTable=driver.findElement(By.tagName("table"));
		List<WebElement> Rows=webTable.findElements(By.xpath("//*/tbody/tr"));
		System.out.println("total rows " + Rows.size());
		int rowIndex=1;
		
		for(WebElement rowElement:Rows) {
			List<WebElement> Cols=rowElement.findElements(By.xpath("td"));
			System.out.println("total cols "+ Cols.size());
			
			int colIndex=1;
			for(WebElement colElement:Cols) {
				System.out.println("Rows "+rowIndex+" Cols "+colIndex+" Data "+colElement.getText());
				colIndex=colIndex+1;
			}
			rowIndex=rowIndex+1;
		}
		
	}

}
