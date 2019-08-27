package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListDemo {

    By AlertAd=By.xpath("//iframe[starts-with(@name,'notification-frame-')]");
    By Adclose=By.xpath("//span[@class='wewidgeticon we_close icon-large']");
              public static void main(String[] args) throws InterruptedException {
                             System.setProperty("webdriver.chrome.driver", "sources\\\\chromedriver.exe");
                             WebDriver driver=new ChromeDriver();
                            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                             driver.get("https://www.pepperfry.com/");
                             driver.manage().window().maximize();
                             WishListDemo login = new WishListDemo();
                             login.Login(driver);
                             AddToWishList(driver,"Yoga Mats");
                             

              }
              
            
              
              public void Login(WebDriver driver) throws InterruptedException
              {
                             //driver.findElement(By.xpath("//a[text()='Login']"));
                            driver.findElement(By.xpath("//b[contains(text(),'Login')]")).click();
                             //driver.findElement(By.xpath("//input[@type='text' and @name='user[new]']"))driver.
                             Thread.sleep(5000);
                             Actions action=new Actions(driver);
                             
                             
                         //    driver.switchTo().frame("notification-frame-~197156b7b");
                      //      WebElement close=driver.findElement(By.xpath("//div[@class='close']"));
                       //      action.moveToElement(close).click().build().perform();
                      //       driver.switchTo().defaultContent();
                             try {
                     			if(driver.findElement(AlertAd).isDisplayed()) {
                     				driver.switchTo().frame(driver.findElement(AlertAd));
                     				
                     				driver.findElement(Adclose).click();
                     				
                     				Thread.sleep(1000);
                     	    		driver.switchTo().defaultContent();
                     				
                     				//driver.switchTo().frame();
                     				WebElement email=driver.findElement(By.xpath("//input[@type='text' and @name='user[new]']"));
                                    action.moveToElement(email).click().sendKeys("gaurav@yopmail.com").build().perform();
                                    driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("abc@123");
                     				
                     	    		//click();
                     	    		
                     	    		}
                     		} catch (Exception e) {
                     			// TODO: handle exception
                     		}
                             driver.findElement(By.name("logSubmit")).click(); //input[@id='popup_login_form']"));
                             Thread.sleep(5000);
                             //action.moveToElement(submit).click().build().perform();
              }
              
              public static void AddToWishList(WebDriver driver, String itemType) throws InterruptedException
              
              {    
                             Thread.sleep(2000);
                             WebElement search=driver.findElement(By.id("search"));
                            driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
                             WebDriverWait  wait=new WebDriverWait(driver,10);
                             wait.until(ExpectedConditions.visibilityOf(search));
                            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                             Actions action=new Actions(driver);
              action.moveToElement(search).click().sendKeys(itemType).sendKeys(Keys.ENTER).build().perform();
                             Thread.sleep(2000);
                             List <WebElement> items=driver.findElements(By.xpath("//*[@class='clip-dtl-ttl row']//a"));
                             Thread.sleep(2000);
                             List<WebElement> wishlisticon= driver.findElements(By.xpath("//a[@class='clip-heart-icn pf-right']"));
              action.moveToElement(items.get(0)).moveToElement(wishlisticon.get(0)).click().build().perform();
                             ArrayList <String> itemName=new ArrayList<String>();
                  String title1=items.get(0).getAttribute("title");
                            itemName.add(title1);
                             
              /*action.moveToElement(items.get(0)).moveToElement(wishlisticon.get(0)).click().build().perform();
              action.moveToElement(items.get(0)).moveToElement(wishlisticon.get(0)).click().build().perform();
              action.moveToElement(items.get(0)).moveToElement(wishlisticon.get(0)).click().build().perform();
              action.moveToElement(items.get(0)).moveToElement(wishlisticon.get(0)).click().build().perform();*/
                             /*search.click();
                             search.sendKeys(itemType);
                             search.sendKeys(Keys.ENTER);*/
                             
                             WebElement mainMenu=driver.findElement(By.partialLinkText("Hi"));
                             mainMenu.click();
                             WebElement wishList=driver.findElement(By.linkText("My Wishlist"));
                             wishList.click();
                             List<WebElement> wishItems=driver.findElements(By.xpath("//div[@class='tab-inner-content ']"));
                             for(int i=0;i<wishItems.size();i++)
                                           
                             {
                                           if (wishItems.get(i).getText().contains(itemName.get(0).trim()))
                                                                        System.out.println("Item Found");
                                                                        
                             }
                             
                             
                             
                             
                             
                             
              }

}
