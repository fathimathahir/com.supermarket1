package com.supermarket1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;

public class ManageCategoryPage {
	WebDriver driver;
	@FindBy(xpath = "//i[@ class='nav-icon fas fa-list-alt']")
	private WebElement manageCategoryPage;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	private WebElement Category;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newOption;
	@FindBy(xpath = "//input[@id='category']")
	private WebElement categoryField;
	@FindBy(xpath = "//li[@id='134-selectable']")
	private WebElement selectGroup;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement categoryImage;
	@FindBy(xpath = "//label[@class='radio-inline']//input[@name='top_menu']")
	private WebElement showOnTopMenu;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement saveButton;
	@FindBy(xpath = "//input[@name='un']")
	private WebElement searchField;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchoption;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement searchButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")
	private WebElement subCategory;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement selectCategory;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement entersubCategory;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/edit?edit=105&page_ad=1']")
	private WebElement editOption;
	@FindBy(xpath = "//button[@name='update']")
	private WebElement UpDateButton;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	private WebElement UpDateSucessfully;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/delete?del=108&page_ad=1']")
	private WebElement delete;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_ManageCategoryPage() {
		manageCategoryPage.click();
	}

	public void click_CategoryPage() {
		Category.click();
	}

	public void click_NewOption() {
		newOption.click();
	}

	public void enter_Category(String enter) {
		categoryField.sendKeys(enter);
	}

	public void select_Groups() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.mouse_click(selectGroup);
	}

	public void upload_CategoryImage(String img) {
		categoryImage.sendKeys(img);
	}

	public void click_yes() {
		showOnTopMenu.click();

	}

	public void click_Save() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.scroll_Click(saveButton);

	}

	public boolean saveButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(saveButton);
	}

	public void click_SearchOption() {
		searchoption.click();

	}

	public void enter_SearchTitle(String data) {
		searchField.sendKeys(data);

	}

	public void click_SearchButton() {
		searchButton.click();

	}

	public boolean searchButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(searchButton);
	}

	public void click_SubCategory() {
		subCategory.click();

	}

	public void select_Category() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("3", selectCategory);

	}

	public void enter_SubCategory(String subcategory) {
		entersubCategory.sendKeys(subcategory);

	}

	public void click_EditOption() {
		editOption.click();

	}

	public void click_UpDateButton() {
		UpDateButton.click();

	}

	public boolean sucessfullyUpDatedAlertIcon_Displayed() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Displayed(UpDateSucessfully);
	}

	public void click_DeleteButton() {
		delete.click();
		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

	}

	public boolean deleteButton_Enabled() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.is_Enabled(delete);
	}
}
