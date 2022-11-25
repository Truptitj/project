package switschstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingAlertPopup {

	public static void main(String[] args) {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//Inspect frame (JavaScript Alert)
		driver.switchTo().frame("iframeResult");
		//Identify Try it
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		System.out.println("Alert message is:"+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

}
