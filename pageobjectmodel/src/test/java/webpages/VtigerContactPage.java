package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerContactPage extends SeleniumUtility{
	WebDriver driver;
	public VtigerContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//a[@href='index.php?module=Contacts&view=List&app=MARKETING']")
//	private WebElement contact;
	
	@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addContact;
	
	@FindBy(id="Contacts_editView_fieldName_lastname")
	private WebElement lastNameInputFieldForContact;
	
	@FindBy(css=".saveButton")
	private WebElement saveButtonForContact;
	
	@FindBy(css=".module-title")
	private WebElement ContactHeaderLink;
	
	@FindBy(xpath="//tr[@id='Contacts_listView_row_1']"
			+ "/td[div[span[input[@class='listViewEntriesCheckBox']]]]\r\n" + 
			"")
	private WebElement newlyCreatedContactCheckBox;
	
	@FindBy(id="id=Contacts_listView_massAction_LBL_DELETE")
	private WebElement deleteContactLink;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	
	
	
	public void createNewContact(String lname) {
		clickOnElement(addContact);
		typeInput(lastNameInputFieldForContact, lname);
		clickOnElement(saveButtonForContact);
		clickOnElement(ContactHeaderLink);
}
	
	public void deleteCreatedContact() {
		clickOnElement(newlyCreatedContactCheckBox);
		clickOnElement(deleteContactLink);
		clickOnElement(yesButtonOnConfirmPopup);
	}
	
	public boolean checkContactCreation() {
		return isElementExist(lastNameInputFieldForContact);
	}

	

	
	
}
