package com.supermarket1.tests;

import java.time.Duration;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageDeliverBoyPage;
import com.supermarket1.utilities.Excel;
import com.supermarket1.utilities.PageUtility;

public class ManageDeliveryBoyTest extends Base {
	LogInPage loginPage;
	ManageDeliverBoyPage managedeliverboy;
	Excel excel;
	PageUtility pageutility;

	@Test
	public void verify_ManageDeliveryBoy() {
		String name;
		String email;
		String number;
		String address;
		String username;
		String password;
		excel = new Excel();
		excel.setExcelFile("DetailsOfDeliveryBoy", "ManageDetails");
		name = excel.getCellData(0, 0);
		email = excel.getCellData(0, 1);
		number = excel.getCellData(0, 2);
		address = excel.getCellData(0, 3);
		username = excel.getCellData(0, 4);
		password = excel.getCellData(0, 5);

		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managedeliverboy = new ManageDeliverBoyPage(driver);
		managedeliverboy.click_ManageDeliverBoy();

		managedeliverboy.click_New();

		managedeliverboy.create_DeliveryBoy(name, email, number, address, username, password);
		managedeliverboy.ScrollDown();

	}
}
