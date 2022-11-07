package com.supermarket1.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageCategoryPage;


public class ManageCategoryTest extends Base {
	LogInPage loginPage;
	ManageCategoryPage managecategorypage;

	@Test(priority=1)
	public void verify_AddCategoryInManageCategory() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.click_ManageCategoryPage();
		managecategorypage.click_CategoryPage();
		managecategorypage.click_NewOption();
		managecategorypage.enter_Category("Pastry");
		managecategorypage.select_Groups();
		managecategorypage.upload_CategoryImage(Constants.IMAGEUPLOAD_MANAGE_CATEGORY);
		managecategorypage.click_Save();
		assertTrue(managecategorypage.saveButton_Enabled());
		
	}
	@Test(dataProvider = "searchlists", dataProviderClass = com.supermarket1.base.DataProviderSuperMarket.class)
	public void verify_SearchOption(String data) {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.click_ManageCategoryPage();
		managecategorypage.click_CategoryPage();
		managecategorypage.click_SearchOption();
		managecategorypage.enter_SearchTitle(data);
		managecategorypage.click_SearchButton();
		assertTrue(managecategorypage.saveButton_Enabled());
}
	@Test(priority=2)
	public void verify_EnterSubCategoryInformation() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.click_ManageCategoryPage();
		managecategorypage.click_SubCategory();
		managecategorypage.click_NewOption();
		managecategorypage.select_Category();
		managecategorypage.enter_SubCategory("Nuts");
		managecategorypage.upload_CategoryImage(Constants.IMAGEUPLOAD_MANAGE_SUBCATEGORY);
		managecategorypage.click_Save();
		assertTrue(managecategorypage.saveButton_Enabled());
}
	@Test
	public void verify_UpDateSubCategoryInformation() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.click_ManageCategoryPage();
		managecategorypage.click_SubCategory();
		managecategorypage.click_EditOption();
		managecategorypage.enter_SubCategory("cakes");
		managecategorypage.click_UpDateButton();
		assertTrue(managecategorypage.sucessfullyUpDatedAlertIcon_Displayed());
		
	}
	@Test
	public void verify_DeleteSubCategoryInformation() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.click_ManageCategoryPage();
		managecategorypage.click_SubCategory();
		managecategorypage.click_NewOption();
		managecategorypage.select_Category();
		managecategorypage.enter_SubCategory("wheat");
		managecategorypage.click_Save();
		managecategorypage.click_DeleteButton();
		  String alert = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
		assertTrue(managecategorypage.deleteButton_Enabled());
		
		
}
}