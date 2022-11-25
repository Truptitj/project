package switschstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingFrame {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("Chrome", "https://jqueryui.com/");
		//TestCase
		//Identify frame
		//WebElement frameObject=driver.findElement(By.cssSelector(".demo-frame")   
		//switch your control from main page to frame
		//driver.switchTo.(frameObject)
		      //or instead of WebElement user index to switch
		
		WebElement droppable=driver.findElement(By.xpath("//a[text()='Droppable']"));
		droppable.click();
		driver.switchTo().frame(0);
		
		//now identify element perform required operation
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.moveToElement(src).dragAndDrop(src, target).build().perform();
		
		//switch back to mainpage
		driver.switchTo().defaultContent();
		//click on logo
		WebElement logo=driver.findElement(By.className("logo"));
		logo.click();
	}

}
