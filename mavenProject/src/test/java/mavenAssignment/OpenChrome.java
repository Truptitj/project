package mavenAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//create an instance of required browser
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
	}

}
