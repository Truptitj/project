package assignment;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.assertions.Assertions;

public class Orangehrm {
  @Test
  public void loginOrangehrm() {
	  System.setProperty("webdriver.chrome.driver", 
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  username.click();
	  username.sendKeys("Admin");
	  WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  password.click();
	  password.sendKeys("admin123");
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
	  
	  //enter on PIM
	  WebElement add= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
	  add.click();
	  WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	  firstname.click();
	  firstname.sendKeys("Testing");
	  WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	  lastname.click();
	  lastname.sendKeys("Quality");
	  WebElement save=driver.findElement(By.xpath("//button[@type='submit']"));
	  save.click();
	  WebElement PIM=driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
	  PIM.click();
	  
  }    
  }
  
  
