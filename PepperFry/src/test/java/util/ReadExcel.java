package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public String readBrowser() throws IOException {
		workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
		sheet=workbook.getSheet("browser");
		String browsername=sheet.getRow(0).getCell(0).getStringCellValue();
		workbook.close();
		//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
		//fos.close();
		//System.out.println(browsername);
		return browsername;		
	}
	
	public String readUrl() throws IOException {
		workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
		sheet=workbook.getSheet("url");
		String url=sheet.getRow(0).getCell(0).getStringCellValue();
		workbook.close();		
		//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
		//fos.close();
		//System.out.println(url);
		return url;
	}	
	
	public String readUserCredentials() throws IOException {
		workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
		sheet=workbook.getSheet("userlogin");
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		String password=sheet.getRow(0).getCell(1).getStringCellValue();
		workbook.close();
		//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
		//fos.close();
		System.out.println(username+"~"+password);
		return username+"~"+password;
	}

	
}
