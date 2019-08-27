// Go to What's more section, and select -"Gift Registry", write the script to automate the process to register the - gift registry for 5 different events. Pick data for it from excel.
package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gift_registry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait for login link to be visible
		WebElement login = driver.findElement(By.linkText("Login"));
		wait.until(ExpectedConditions.visibilityOf(login)); // explicit wait- dynamic wait/
		driver.findElement(By.linkText("Login")).click();
		// handle the ad iframe //input[starts-with(@id,'reportcombo')
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		// fill in credentials
		driver.findElement(By.name("user[new]")).sendKeys("sk@demo.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("logSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'What’s More')]")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='page']/header/div[@class='container']/div[contains(@class,'header-ext-wrap')]/div[@class='headerMiddleNav']/div[@id='headerUserArea']/div[@class='pf-col sm-10 md-10 pf-right pf-margin-top']/div[@class='middle_right']/div[@id='main_navigation_menu']/div[@id='megamenu']/div[@id='nav_whats_more']/div[@class='hd-whats-more-cont']/div[@class='hd-whats-more-list']/a[3]/span[1]"))
				.click();
		driver.findElement(By.xpath("//a[@class='gr-banner-create-btn font-16 pf-center']")).click();
		Select eventtype = new Select(driver.findElement(By.name("eventType")));
		eventtype.selectByIndex(1);
		driver.findElement(By.xpath("//input[@placeholder='John Weds Jane']")).sendKeys("Anniversary Registry");
		driver.findElement(By.name("eventDescription")).sendKeys("Registry for Anniversary");
		// Select Start Date
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]"))
				.click();
		String date = "15";
		WebElement dateWidget = driver.findElement(By.id("grEventDateCalender"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			if (cell.getText().equals(date)) {
				cell.click();
				break;
			}
			Thread.sleep(1000);

		}
		driver.findElement(By.xpath("//a[@class='gr-date-popup-proceed-btn font-12 pf-bold-txt']")).click();
		Thread.sleep(1000);
		// Select End Date
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/input[1]"))
				.click();
		String date2 = "25";
		WebElement enddateWidget = driver.findElement(By.id("grEndDateCalender"));
		List<WebElement> columns2 = enddateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns2) {
			if (cell.getText().equals(date2)) {
				cell.click();
				break;
			}
			Thread.sleep(1000);

		}
		driver.findElement(By.xpath(
				"//div[@id='grEndDatePopup']//a[contains(@class,'gr-date-popup-proceed-btn font-12 pf-bold-txt')][contains(text(),'SELECT')]"))
				.click();
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='crGrForm']//a[@id='crgr_submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='crgrForMeForm']//a[@id='crgr_submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='grAddAddrForm']//input[@placeholder='e.g Akshay Kumar']"))
				.sendKeys("SK");
		driver.findElement(By.xpath("//form[@id='grAddAddrForm']//input[contains(@placeholder,'9582025112')]"))
				.sendKeys("9876533122");
		driver.findElement(By.id("postcode")).sendKeys("110001");
		driver.findElement(By.name("addressAddShip")).sendKeys("Test Address");
		driver.findElement(By.id("city")).sendKeys("Delhi");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.id("selectGRState")));
		dropdown.selectByValue("Delhi");
		driver.findElement(By.xpath("//a[@id='grAddAddrsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		if(driver.getPageSource().contains("Congratulations")){
			System.out.println("Success");
		}
		//if (driver.findElement(By.xpath("//div[@class='owr-gr-lp-success-wrap']")))

	}
}