package com.supermarket1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.Excel;
import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;

public class ManageDeliverBoyPage {

	WebDriver driver;
	Excel excel;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	private WebElement manageDeliverBoyLink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']")
	private WebElement newClick;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameField;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement eMailField;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement addressField;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passWordField;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveOption;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement saveMessage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement search;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchField;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")
	private WebElement searchButton;
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElement searchText;

	public ManageDeliverBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_ManageDeliverBoy() {
		manageDeliverBoyLink.click();
	}

	public void click_New() {
		newClick.click();
	}

	public void enter_Name(String name) {
		nameField.sendKeys(name);
	}

	public void enter_EMail(String email) {
		eMailField.sendKeys(email);
	}

	public void enter_PhoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}

	public void enter_Address(String address) {
		addressField.sendKeys(address);
	}

	public void enter_UserName(String username) {
		userNameField.sendKeys(username);
	}

	public void enter_PassWord(String password) {
		passWordField.sendKeys(password);
	}

	public void click_SaveButton() {
		saveOption.click();
	}

	public void ScrollDown() {
		PageUtility pageutility = new PageUtility(driver);
		pageutility.scroll_Click(saveOption);
	}

	public void create_DeliveryBoy(String name, String email, String number, String address, String username,
			String password) {
		enter_Name(name);
		enter_EMail(email);
		enter_PhoneNumber(number);
		enter_Address(address);
		enter_UserName(username);
		enter_PassWord(password);
	}

	public void click_Search() {
		search.click();
	}

	public void enter_SearchData(String data) {
		searchField.sendKeys(data);
	}

	public void click_SearchButton() {
		searchButton.click();
	}

	public boolean saveButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(saveOption);
	}

	public String get_SearchText() {

		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.get_Text(searchText);
	}
}
