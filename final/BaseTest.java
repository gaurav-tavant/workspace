package tests;

import org.testng.annotations.Test;

import scenarios.RegisterUser;
import scenarios.SortWriteWildlife;
import scenarios.VerifyCart;
import scenarios.WishList;
import util.LoginPepperfry;
import util.OpenUrlBrowser;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	OpenUrlBrowser obj;//=new OpenBrowserUrl();
	static WebDriver driver;
	static WebDriverWait wait;
	/*
	@Test
	public void loginTest() throws InterruptedException {
		SortWriteWildlife obj=new SortWriteWildlife();
		obj.startLogin();
	}
	*/
	@BeforeTest
  public void beforeTest() throws IOException, InterruptedException {
	  
		obj=new OpenUrlBrowser();
		driver=obj.openBrowser(driver);
		wait=new WebDriverWait(driver, 20);
	}
	
	@Test(priority=0, enabled=true)   
	  public void registerTest() throws IOException, InterruptedException {
		RegisterUser registerObj=new RegisterUser();
		driver=registerObj.userRegister(driver);
		driver=registerObj.verifyRegister(driver);
	}

	@Test(priority=0, enabled=false)   
	  public void loginTest() throws IOException, InterruptedException {
		LoginPepperfry loginObj=new LoginPepperfry();
		driver=loginObj.userLogin(driver,wait);
		System.out.println("Login successfull");
		driver=loginObj.verifyLoginAction(driver, "Hi Gaurav");
	}
	
  /*
   @Test(priority=1, enabled=false)   
  public void loginTest() throws IOException, InterruptedException {
	  
	ReadUserCredentials userDetailObj=new ReadUserCredentials();
	LoginPage loginObj=new LoginPage();
	loginObj.userLogin(userDetailObj.readUserCredentials());
	driver=loginObj.verifyLoginAction("Hi Gaurav");
	System.out.println("Pass Login");	
  }
  
  @Test(priority=2, enabled=true)
  public void writeExcel() throws IOException, InterruptedException {
	  
	  BrowseSortWrite browse=new BrowseSortWrite();
	  browse.browseSearch(driver);
	  //BrowseSortWrite browse=new BrowseSortWrite(obj.openbrowserurl());
	  browse.writeExcelData(driver);
  }
  */
  @Test(priority=1)
  public void demoTest () {
	  System.out.println("Pass Demo");
  }  
  
  @Test(priority=1, enabled=false)
  public void testWildLife () throws InterruptedException, IOException {
	  SortWriteWildlife wildlifeObj=new SortWriteWildlife();
	  driver=wildlifeObj.wallartWildlife(driver);
	  driver=wildlifeObj.readData(driver);
  }
  
  @Test(priority=1, enabled=false)
  public void wishList() throws InterruptedException{
	  WishList wishlistObj=new WishList();
	  driver=wishlistObj.emptyWishlist(driver);			  
	  driver=wishlistObj.addToWishlist(driver, wait);
	  driver=wishlistObj.validateWishlist(driver);
  }
  
  @Test(priority=1, enabled=false)
  public void testVerifyCart () throws InterruptedException {
	VerifyCart verifycartObj=new VerifyCart();
	driver=verifycartObj.addToCart(driver, wait);
	driver=verifycartObj.compartCartPrice(driver, wait);  
	driver=verifycartObj.emptyCart(driver, wait);
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
		obj=new OpenUrlBrowser();
		obj.closeBrowser(driver);
  }
	
}