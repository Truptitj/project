package mavenAssignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingActiveElements {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://demo.actitime.com/");
		//login into the application without identifing username & password field
		
		//verify mouse pointer is in username field
		WebElement username=driver.switchTo().activeElement();
		String str =username.getAttribute("placeholder");
		System.out.println("Is mouse pointer present in usrname field? :"+str.equals("Username"));
		username.sendKeys("admin",Keys.TAB);
		
		//verify mouse pointer is in password field
		WebElement password=driver.switchTo().activeElement();
		String str2= password.getAttribute("placeholder");
		System.out.println("is mouse pointer present in password field?"+str2.equals("Password"));
		password.sendKeys("manager",Keys.TAB);
		password.sendKeys(Keys.TAB);
		
		//verify mouse pointer is in keepmeLogin field
		WebElement keepmeLogin=driver.switchTo().activeElement();
		String str3 =keepmeLogin.getAttribute("id");
		System.out.println(str3);
		System.out.println("is mouse pointer present in keepmeLogin field?"+str3.equalsIgnoreCase
				("keepLoggedInCheckBox"));
		keepmeLogin.sendKeys(Keys.TAB);
		
		//verify mouse pointer is in Login field

		WebElement Login=driver.switchTo().activeElement();
		String str4 =Login.getAttribute("id");
		System.out.println("is mouse pointer present in login field?"+str4.equals("loginButton"));


	}

}
