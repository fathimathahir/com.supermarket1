package com.supermarket1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;

public class AdminUsersPage {
	WebDriver driver;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement adminUsers;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newOption;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passWord;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userType;
	@FindBy(xpath = "//div[@class='card-footer center']//button[@class='btn btn-block-sm btn-danger']")
	private WebElement save;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchOption;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchField;
	@FindBy(xpath = "//div[@class='card-body']//button[@class='btn btn-block-sm btn-danger']")
	private WebElement searchButton;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOn_AdminUsersPage() {

		adminUsers.click();
	}

	public void clickOn_NewOption() {

		newOption.click();
	}

	public void enter_UserName(String username) {

		userName.sendKeys(username);
	}

	public void enter_PassWord(String password) {

		passWord.sendKeys(password);
	}

	public void select_UserType() {

		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByVisibleText("Staff", userType);
	}

	public void clickOn_SaveOption() {

		save.click();
	}

	public boolean saveButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(save);
	}

	public void clickOn_SearchOption() {

		searchOption.click();
	}

	public void enter_SearchData(String data) {

		searchField.sendKeys(data);
	}

	public void click_SearchButton() {

		searchButton.click();
	}

	public boolean searchButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(searchButton);
	}
}
