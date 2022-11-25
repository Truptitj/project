package switschstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Inspect frame (JavaScript Alert)
		driver.switchTo().frame("iframeResult");
		//Identify Try it
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		System.out.println("Alert message is:"+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		/**
		In order handle any JavaScirpt Pop-up(application specific) we need use driver.switchTo().alert()
		because java script popup doesn't contain HTML code
		we use predefined functions of Alert to perform any operation on it
		after every action control comes back to the main page


		*/
	}

}
