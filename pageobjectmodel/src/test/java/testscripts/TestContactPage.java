package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerContactPage;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class TestContactPage extends SeleniumUtility{
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerContactPage getVtigerContactPage=null;
	@BeforeTest
	public void prerequisite() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerContactPage=new VtigerContactPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToContactPage(1);
	}

	@Test
	public void testContactsCreation() {
		getVtigerContactPage.createNewContact("Tester");
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(),"contact not created");
		
	}
	
	@Test(dependsOnMethods="testContactsCreation")
	public void testDeletionCreation() {
		getVtigerContactPage.deleteCreatedContact();
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(),"Created Leadis not deleted");
		
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
	
	
}
	

