package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMLogout {

	
WebDriver driver;
	
	public POMLogout(WebDriver drive) {
		this.driver=drive;
		}
	
	//Locator objects
	By btnLogout=By.linkText("Log Off");
	By continLogout=By.linkText("Continue");

	public POMLogout clickSignout() {
		driver.findElement(btnLogout).click();
		return this;
	}
	
	public POMLogout clickContinue() {
		driver.findElement(continLogout).click();
		return this;
	}
	
	public POMLogout callLogOff() {
		
		clickSignout();
		return clickContinue();
	}
	
}
