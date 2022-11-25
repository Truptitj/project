package testNGadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
  @Parameters({ "browser" })
  @Test
  public void testCaseOne(String browser) {
	  System.out.println("Browser name is :"+browser);
  }
  
  @Parameters({"username","password"})
  @Test
  public void testCaseTwo(String username, String password) {
	  System.out.println("Parameter for Username passed as :"+username);
	  System.out.println("Parameter for Password passed as :"+password);
  }
  
  @Parameters({"browser","username","password"})
  @Test
  public void testCaseThree(String browser, String username, String password) {
	  System.out.println("Browser name is :"+browser);
	  System.out.println("Parameter for Username passed as :"+username);
	  System.out.println("Parameter for Password passed as :"+password);
}
  
  @Parameters({"browser","username","password"})
  @Test
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
  }









