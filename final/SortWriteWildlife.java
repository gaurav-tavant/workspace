package scenarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.xssf.usermodel.*;

public class SortWriteWildlife {

	//static WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new WebDriver();
		OpenBrowserUrl openUrl=new OpenBrowserUrl();
		driver = openUrl.openBrowser(driver);
		Login loginObj=new Login();
		driver=loginObj.userLogin(driver);
		SortWriteWildlife obj=new SortWriteWildlife();
		obj.wallartWildlife();
		obj.readData();
	}
	
	public void startLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new WebDriver();
		OpenBrowserUrl openUrl=new OpenBrowserUrl();
		driver = openUrl.openBrowser(driver);
		driver.manage().window().maximize();
		Login loginObj=new Login();
		driver=loginObj.userLogin(driver);
		SortWriteWildlife obj=new SortWriteWildlife();
		obj.wallartWildlife();
		obj.readData();
	}
	*/
	
	public WebDriver wallartWildlife(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		driver.findElement(By.className("hd-meta-dept")).click();
		action.moveToElement(driver.findElement(By.linkText("Wall Art"))).perform();
		Thread.sleep(500);
		action.moveToElement(driver.findElement(By.linkText("Wild life"))).click().build().perform();
		Thread.sleep(500);
		System.out.println("Total Product = "+ driver.findElements(By.xpath("//div[@id='productView']/div/div/div/div")).size() + "\n");
		try {
			driver.findElement(By.className("drpdwn-price-htol")).click();
			driver.findElement(By.xpath("//*/ul[@id='sortBY']/li[3]/a")).click();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}
	
	public WebDriver readData(WebDriver driver) throws IOException {
		List<WebElement> prodName=driver.findElements(By.xpath("//a[@class='clip-prd-dtl']"));
		List<WebElement> prodPrice=driver.findElements(By.xpath("//span[contains(@class,'clip-offr-price')]"));
		for(int i=0;i<5;i++) {
			//System.out.println(prodName.get(i).getText());
			//System.out.println(prodPrice.get(i).getText());
			int j=0;
			int k=1;
			writeData(prodName.get(i).getText(),prodPrice.get(i).getText(), i, j, k);
			//writeData(prodPrice.get(i).getText(), i, k);
			}
		return driver;
	}
	
	public void writeData(String name, String price, int rowno, int  cellno, int cellnu) throws IOException {
		System.out.println(name+" "+price+" "+rowno+" "+cellno+" "+cellnu);
		InputStream inputFile=new FileInputStream("sources//writedata.xlsx");
		workbook=new XSSFWorkbook(inputFile);
		sheet=workbook.getSheetAt(0);
		row=sheet.createRow(rowno);
		if (cell == null) { // Cell was never used
			
            cell = row.createCell(cellno);
            cell.setCellValue(name);
            cell=row.createCell(cellnu);
            cell.setCellValue(price);
            //System.out.println(cell.getStringCellValue()+" if");
            } 
		else 
            {
            cell = row.createCell(cellno);
            cell.setCellValue(name);
            cell=row.createCell(cellnu);
            cell.setCellValue(price);
            //System.out.println(cell.getStringCellValue()+" else");
            }
		FileOutputStream fos=new FileOutputStream("sources//writedata.xlsx");
		workbook.write(fos);
		fos.close();
	}

}
