package com.supermarket1.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageLocationPage;

public class ManageLocationTest extends Base {
	LogInPage loginPage;
	ManageLocationPage managelocationpage;

	@Test(groups="sanity")
	public void verify_EnterLocationInformations() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_NewOption();
		managelocationpage.select_Country();
		managelocationpage.select_State();
		managelocationpage.enter_Location("Manchester");
		managelocationpage.enter_DeliveryCharge("225");

		managelocationpage.click_saveButton();
		assertTrue(managelocationpage.saveButton_Enabled());

	}

	@Test
	public void verify_UpDateLocationInformations() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();

		managelocationpage.click_EditOption();
		managelocationpage.select_StateEastMidLands();
		managelocationpage.click_UpdateButton();

	}

	@Test
	public void verify_StatusChangeOption() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_OnStatusOption();

	}

	@Test
	public void verify_DeleteOption() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();

		managelocationpage.click_DeleteButton();
		String actualalert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expectedalert = Constants.EXPECTED_ALERTFOR_DELETE;
		assertEquals(actualalert, expectedalert);

	}

}
