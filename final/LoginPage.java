package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**Web Elements*/
    By loginLink=By.linkText("Login");
    By usernameID = By.name("user[new]");
    By passwordID = By.name("password");
    By loginSubmit = By.name("logSubmit");
    By AlertAd=By.xpath("//iframe[starts-with(@name,'notification-frame-')]");
    By Adclose=By.xpath("//span[@class='wewidgeticon we_close icon-large']");
    By userName=By.xpath("//a[contains(text(),'Hi Gaurav')]");
    //By logout=By.linkText("Logout");
	
	public String userLogin(String usercredential) throws IOException, InterruptedException {

		String[] details=usercredential.split("~");
		String username=details[0];
		String password=details[1];
		Thread.sleep(500);
		waitVisibility(loginLink);
		click(loginLink);
		//waitVisibility(AlertAd);
		//waitPresence(AlertAd);
		try {
			if(isDisplayed(AlertAd)) {
				switchToFrame(AlertAd);
	    		click(Adclose);
	    		Thread.sleep(1000);
	    		driver.switchTo().defaultContent();
	    		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		//Thread.sleep(1000);
		//waitVisibility(loginLink);
		//click(loginLink);
		Thread.sleep(500);
		setText(usernameID, username);
		setText(passwordID, password);
		click(loginSubmit);
		return null;
	}
	
	public WebDriver verifyLoginAction(String expectedName) {
	
		waitVisibility(userName);
		Assert.assertEquals(getText(userName), expectedName);
		return driver;
		
	}
	
}
