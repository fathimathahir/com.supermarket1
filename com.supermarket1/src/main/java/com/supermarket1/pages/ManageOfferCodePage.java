package com.supermarket1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.Excel;
import com.supermarket1.utilities.PageUtility;

public class ManageOfferCodePage {
	WebDriver driver;

	Excel excel;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']")
	private WebElement manageOfferCode;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newOption ;
	@FindBy(xpath = "//input[@id='offer_code']")
	private WebElement offerCode ;
	@FindBy(xpath = "//input[@id='offer_per']")
	private WebElement offerPecentage ;
	@FindBy(xpath = "//input[@id='offer_price']")
	private WebElement offerAmount ;
	@FindBy(xpath = "//div[@class='note-editable card-block']")
	private WebElement descriptionField ;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement save ;
	@FindBy(xpath="//input[@id='main_img']")
	private WebElement image ;
	
	public ManageOfferCodePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	public void clickOn_ManageOfferPage() {

		 manageOfferCode.click();
	}
	public void clickOn_NewOption() {

		newOption.click();
	}
	public void enter_OfferCode(String code) {
		offerCode.sendKeys(code);

	}

	public void enter_OfferPercentage(String Percentage) {
		offerPecentage .sendKeys( Percentage);

	}
	public void enter_OfferAmount(String amount) {
		offerAmount  .sendKeys( amount);

	}
	public void enter_Description(String description) {
		 descriptionField .sendKeys( description);

	}

	public void enter_OfferCodeInformation(String code,String  Percentage,String  amount,String description) {
		enter_OfferCode( code);
		enter_OfferPercentage( Percentage);
		enter_OfferAmount( amount);
		enter_Description(description);
	
		}
	public void upload_OfferImage(String img) {
		image.sendKeys(img);
	}
	public void ScrollDown_Save() 
	{
	PageUtility pageutility=new PageUtility(driver);
	pageutility.scroll_Click(save );
	}
	
}
