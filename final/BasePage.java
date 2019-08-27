package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

		WebDriver driver;
		Actions act;
	    public WebDriverWait wait;

	    //Constructor
	   
	     public BasePage(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,20);
	    }
	    

	    //Click Method
	    public void click(By elementLocation) {
	        driver.findElement(elementLocation).click();
	    }

	    //Write Text
	    public void setText(By elementLocation, String text) {
	        driver.findElement(elementLocation).sendKeys(text);
	    }

	    //Read Text
	    public String getText(By elementLocation) {
	        return driver.findElement(elementLocation).getText();
	    }

	    //Wait
	    public void waitVisibility(By by){
	        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    }
	    
	    public boolean isDisplayed(By by){
	    	waitVisibility(by);
	    	driver.findElement(by).isDisplayed();
	    	return true;	    	
	    }
	    
	    public void waitPresence(By by){
	        wait.until(ExpectedConditions.presenceOfElementLocated(by));
	    }
	    
	    public void switchToFrame(By by){
	        driver.switchTo().frame(driver.findElement(by));
	    }
	    
	    public void moveToElement(By performelement) {

	    	act.moveToElement(driver.findElement(performelement)).perform();
	    }
	    
	    public void moveToElementPerform(By buildelement) {
	    	act.moveToElement(driver.findElement(buildelement)).click().build().perform();
	    }
}