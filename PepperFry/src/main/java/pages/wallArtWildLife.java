package pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wallArtWildLife {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "sources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.pepperfry.com/ ");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20); // wait for login link to be visible
		WebElement login = driver.findElement(By.linkText("Login"));
		wait.until(ExpectedConditions.visibilityOf(login)); // explicit wait- dynamic wait/
		driver.findElement(By.linkText("Login")).click();
		// handle the ad iframe //input[starts-with(@id,'reportcombo')
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'notification-frame-')]")));
		driver.findElement(By.xpath("//span[@class='wewidgeticon we_close icon-large']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		// fill in credentials
		driver.findElement(By.name("user[new]")).sendKeys("gaurav@yopmail.com ");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.name("logSubmit")).click();
		Thread.sleep(1000);
		
		
		WebElement dept = driver.findElement(By.className("hd-meta-dept"));
		dept.click();
		WebElement wallart = driver.findElement(By.linkText("Wall Art"));
		act.moveToElement(wallart).perform();
		WebElement floral = driver.findElement(By.linkText("Wild life"));
		act.moveToElement(floral).click().build().perform();

		driver.findElement(By.xpath("//*[@id=\"curSortType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sortBY\"]/li[3]/a")).click();
		System.out.println("Total Product searched ==> "
				+ driver.findElements(By.xpath("//div[@id='productView']/div/div/div/div")).size() + "\n");

		List<WebElement> prodFloral = driver.findElements(By.xpath("//a[@class='clip-prd-dtl']"));
		List<WebElement> Prices = driver
				.findElements(By.xpath("//div[@id='productView']/div/div/div/div/div/div[5]/div/span[1]"));

		int rowNum = 1;
		int colnum = 0;
		wallArtWildLife.setExcelFile("sources\\productDetails.xlsx", "case2");
		wallArtWildLife.setCellData("Name", 0, 0);
		wallArtWildLife.setCellData("Price", 0, 1);

		for (int i = 0; i < 5; i++) {
			String name = prodFloral.get(i).getText();
			String Price = Prices.get(i).getText();
			wallArtWildLife.setCellData(name, rowNum, colnum);
			wallArtWildLife.setCellData(Price, rowNum, colnum + 1);
			rowNum++;
		}
		wallArtWildLife.saveFile("sources\\productDetails.xlsx");
		
		System.out.println("Please find TOP 5 searched products details in datasets\\productDetails.xlsx");
		WebElement hoverLgnBl = driver.findElement(By.xpath("//li[@class='login-block']"));
		act.moveToElement(hoverLgnBl).perform();
		WebElement logoutLnk = driver.findElement(By.linkText("Logout"));
		act.moveToElement(logoutLnk).click().build().perform(); // Thread.sleep(1000);
		
		driver.quit();
		System.out.println("TC PASS");
	}

	// This method is to set the File path and to open the Excel file
	// Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	}

	// This method is to read the test data from the Excel cell
	// In this we are passing parameters/arguments as Row Num and Col Num
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = "";
		// Cell.get
		CellData = Cell.getStringCellValue();
		return CellData;
	}

	// writing to the cell object
	public static void setCellData(String data, int RowNum, int ColNum) throws Exception {
		try {
			XSSFRow Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum);
			if (Cell == null) { // Cell was never used
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(data);
			} else {
				Cell.setCellValue(data);
			}
		} catch (Exception e) {
			throw (e);
		}
	}

	public static void saveFile(String Path) throws IOException {
		try {
			FileOutputStream fileOut = new FileOutputStream(Path);
			ExcelWBook.write(fileOut);
			fileOut.close();
		} catch (IOException e) {
			throw (e);
		}
	}

}
