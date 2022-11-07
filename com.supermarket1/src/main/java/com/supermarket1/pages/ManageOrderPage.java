package com.supermarket1.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;
import com.supermarket1.utilities.WaitUtility;

public class ManageOrderPage {
	WebDriver driver;
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manageOrder;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchField;
	@FindBy(xpath="//input[@id='od']")
	WebElement orderId;
	@FindBy(xpath="//input[@id='um']")
	WebElement userId;
	@FindBy(xpath="//input[@id='sd']")
	WebElement startDate;
	@FindBy(xpath="//input[@id='ed']")
	WebElement endDate;
	@FindBy(xpath="//select[@id='pt']")
	WebElement paymentMode;
	@FindBy(xpath="//select[@id='st']")
	WebElement status;
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchButton;
	@FindBy(xpath="//button[@class='btn btn-default btn-fix']")
	WebElement resetButton;
	@FindBy(xpath="//tbody//tr[1]//td[1]")
	WebElement orderid;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/details?details=399&page_ad=1']")
	WebElement viewOption;
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/uploads/small/1601796976_dae72f5a4836c0e99ed2.jpg']")
	WebElement imageProduct;
	
	
	
	public ManageOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void click_OnManageOrder()
	{
		manageOrder.click();
	}
	public void click_OnSearchField()
	{
		searchField.click();
	}
	public void enter_OrderId(String orderid)
	{
		orderId.sendKeys(orderid);
	}
	public void enter_UserId(String userid)
	{
		userId.sendKeys(userid);
	}
	public void enter_StartDate(String date)
	{
		startDate.sendKeys(date);
	}
	public void enter_EndDate(String date)
	{
		endDate.sendKeys(date);
	}
	
	public void enter_PaymentMode() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("Cash on Delivery",paymentMode);
	}
	public void enter_Status() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("Out For Delivery",status);
	}
	public void click_OnSearchButton()
	{
		searchButton.click();
	}
	public boolean searchButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(searchButton);
	}
	public void enter_AnotherPaymentMode() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("Net Banking/Debit/Credit Card",paymentMode);
	}
	public void enter_Statusoforder() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("Paid",status);
	}
	public void click_OnResetButton()
	{
		resetButton.click();
	}
	public boolean resetButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(resetButton);
	}
	public List<String>  get_Text(String xpath)
	{
		GeneralUtility generalutility = new GeneralUtility(driver);
		
		return generalutility.get_TextOfElements("//tbody//tr[1]//td");
	
	}
	public String get_OrderId() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.get_Text(orderid);
	}
	public void click_OnViewOption()
	{
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.scroll_Click(viewOption);
		
	}
	public boolean image_Dispalyed() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Displayed(imageProduct);
	}
}
