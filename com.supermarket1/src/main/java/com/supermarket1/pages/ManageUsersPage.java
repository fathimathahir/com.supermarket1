package com.supermarket1.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket1.utilities.GeneralUtility;
import com.supermarket1.utilities.PageUtility;

public class ManageUsersPage {
	WebDriver driver;
	GeneralUtility generalutility;
	PageUtility pageutility;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-user']")
	private WebElement manageUser;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/users/status?id=252&st=active&pagpage_ades=1']")
	private WebElement unLockOption;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sucessStatusChangedAlert;
	
	public ManageUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_ManageUsersLink() {
		manageUser.click();
	}

	public void deactivate_User(String usersName) {
		int j = 0;
		List<String> names = new ArrayList<String>();

		generalutility = new GeneralUtility(driver);

		pageutility = new PageUtility(driver);
		names = generalutility.get_TextOfElements("//tbody//tr//td[1]");
		for (j = 0; j < names.size(); j++) {
			if (usersName.equals(names.get(j))) {
				j++;
				break;
			}

		}

		WebElement deactivateButton = driver.findElement(By.xpath("//tbody//tr[" + j + "]//td[5]//a"));
		deactivateButton.click();
	}

	
	public String get_AttributeOfSucessAlert() {
		GeneralUtility generalutility = new GeneralUtility(driver);
		return generalutility.get_Attribute(sucessStatusChangedAlert, "class");
	}

}
