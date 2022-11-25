package switschstatements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class SortElements {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("Chrome", "https://jqueryui.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		//click on sortable
		WebElement sortable=driver.findElement(By.xpath("//a[text()='Sortable']"));
		sortable.click();
		//arrange it on descending order
		driver.switchTo().frame(0);
		Actions act =new Actions(driver);
		WebElement src1=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des1=driver.findElement(By.xpath("//ul[@id='sortable']//li[1]"));
		Thread.sleep(3000);
		//act.dragAndDrop(src1, des1).build().perform();
		act.dragAndDrop(src1, des1).build().perform();
		
	/*	WebElement src2=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des2=driver.findElement(By.xpath("//ul[@id='sortable']//li[2]"));
		Thread.sleep(3000);
		act.dragAndDrop(src2, des2).build().perform();
		
		WebElement src3=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des3=driver.findElement(By.xpath("//ul[@id='sortable']//li[3]"));
		Thread.sleep(3000);
		act.dragAndDrop(src3, des3).build().perform();
		
		WebElement src4=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des4=driver.findElement(By.xpath("//ul[@id='sortable']//li[4]"));
		Thread.sleep(3000);
		act.dragAndDrop(src4, des4).build().perform();

		WebElement src5=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des5=driver.findElement(By.xpath("//ul[@id='sortable']//li[5]"));
		Thread.sleep(3000);
		act.dragAndDrop(src5, des5).build().perform();


		WebElement src6=driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		WebElement des6=driver.findElement(By.xpath("//ul[@id='sortable']//li[6]"));
		Thread.sleep(3000);
		act.dragAndDrop(src6, des6).build().perform();
*/

	}


	}

