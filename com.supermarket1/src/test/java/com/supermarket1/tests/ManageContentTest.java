package com.supermarket1.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.base.DataProviderSuperMarket;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageContentPage;

public class ManageContentTest extends Base {
	LogInPage loginPage;
	ManageContentPage managecontentPage;
	DataProviderSuperMarket dataprovidersupermarket;

	@Test
	public void verify_ManagePageAddList() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();

		managecontentPage = new ManageContentPage(driver);
		managecontentPage.clickOn_ManageContent();
		managecontentPage.clickOn_ManagePage();
		managecontentPage.clickOn_NewOption();
		managecontentPage.enter_Title("Ice Cream");
		managecontentPage.enter_Description("Butterscotch ice cream..");
		managecontentPage.enter_PageName("2");
		managecontentPage.upLoad_Image(Constants.IMAGEUPLOAD_MANAGEPAGE);
		managecontentPage.clickOn_SaveOption();
		managecontentPage.get_BackGroundColorOfNewOption();
		String expectedcolor=Constants.EXPECTED_COLOR_NEW_OPTION;
		String actualcolor=managecontentPage.get_BackGroundColorOfNewOption();
		assertEquals(actualcolor, expectedcolor);
	}
		

	@Test(groups = {"smoke","sanity"})
	public void verify_UpDateOptionForManageFooterPage() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();

		managecontentPage = new ManageContentPage(driver);
		managecontentPage.clickOn_ManageContent();
		managecontentPage.clickOn_ManageFooterPage();
		managecontentPage.clickOn_UpDateLink();
		managecontentPage.clickOn_UpDateButton();
		String expectedalert = Constants.EXPECTED_ATTRIBUTE_FOR_SUCESSRESETALERT;
		String actualalert =managecontentPage.get_textForSucessUpdateAlert();
		assertEquals( actualalert, expectedalert);
	}

	@Test
	public void verify_ResetOptionForManageFooterPage() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();

		managecontentPage = new ManageContentPage(driver);
		managecontentPage.clickOn_ManageContent();
		managecontentPage.clickOn_ManageFooterPage();
		managecontentPage.clickOn_UpDateLink();
        managecontentPage.clickOn_ResetButton();
	
		String expectedcolor=Constants. EXPECTED_COLOR_RESET_OPTION;
		String actualcolor=managecontentPage.get_BackGroundColorOfResetOption();
		assertEquals(actualcolor, expectedcolor);
	}

	@Test(dataProvider = "addnews", dataProviderClass = com.supermarket1.base.DataProviderSuperMarket.class)
	public void verify_ManageNewsPage(String data) {
		loginPage = new LogInPage(driver);
		loginPage.logIn();

		managecontentPage = new ManageContentPage(driver);
		managecontentPage.clickOn_ManageContent();
		managecontentPage.clickOn_ManageNewsPage();
		managecontentPage.clickOn_NewNewsOption();
		managecontentPage.add_NewNews(data);
		managecontentPage.clickOn_NewsSaveOption();
		assertTrue(managecontentPage.saveButton_Enabled());
		
	}
}
		