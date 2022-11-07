package com.supermarket1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;

public class ManageLocationPage {
	WebDriver driver;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location']")
	WebElement manageLocation;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newOption;
	@FindBy(xpath="//select[@id='country_id']")
	WebElement selectCountry;
	@FindBy(xpath="//select[@id='st_id']")
	WebElement selectState;
	@FindBy(xpath="//input[@id='location']")
	WebElement locationField;
	@FindBy(xpath="//input[@id='delivery']")
	WebElement deliveryCharge;
	@FindBy(xpath="//button[@name='create']")
	WebElement saveButton;
	@FindBy(xpath="//button[@name='create']")
	WebElement searchField;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/edit?edit=655&page_ad=1']")
	WebElement editOption;
	@FindBy(xpath="//button[@name='update']")
	WebElement updateButton;
	@FindBy(xpath="//tbody//tr[2]//td//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/status?id=659&st=inactive&page_ad=1']")
	WebElement statusOption;
	@FindBy(xpath="//tbody//tr[1]//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/delete?del=662&page_ad=1']")
	WebElement deleteButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/delete?del=662&page_ad=1']")
	WebElement delete;
	
	
	public ManageLocationPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void click_MnageLocationPage()
	{
		manageLocation.click();
	}
	public void  click_NewOption()
	{
		newOption.click();
	}
	public void select_Country() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("230", selectCountry);
	}
	public void select_State()
	{
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("3817", selectState);
	}
	public void enter_Location(String place)
	{
		locationField.sendKeys(place);
	}
	public void enter_DeliveryCharge(String charge)
	{
		 deliveryCharge.sendKeys(charge);
	}
	public void click_saveButton()
	{
		saveButton.click();
	}
	public boolean saveButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(saveButton);
	}
	public void click_searchfield()
	{
		searchField.click();
	}
	
	public void select_StateEastMidLands()
	{
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByVisibleText("East Midlands", selectState);
	}
	public void click_EditOption()
	{
		editOption.click();
	}
	public void click_UpdateButton()
	{
		 updateButton.click();
	} 
	
	public void click_OnStatusOption()
	{
		 statusOption.click();
	}
	public void click_DeleteButton()
	{
		deleteButton.click();
	}
	
}