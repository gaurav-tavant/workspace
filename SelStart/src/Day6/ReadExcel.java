package Day6;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;


public class ReadExcel {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	public static void setExcelFile(String path, String sheetame) throws IOException {
		
		FileInputStream excelfile= new FileInputStream(path);
		workbook=new XSSFWorkbook(excelfile);
		sheet=workbook.getSheet(sheetame);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
