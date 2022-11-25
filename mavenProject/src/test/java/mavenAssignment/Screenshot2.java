package mavenAssignment;

import org.openqa.selenium.WebDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class Screenshot2 {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();

		WebDriver driver = s1.setUp("chrome", "https://www.google.com");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File screenShot=ts.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(screenShot, new File(".\\src\\test\\resources\\screenshots\\GoogleSearchPage.png"));
					//or
		
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		String fileName=".\\scshot\\GoogleSearchPage"+date+".png";
		s1.takeScreenshot(fileName);
	}
	}


