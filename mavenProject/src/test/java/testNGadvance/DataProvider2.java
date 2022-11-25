package testNGadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
  @Test(dataProvider="getUserDetails")
  public void loginVtigerApp(String browser, String username, String password) {
	  System.setProperty("webdriver.chrome.driver", 
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);

  }
  
  @DataProvider
  public Object getUserDetails() {
	  Object [][] data =new Object[3][3];
	  data[0][0]="chrome";
	  data[0][1]="admin";
	  data[0][2]="Test@123";

	  data[1][0]="chrome";
	  data[1][1]="admin";
	  data[1][2]="pass123";

	  data[2][0]="";
	  data[2][1]="";
	  data[2][2]="";
	  return data;

	  
  }
}

