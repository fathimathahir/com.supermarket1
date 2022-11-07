package com.supermarket1.tests;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageOfferCodePage;
import com.supermarket1.utilities.Excel;

public class ManageOfferCodeTest extends Base {
	LogInPage loginPage;
	ManageOfferCodePage manageoffercodepage;
	Excel excel;
	
	@Test
	public void verify_EnterOfferInformations()
	{
		String code;
		String  Percentage;
		String  amount;
		String description;
		
		excel = new Excel();
		excel.setExcelFile("manageoffercodeexcel", "offerinformations");
		code = excel.getCellData(0, 0);
		 Percentage = excel.getCellData(0, 1);
		 amount = excel.getCellData(0, 2);
		 description = excel.getCellData(0, 3);
		
		loginPage = new LogInPage(driver);
			loginPage.logIn();
			manageoffercodepage=new ManageOfferCodePage(driver);
			manageoffercodepage.clickOn_ManageOfferPage();
			manageoffercodepage.clickOn_NewOption();
			manageoffercodepage.enter_OfferCodeInformation(code,Percentage ,amount, description);
			manageoffercodepage.upload_OfferImage(Constants.IMAGEUPLOAD_MANAGEOFFER_CODE);
			manageoffercodepage.ScrollDown_Save();
}
	
}