package scenarios;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WishList {
	
	static List<String> productName = new ArrayList<String>();

	public WebDriver addToWishlist(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		
		System.out.println("Executing add wishlist");

		Thread.sleep(1000);
		driver.findElement(By.id("search")).sendKeys("mixer");
		driver.findElement(By.id("searchButton")).click();

		Thread.sleep(1000);
		//List<WebElement> listOfProductList = driver.findElements(By.xpath("//div[@class='clip-crd-10x11 pf-white srch-rslt-bxwrpr']"));
		List<WebElement> listOfProductName = driver.findElements(By.xpath("//div[@class='pf-col xs-12']/h2/a"));
		List<WebElement> wishlistIcon = driver.findElements(By.xpath("//a[@class='clip-heart-icn pf-right']"));
		
		Thread.sleep(1000);
		for (int i = 0; i < 4; i++) {

			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listOfProductList.get(i));
			String prodName = listOfProductName.get(i).getText();
			wait.until(ExpectedConditions.elementToBeClickable(wishlistIcon.get(i)));
			// wait.until(ExpectedConditions.visibilityOfAllElements(wishlistIcon.get(i)));
			Thread.sleep(1000);
			wishlistIcon.get(i).click();
			String[] name=prodName.split("\\(");			
			System.out.println("Adding item "+i+": "+name[0]);
			productName.add(name[0]);
		}
		System.out.println("wish list size -"+productName.size());
		return driver;
	}

	public WebDriver validateWishlist(WebDriver driver) throws InterruptedException {

		System.out.println("Executing validate wishlist");
		driver.findElement(By.xpath("//*[@id=\"headerUserArea\"]/div[2]/div/div[3]/div[2]/a")).click();
		//driver.findElement(By.xpath("//a[@class='pf-icon pf-icon-heart header_tab wistlist_img pending_alert active']")).click();
		Thread.sleep(1000);
		List<WebElement> wishItems = driver.findElements(By.xpath("//div[@class='item_details']/p/a"));
		List<String> wishListName = new ArrayList<String>();
		
		//for (WebElement webElement : wishItems) {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
			Thread.sleep(1000);
			System.out.println("wish list size -"+wishItems.size());
			for(int i=0; i<wishItems.size();) {
				String name=wishItems.get(i).getText();
				//String name = webElement.getText();
				String[] prodName=name.split("\\(");
				//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
				System.out.println("Reading item "+i+": "+prodName[0]);
				wishListName.add(prodName[0]);
				i++;
			}
		//}
		
		System.out.println("Wishlist print "+wishListName);
		System.out.println("Productlist print "+productName);
		for (int i = 0; i < productName.size(); i++) {
			Assert.assertEquals(wishListName.get(i).toString(), productName.get(i).toString());
			//Assert.assertTrue(wishListName.contains(productName.get(i)), "Item not Found: " + productName.get(i).trim());
		}
		return driver;		
	}

	public WebDriver emptyWishlist(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		
		driver.manage().window().maximize();
		System.out.println("Executing empty wishlist");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"headerUserArea\"]/div[2]/div/div[3]/div[2]/a"))));
		driver.findElement(By.xpath("//*[@id=\"headerUserArea\"]/div[2]/div/div[3]/div[2]/a")).click();
		Thread.sleep(1000);
		List<WebElement> wishList = driver.findElements(By.xpath("//div[@class='item_card_wrapper']/div/div/div[@class='item_details']/div[@class='item_cta']/div/a[@class='deleteicon']"));
		List<WebElement> addedWishListElementName = driver.findElements(By.xpath("//div[@class='item_details']/p[@class='item_title pf-bold-txt']/a"));

		int i = 0;
		for (WebElement element : wishList) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(1000);
			System.out.println(addedWishListElementName.get(i).getText());
			element.click();
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='gb-close pf-icon pf-icon-close']")).click();
		return driver;		
	}
}
