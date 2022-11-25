package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerCampaignsPage;
import webpages.VtigerContactPage;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class TestCampaignPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerCampaignsPage getVtigerCampaignsPage=null;
	@BeforeTest
	public void prerequisite() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerCampaignsPage=new VtigerCampaignsPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToCampaignPage(1);
	}
	@Test
	public void testContactsCreation() {
		getVtigerCampaignsPage.createNewCampaign("Campaign");
		Assert.assertTrue(getVtigerCampaignsPage.checkcampaignCreation(),"contact not created");
}
	public void testDeletionCreation() { 
		getVtigerCampaignsPage.deleteCreatedCampaign();
		Assert.assertTrue(getVtigerCampaignsPage.checkcampaignCreation(),"Created campaign not deleted");
		
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
	}