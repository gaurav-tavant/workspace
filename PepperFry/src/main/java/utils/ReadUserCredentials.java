package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadUserCredentials {

		XSSFWorkbook workbook;
		XSSFSheet sheet;
		public String readUserCredentials() throws IOException {
			workbook=new XSSFWorkbook("sources//BrowserUrl.xlsx");
			sheet=workbook.getSheet("userlogin");
			String username=sheet.getRow(0).getCell(0).getStringCellValue();
			String password=sheet.getRow(0).getCell(1).getStringCellValue();
			workbook.close();
			//FileInputStream fos=new FileInputStream("sources//BrowserUrl.xlsx");
			//fos.close();
			return username+"~"+password;
		}
}
