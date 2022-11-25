package switschstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingWindow2 {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://erail.in/");
		//get homepage unique id
		String homePageId=driver.getWindowHandle();
		System.out.println("HomePage window id:"+homePageId);
		
		//click on eCatering
		WebElement eCatering=driver.findElement(By.xpath("//a[text()='eCatering']"));
		eCatering.click();
		
		//Search Train and search 12627 
		WebElement Train=driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
		Train.click();
	}

}
