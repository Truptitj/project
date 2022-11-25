package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ExcelUpdate {
  @Test
  public void UpdateCellDetails() throws IOException {
	  //create instance of fis class and pass the excel location
	  FileInputStream fis = new FileInputStream 
			  ("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
	  
	  //create instance of workbook class and pass fis
	  Workbook workbook = new XSSFWorkbook(fis);
	  
	  //get thr required sheet from excel
	  Sheet sheet = workbook.getSheet("Sheet1");
	  
	  //get specific row from sheet
	  Row row =sheet.getRow(2);
	  
	  //create cell to update the data
	  org.apache.poi.ss.usermodel.Cell cell=row.createCell(3);
	  cell.setCellValue("passed");
	  
	  //to store the data find location of excel
	  FileOutputStream fos = new FileOutputStream
			  ("E:\\\\accelration\\\\Newfolder\\\\mavenProject\\\\AppData\\\\New Microsoft Office Excel Worksheet.xlsx");
	  //write the content into the required file
	  workbook.write(fos);
	  //close the connection
	  fos.close();
	  System.out.println("file updated.......");
  }
}
