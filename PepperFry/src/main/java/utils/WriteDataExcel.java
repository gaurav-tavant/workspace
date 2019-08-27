package utils;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public void writeData(String data, int rowID, int cellID) throws IOException {
		
		InputStream inputFile=new FileInputStream("sources//writedata.xlsx");
		System.out.println(data+" "+rowID+" "+cellID);
		workbook=(XSSFWorkbook) WorkbookFactory.create(inputFile);
		//workbook=new XSSFWorkbook("sources//writedata.xlsx");
		//sheet=workbook.getSheetAt(0);
		if(workbook.getSheet("Wildlife")==null) {
		sheet=workbook.createSheet("Wildlife");
		row=sheet.createRow(rowID);
		//cell=row.createCell(cellID);
		//cell.setCellType(cell.CELL_TYPE_STRING);
		 //row=sheet.getRow(rowID);
		//cell=row.getCell(cellID);
		
		if (cell == null) { // Cell was never used
			
            cell = row.createCell(cellID);
            cell.setCellValue(data);
            System.out.println(cell.getStringCellValue()+" null-if");
            } 
		else 
            {
                cell.setCellValue(data);
                System.out.println(cell.getStringCellValue()+" null-else");
            }
		}
		else {
			sheet=workbook.getSheet("Wildlife");
			row=sheet.createRow(rowID);
			if (cell == null) { // Cell was never used
				
	            cell = row.createCell(cellID);
	            cell.setCellValue(data);
	            System.out.println(cell.getStringCellValue()+" wildlife-if");
	            } 
			else 
	            {
	                cell.setCellValue(data);
	                System.out.println(cell.getStringCellValue()+" wildlife-else");
	            }
		}
	}
	
	public void saveFile() throws IOException{
			 
			FileOutputStream fos = new FileOutputStream("sources//writedata.xlsx");
			workbook.write(fos);
			//workbook.close();
			fos.flush();
            fos.close();
	}	
}
