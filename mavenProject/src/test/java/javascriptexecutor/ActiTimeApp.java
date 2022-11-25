package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeApp {
  @Test
  public void loginActiTimeApp() {
	  System.setProperty("webdriver.chrome.driver" , 
				"E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Identify username field by js
		js.executeScript("document.getElementById('username').value='admin'");
		
		//Identify password field by js
		js.executeScript("document.getElementsByName('pwd').value='manager'");
		
		//Identify login field by js
		js.executeScript("document.getElementById('loginButton').click();");
		
  }
}

//elemnts can be identified by 
/*.getElementById
.getElementsByName
.getElementsByClass
.getElementsByTagName
*/



