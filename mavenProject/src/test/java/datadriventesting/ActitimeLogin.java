package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActitimeLogin {
  @BeforeTest
  public void getData() throws IOException {FileInputStream fis = new 
  FileInputStream("E:\\accelration\\Newfolder\\mavenProject\\AppData\\New Microsoft Office Excel Worksheet.xlsx");
  Workbook workbook = new XSSFWorkbook(fis);
  Sheet sheet = workbook.getSheet("Sheet1");
  Row appUrl =sheet.getRow(1);
  org.apache.poi.ss.usermodel.Cell cell=appUrl.createCell(0);
  Row username =sheet.getRow(1);
  org.apache.poi.ss.usermodel.Cell cell2=username.createCell(1);
  Row password =sheet.getRow(1);
  org.apache.poi.ss.usermodel.Cell cell3=password.createCell(2);

}
  @Test
  public void actiTimeLogin() {
	  System.setProperty("webdriver.chrome.driver",
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.actitime.com/");
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.name("pwd"));
	  password.sendKeys("manager");
	  WebElement login=driver.findElement(By.id("loginButton"));
	  login.click();
	  Assert.assertEquals(driver.getTitle(), "actiTIME Enter Time-Track");
  }
}
