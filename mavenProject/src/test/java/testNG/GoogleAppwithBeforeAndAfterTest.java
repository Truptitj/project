package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleAppwithBeforeAndAfterTest {
	WebDriver driver;

  @BeforeTest
  public void startup() {
	  System.setProperty("webdriver.chrome.driver", 
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }  
	  @Test
	  public void TestGoogleTitle() {
		  driver.get("https://www.google.com/");

		  String actualtitle=driver.getTitle();
		  System.out.println("actualtitle");
		  
	  }
  }

