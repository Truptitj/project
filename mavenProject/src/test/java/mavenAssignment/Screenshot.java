package mavenAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class Screenshot {
	public void takeScreenshot(String fileLocation,WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenShot = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(screenShot, new File(fileLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException  {
		SeleniumUtility s1 = new SeleniumUtility();
		Screenshot s2 =new Screenshot();

		WebDriver driver = s1.setUp("chrome", "https://www.google.com");
		

		
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		String fileName=".\\scshot\\GoogleSearchPage"+date+".png";
		s2.takeScreenshot(fileName, driver);
	}

}