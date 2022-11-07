package com.supermarket1.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.base.DataProviderSuperMarket;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageExpensePage;


public class ManageExpenseTest extends Base {
	LogInPage loginPage;
	ManageExpensePage manageexpensepage;
	DataProviderSuperMarket dataprovidersupermarket;

	@Test
	public void verify_AddedItemToExpenseCategory() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageexpensepage = new ManageExpensePage(driver);
		manageexpensepage.click_OnManageExpenseLink();
		manageexpensepage.click_OnExpenseCategory();
		manageexpensepage.click_OnNew();
		manageexpensepage.enter_Title("Chocolates");
		manageexpensepage.click_OnSave();
		String expectedtitle = "Chocolates";
		String actualtitle = manageexpensepage.getText_OfAddTitle();
		assertEquals(actualtitle, expectedtitle);
	}

	@Test
	public void verify_DeleteOption() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageexpensepage = new ManageExpensePage(driver);
		manageexpensepage.click_OnManageExpenseLink();
		manageexpensepage.click_OnExpenseCategory();
		manageexpensepage.click_OnNew();
		manageexpensepage.enter_Title("Note books");
		manageexpensepage.click_OnSave();
		manageexpensepage.click_OnDelete();
        String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

	}

	@Test(dataProvider = "searchcategory", dataProviderClass = com.supermarket1.base.DataProviderSuperMarket.class)
	public void verify_SearchOption(String data)  {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageexpensepage = new ManageExpensePage(driver);
		manageexpensepage.click_OnManageExpenseLink();
		manageexpensepage.click_OnExpenseCategory();
		manageexpensepage.click_OnSearch();
		
		manageexpensepage.click_OnSearchTitle(data);
	
		manageexpensepage.click_OnSearchButton();
		assertTrue(manageexpensepage.searchButton_IsEnabled());
	}
	@Test
	public void verify_AddManageExpenseDetails()
	{
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageexpensepage = new ManageExpensePage(driver);
		manageexpensepage.click_OnManageExpenseLink();
		manageexpensepage.click_ManageExpense();
		manageexpensepage.click_OnNew();
		manageexpensepage.enter_UserTitleField();
		manageexpensepage.enter_Category();
		manageexpensepage.enter_OrderId();
		manageexpensepage.enter_PurchaseId();
		manageexpensepage.enter_ExpenseType();
		manageexpensepage.enter_AmountField("4520");
		manageexpensepage.enter_RemarkField("Good Service");
		manageexpensepage.upload_File("C:\\Users\\lenovo\\Desktop//sele.docx");
		manageexpensepage.ScrollDown();
		manageexpensepage.saveButton_IsEnabled();
	}
	
}