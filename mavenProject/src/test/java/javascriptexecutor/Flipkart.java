package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Flipkart {
  @Test
  public void loginFlipkart() {
	  SeleniumUtility m1=new SeleniumUtility();
		WebDriver driver=m1.setUp("Chrome", "https://www.flipkart.com/");
		WebElement login =driver.findElement(By.cssSelector("body"));
		login.sendKeys(Keys.ESCAPE);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Vertical scrolling
		js.executeScript("window.scrollBy(0,2500)");
		
		//Horizontal scrolling
		js.executeScript("window.scrollBy(500,0)");
		//js.executeScript("window.scrollBy(0,-500)");

  }
}
