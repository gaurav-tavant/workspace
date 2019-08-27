package scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VerifyCart {
	
	static float totalCartAmount=0;
	
	public WebDriver addToCart(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		
		driver.manage().window().maximize();
		System.out.println("Executing AddToCart");
		Thread.sleep(1000);
   		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 350)", "");
   		String [] prodPrice = new String[3];
   		driver.findElement(By.xpath("//div[@class='container hp-whats-popular-section']/div[@class='row']/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
   		Thread.sleep(1000);
   		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)", "");
  		//try {
   			Actions act = new Actions(driver);
   			for(int i=1;i<3;i++){
   				//Read product amount
        		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[5]/div/span[1]")));
        		prodPrice[i]= driver.findElement(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[5]/div/span[1]")).getText();
        		System.out.println("product amount on page "+prodPrice[i]);
        		float productPrice=Float.parseFloat(prodPrice[i].replaceAll("\\D+","").trim());
        		System.out.println(productPrice);
        		totalCartAmount=totalCartAmount+productPrice;
        		Thread.sleep(1000);
        		//Adding product to cart
        		//System.out.println(driver.findElement(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[1]/div/a")).isDisplayed());
        		//System.out.println(driver.findElement(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[1]/div/a")).isEnabled());
        		//System.out.println(driver.findElement(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[1]/div/a")).isSelected());
        		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[1]/div/a")));
        		act.moveToElement(driver.findElement(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25 clipprods']["+i+"]/div/div[1]/div/a"))).click().build().perform();
        		Thread.sleep(1000);
        		try {
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='gb-close pf-icon pf-icon-close']")));
            		driver.findElement(By.xpath("//a[@class='gb-close pf-icon pf-icon-close']")).click();	
				} catch (Exception e) {
					// TODO: handle exception
				}        		
        		Thread.sleep(500); 
   			}
   			System.out.println("Total value added to cart "+totalCartAmount);
	//	} catch (Exception e) {
			// TODO: handle exception
		//}
		return driver;		
	}//addToCart Ends
	
	public WebDriver compartCartPrice(WebDriver driver, WebDriverWait wait) {
    	((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/a[@class='pf-icon pf-icon-cart2 header_tab cart']")));
    	driver.findElement(By.xpath("//div/a[@class='pf-icon pf-icon-cart2 header_tab cart']")).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='minicart_footer']/a")));
    	driver.findElement(By.xpath("//div[@class='minicart_footer']/a")).click();
    	String payAmount=driver.findElement(By.id("total_pay_coupon")).getText();
    	float payableAmount=Float.parseFloat(payAmount.replaceAll("\\D+","").trim());
    	//print both amount
    	System.out.println(totalCartAmount+"   "+payableAmount);
    	//Assert.assertEquals(payableAmount, totalCartAmount);
		return driver;		
	}
	
	public WebDriver emptyCart(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		Thread.sleep(1000);
	       List <WebElement> cartdetail = driver.findElements(By.xpath("//form[@name='cart_form']/div"));
	       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)", "");
	       for (int i=cartdetail.size();i<=1;i--) {
	    	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//form[@name='cart_form']/div["+i+"]/div/div/div[3]/div/a[@class='trash']")));
	    	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@name='cart_form']/div["+i+"]/div/div/div[3]/div/a[@class='trash']")));
	    	   driver.findElement(By.xpath("//form[@name='cart_form']/div["+i+"]/div/div/div[3]/div/a[@class='trash']")).click();
	       }
		return driver;
	}

}
