package com.supermarket1.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.pages.AdminUsersPage;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageOfferCodePage;

public class AdminusersTest extends Base {
	LogInPage loginPage;
	AdminUsersPage adminuserspage;
	
	@Test
	public void verify_AdminUsersInformations()
	{
		
		loginPage = new LogInPage(driver);
			loginPage.logIn();
			adminuserspage=new AdminUsersPage(driver);
			adminuserspage.clickOn_AdminUsersPage();
			adminuserspage.clickOn_NewOption();
			adminuserspage.enter_UserName("Fathi");
			adminuserspage.enter_PassWord("001122");
			adminuserspage.select_UserType();
			adminuserspage.clickOn_SaveOption();
			assertTrue(	adminuserspage.saveButton_Enabled());
}
	@Test(dataProvider = "searchadminsExcel", dataProviderClass = com.supermarket1.base.DataProviderSuperMarket.class)
	public void verify_SearchAdminUsersInformations(String data)
	{
		
		loginPage = new LogInPage(driver);
			loginPage.logIn();
			adminuserspage=new AdminUsersPage(driver);
			adminuserspage.clickOn_AdminUsersPage();
			adminuserspage.clickOn_SearchOption();
			adminuserspage.enter_SearchData(data);
			adminuserspage.click_SearchButton();
			assertTrue(	adminuserspage.searchButton_Enabled());
}
}