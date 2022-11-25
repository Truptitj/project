package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Vtiger {
	WebDriver driver;

	@Test
	public void connectVtiger() {
		System.setProperty("webdriver.gecko.driver",
				"E:\\accelration\\Newfolder\\mavenProject\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php/");
		driver.getTitle();
		// Enter valid Username and Password and click on login button
		/*
		 * WebElement username =driver.findElement(By.id("username"));
		 * //username.clear(); username.sendKeys("admin");
		 * 
		 * WebElement pwd =driver.findElement(By.id("password")); //pwd.clear();
		 * pwd.sendKeys("admin123");
		 */

		WebElement login = driver.findElement(By.className("button"));
		login.click();
	}

	@Test
	// CLICK ON DASHBOARD
	public void dashboard() {

		WebElement dash = driver.findElement(By.cssSelector("#appnavigator>div>span"));
		String title = driver.getTitle();
		System.out.println("title");
		dash.click();
		Actions action = new Actions(driver);
		WebElement marketing = driver.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']"));
		marketing.click();

		WebElement campign = driver
				.findElement(By.xpath("//a[@href='index.php?module=Campaigns&view=List&app=MARKETING']"));
		campign.click();

		WebElement addcampign = driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD"));
		addcampign.click();

		WebElement campaignname = driver.findElement(By.id("Campaigns_editView_fieldName_campaignname"));
		campaignname.click();
		campaignname.sendKeys("Testing");
		WebElement calender = driver.findElement(By.id("Campaigns_editView_fieldName_closingdate"));
		calender.click();
		WebElement date = driver.findElement(By.xpath("//td[text()='15']"));
		date.click();
		WebElement savecamp = driver.findElement(By.className("saveButton"));
		savecamp.click();
	}

	@Test
	public void lead() {
		WebElement dash = driver.findElement(By.cssSelector("#appnavigator>div>span"));
		dash.click();
		Actions action = new Actions(driver);
		WebElement marketing = driver.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']"));
		marketing.click();
		WebElement leads = driver.findElement(
				By.xpath("//a[@href=\"index.php?module=Leads&view=List&app=MARKETING\" and @title='Leads']"));
		leads.click();
		WebElement addleads = driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD"));
		addleads.click();
		WebElement lastname = driver.findElement(By.id("Leads_editView_fieldName_lastname"));
		lastname.click();
		lastname.sendKeys("tester");
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		WebElement leadslogo = driver
				.findElement(By.xpath("//a[h4[@class=\"module-title pull-left text-uppercase\"]]"));
		leadslogo.click();
		WebElement Leadcheckbox = driver
				.findElement(By.xpath("//tr[@id='Leads_listView_row_1' ]/td/div/span/input[@type='checkbox']"));
		Leadcheckbox.click();
		WebElement edit = driver.findElement(By.id("Leads_listView_massAction_LBL_EDIT"));
		edit.click();
		WebElement firstname = driver.findElement(By.id("Leads_editView_fieldName_firstname"));
		firstname.click();
		firstname.sendKeys("QA");
		WebElement savefirstname = driver.findElement(By.className("saveButton"));
		savefirstname.click();
		WebElement deleteLeadcheckbox = driver
				.findElement(By.xpath("//tr[@id='Leads_listView_row_1' ]/td/div/span/input[@type='checkbox']"));
		deleteLeadcheckbox.click();
		WebElement deletelead=driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE"));
		deletelead.click();
		
		

		
	}
	
		
	}

