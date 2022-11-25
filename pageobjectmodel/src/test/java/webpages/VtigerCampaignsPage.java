package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerCampaignsPage extends SeleniumUtility {

	WebDriver driver;
	public VtigerCampaignsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addCampagins;
	
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement campaignName;
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	private WebElement calender;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]")
	private WebElement date;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveCampaign;
	
	@FindBy(xpath="//h4[contains(text(),'Campaigns')]")
	private WebElement Campaignlogo;
	
	@FindBy(xpath="//tbody/tr[@id='Campaigns_listView_row_1']/td[1]/div[1]/span[1]/input[1]")
	private WebElement newlyCreatedCampaignCheckBox;
	
	@FindBy(id="id=Contacts_listView_massAction_LBL_DELETE")
	private WebElement deleteCampaignLink;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	
	
	
	public void createNewCampaign(String lname) {
		clickOnElement(addCampagins);
		typeInput(campaignName, lname);
		clickOnElement(calender);
		clickOnElement(date);
		clickOnElement(saveCampaign);
		clickOnElement(Campaignlogo);


}
	public void deleteCreatedCampaign() {
		clickOnElement(newlyCreatedCampaignCheckBox);
		clickOnElement(deleteCampaignLink);
		clickOnElement(yesButtonOnConfirmPopup);
	}
	public boolean checkcampaignCreation() {
		return isElementExist(campaignName);
	}
	

}
