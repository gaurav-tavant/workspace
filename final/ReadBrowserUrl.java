package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadBrowserUrl {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public String readBrowser() throws IOException {
		workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
		sheet=workbook.getSheet("browser");
		String browsername=sheet.getRow(0).getCell(0).getStringCellValue();
		workbook.close();
		//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
		//fos.close();
		return browsername;		
	}
	
	public String readUrl() throws IOException {
		workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
		sheet=workbook.getSheet("url");
		String url=sheet.getRow(0).getCell(0).getStringCellValue();
		workbook.close();		
		//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
		//fos.close();
		return url;
	}	
}
