package Day6;

import org.openqa.selenium.*;
public class POMExample {

	WebDriver driver;
	
	public POMExample(WebDriver drive) {
		this.driver=drive;
		}
	
	//Locator objects
	By myAccount=By.linkText("My Account");
	By userTxt=By.name("email_address");
	By passTxt=By.name("password");
	By submitBtn=By.id("tdb5");
	
	public POMExample clickAcc() {
		driver.findElement(myAccount).click();
		return this;
	}
	
	public POMExample txtUser(String user) {
		driver.findElement(userTxt).sendKeys(user);
		return this;		
	}

	public POMExample txtPass(String pwd) {
		driver.findElement(passTxt).sendKeys(pwd);
		return this;		
	}
	
	public POMExample clickSignin() {
		driver.findElement(submitBtn).click();
		return this;
	}
	
	public POMExample loginAcc(String user, String pwd) {
		clickAcc();
		txtUser(user);
		txtPass(pwd);
		return clickSignin();
	}
}
