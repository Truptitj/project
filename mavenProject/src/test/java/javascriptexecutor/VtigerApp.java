package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//TO CLICK ON A BUTTON BY USING JS

public class VtigerApp {
  @Test
  public void loginVtigerApp() {
	  System.setProperty("webdriver.chrome.driver",
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php/");
	  //click on sign-in button
	  WebElement signin=driver.findElement(By.cssSelector(".buttonBlue"));
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].click();", signin);
  }
}
