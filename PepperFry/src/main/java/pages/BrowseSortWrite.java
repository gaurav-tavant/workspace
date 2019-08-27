package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WriteDataExcel;

public class BrowseSortWrite extends BasePage{

	public BrowseSortWrite(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**Web Elements*/
    By heading1 = By.className("hd-meta-dept");//("//span[@class='hd-meta-dept']");
    By heading2 = By.linkText("Wall Art");  //("//a[@class='hd-submenu-metalist-item current-tab']");
    By heading3 = By.linkText("Wild life"); //("//a[contains(text(),'Wild life')]");
    By sort=By.className("drpdwn-price-htol"); //("//*[@id=\\\"curSortType\\\"]");
    By price=By.xpath("//*/ul[@id='sortBY']/li[3]/a");
    //By AlertAd=By.xpath("//iframe[starts-with(@name,'notification-frame-')]"); //webklipper-publisher-widget-container-notification-frame
    By AlertAd=By.xpath("//iframe[starts-with(@id,'webklipper-publisher-widget-container-notification-frame')]");
    //By Adclose=By.xpath("//span[@class='wewidgeticon we_close icon-large']"); //webklipper-publisher-widget-container-notification-close-div
    By Adclose=By.id("webklipper-publisher-widget-container-notification-close-div");
    
    Actions action;
    WriteDataExcel write=new WriteDataExcel();
	public WebDriver browseSearch(WebDriver driver) throws InterruptedException {
		action=new Actions(driver);
		click(heading1);
		//moveToElement(heading1);
		action.moveToElement(driver.findElement(heading2)).perform();
		//moveToElement(heading2);
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(heading3)).click().build().perform();
		Thread.sleep(1000);  
		//if alert comes move back to default content
		//Scroll Page down - do get away from the Chatwithus window. 


		try {
				switchToFrame(AlertAd);
				System.out.println("chk1");
	    		click(Adclose);
	    		Thread.sleep(500);
	    		driver.switchTo().defaultContent();
	    		
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		try {
			waitVisibility(sort);
			click(sort);
			waitVisibility(price);
			click(price);
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Total Product = "+ driver.findElements(By.xpath("//div[@id='productView']/div/div/div/div")).size() + "\n");
		return driver;
	}
	
	public WebDriver writeExcelData(WebDriver driver) throws IOException {
		
		List<WebElement> prodName=driver.findElements(By.xpath("//a[@class='clip-prd-dtl']"));
		List<WebElement> prodPrice=driver.findElements(By.xpath("//span[contains(@class,'clip-offr-price')]"));
		////span[contains(@class,'clip-offr-price')] //clip-offr-price 
		//write.saveFile();
		for(int i=0;i<2;i++) {
		System.out.println(prodName.get(i).getText());
		System.out.println(prodPrice.get(i).getText());
		write.writeData(prodName.get(i).getText(), i, i);
		write.saveFile();		
		//write.writeData(prodPrice.get(i).getText(), i, i+1);
		//write.saveFile();
		}
		return driver;
	}
	
}
