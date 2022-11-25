package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGWebScript {
  @Test
  public void testcase1() {
	  System.setProperty("webdriver.chrome.driver", 
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.ecatering.irctc.co.in/");
	  
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
String Expectedtitle="Home | eCatering IRCTC: Order Food on Train Online, Food and Meal on Train, Tasty Food for Train Journey"; 
	  		;
	  Assert.assertEquals(actualtitle, Expectedtitle);
	  WebElement searchTrain=driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
	  Assert.assertTrue(searchTrain.isDisplayed(), "Train search input field is not visible"); 
	  driver.close();
  }
}
