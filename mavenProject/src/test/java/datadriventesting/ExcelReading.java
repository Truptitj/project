package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ExcelReading {
  @Test
  public void readSheetDetails() throws IOException {
	  //create instance of fileInputStream class & pass the required file excel location to constructor
	  FileInputStream fis = new 
			  FileInputStream("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
	  
	  //create instance of workbook class and pass FileInputStream
	  Workbook workbook = new XSSFWorkbook(fis);
	  //get the reuired sheet from excel
	  Sheet sheet = workbook.getSheet("Sheet1");
	  //now get the no of sheet count
	  int SHEETCOUNT=workbook.getNumberOfSheets();
	  System.out.println("sheet count :"+SHEETCOUNT);
	  //now print all the sheet names
	  for(int i=0;i<SHEETCOUNT; i++) {
		  String SHEETNAME=workbook.getSheetName(i);
		  System.out.println("Sheet names :"+SHEETNAME);
		  
	  }
  }
  @Test
  public void getRowDetails() throws IOException {
	//create instance of fileInputStream class & pass the required file excel location to constructor
	  FileInputStream fis = new 
			  FileInputStream("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
	  
	  //create instance of workbook class and pass FileInputStream
	  Workbook workbook = new XSSFWorkbook(fis);
	  //get the required sheet
	  Sheet sheet =workbook.getSheet("Sheet1");
	  //get the row count (eow count=actual count-1)
	  int RowCount=sheet.getLastRowNum();
	  System.out.println("Row Count is :"+RowCount);
	  //get specific row from the sheet
	  Row row =sheet.getRow(1);

 }
  @Test
  public void getCellDetails() throws IOException {
		//create instance of fileInputStream class & pass the required file excel location to constructor
	  FileInputStream fis=new 
			  FileInputStream("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
	  //create instance of workbook class and pass FileInputStream
	  Workbook workbook= new XSSFWorkbook(fis);
	  //get the required sheet
	  Sheet sheet =workbook.getSheet("Sheet1");
	  //get specific row from the sheet
	  Row row = sheet.getRow(1);
	  //get the cellcount from row
	  int cellCount=row.getLastCellNum();
	  System.out.println("Cell count of row is :"+cellCount);
	  //get cell data from row1
		org.apache.poi.ss.usermodel.Cell cell=row.getCell(1);	  
		System.out.println("ROW1 & CELL1 data is:"+cell.getStringCellValue());
		//get all the data from row1
		for(int i=0; i<cellCount; i++) {
			System.out.println("Cell Data is :"+row.getCell(i).getStringCellValue());
		}


  }
  @Test
  	public void getDifferTypeOfCellData() throws IOException {
	//create instance of fileInputStream class & pass the required file excel location to constructor
	  FileInputStream fis=new 
			  FileInputStream("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
	  //create instance of workbook class and pass FileInputStream
	  Workbook workbook= new XSSFWorkbook(fis);
	  //get the required sheet
	  Sheet sheet =workbook.getSheet("Sheet1");
	  //get specific row from the sheet
	  Row row =sheet.getRow(3);
	  //get the cellcount from row
	  int cellCount=row.getLastCellNum();
	  System.out.println("Cell count of row is :"+cellCount);
	  //get all the data from row3
	  for(int i=0; i<cellCount; i++) {
		 // System.out.println("cell data is :"+row.getCell(i).getStringCellValue());
	  
	//org.apache.poi.ss.usermodel.Cell cell=row.getCell(i);
//		  org.apache.poi.ss.usermodel.Cell cell;
//		switch (cell.getCellType()) {
//			case Cell.CELL_TYPE_STRING:
//				return cell.getStringCellValue();
//			case Cell.CELL_TYPE_NUMERIC:
//				return "" + (int) cell.getNumericCellValue();
//			case Cell.CELL_TYPE_BLANK:
//				return "";
	}
	}
  }



//}



