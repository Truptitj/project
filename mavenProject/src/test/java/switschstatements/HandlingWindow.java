 package switschstatements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://etrain.info/in");
		
		//get homepage window unique id
		String homePageWinId=driver.getWindowHandle();
		System.out.println("home page window id:"+homePageWinId);
		
		//click on linked in page in new tab
		WebElement linkedIn=driver.findElement(By.className("icon-linkedin"));
		linkedIn.click();
		
		//get all windows unique id
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All windows id:"+allWinIds);
		
		//remove homepage id from all windows id
		allWinIds.remove(homePageWinId);
		System.out.println("After removing homepage id the chield(linked) window id is:"+allWinIds);
		
		//get chield window id using iterator
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		driver.switchTo().window(childWinId);
		//Now u are allow to identify any elements from child window
		System.out.println("LinkedIn page title :"+driver.getTitle());
		System.out.println("LinkedIn page URL :"+driver.getCurrentUrl());
		driver.close();
		
		//switch back to homepage
		driver.switchTo().window(homePageWinId);
		System.out.println(" Homepage title :"+driver.getTitle());
		System.out.println(" Homepage URL :"+driver.getCurrentUrl());
		driver.close();
		
		//close all windows
		//driver.quit();


	}

}
