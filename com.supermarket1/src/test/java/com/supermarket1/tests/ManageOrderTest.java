package com.supermarket1.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageOrderPage;

public class ManageOrderTest extends Base {
	LogInPage loginPage;
	ManageOrderPage manageorderpage;

	@Test
	public void verify_SearchListOrders() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageorderpage = new ManageOrderPage(driver);
		manageorderpage.click_OnManageOrder();
		manageorderpage.click_OnSearchField();
		manageorderpage.enter_OrderId("501");
		manageorderpage.enter_UserId("@123121");
		manageorderpage.enter_StartDate("1-11-2022");
		manageorderpage.enter_EndDate("1-11-2022");
		manageorderpage.enter_PaymentMode();
		manageorderpage.enter_Status();
		manageorderpage.click_OnSearchButton();
		manageorderpage.searchButton_Enabled();
		assertTrue(manageorderpage.searchButton_Enabled());
	}

	@Test
	public void verify_ResetListOrders() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageorderpage = new ManageOrderPage(driver);
		manageorderpage.click_OnManageOrder();
		manageorderpage.click_OnSearchField();
		manageorderpage.enter_OrderId("501");
		manageorderpage.enter_UserId("@123121");
		manageorderpage.enter_StartDate("6-11-2022");
		manageorderpage.enter_EndDate("1-12-2022");
		manageorderpage.enter_AnotherPaymentMode();
		manageorderpage.enter_Statusoforder();
		manageorderpage.click_OnResetButton();
		assertTrue(manageorderpage.resetButton_Enabled());

	}

	@Test
	public void verify_DetailsOfOrderId406() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageorderpage = new ManageOrderPage(driver);
		manageorderpage.click_OnManageOrder();
		manageorderpage.get_Text("xpath");
		String expectedid = Constants.EXPECTED_ORDERID_LISTORDER;
		String actualid = manageorderpage.get_OrderId();
		assertEquals(actualid, expectedid);
	}

	@Test
	public void verify_ViewOption() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		manageorderpage = new ManageOrderPage(driver);
		manageorderpage.click_OnManageOrder();
		manageorderpage.click_OnViewOption();
		assertTrue(manageorderpage.image_Dispalyed());
	}
}