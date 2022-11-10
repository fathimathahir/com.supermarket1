package com.supermarket1.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageLocationPage;
import com.supermarket1.pages.ManageSliderPage;

public class ManageSliderTest extends Base {
	LogInPage loginPage;
	ManageSliderPage managesliderpage;

	@Test(groups = "smoke")
	public void verify_EnterLocationInformations() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		managesliderpage = new ManageSliderPage(driver);
		managesliderpage.click_ManageSlide();
		managesliderpage.click_NewOption();
		managesliderpage.upLoad_Image(Constants.IMAGEUPLOAD_MANAGESLIDE);
		managesliderpage.enter_Link("http:onlinegrocery.in");
		managesliderpage.click_save();
		assertTrue(managesliderpage.saveButton_Enabled());
	}
}