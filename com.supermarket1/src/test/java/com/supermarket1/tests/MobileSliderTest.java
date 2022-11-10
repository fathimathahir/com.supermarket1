package com.supermarket1.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;

import com.supermarket1.pages.MobileSliderPage;

public class MobileSliderTest extends Base {
	LogInPage loginPage;
	MobileSliderPage mobilesliderpage;

	@Test(groups = "sanity")
	public void verify_AddingNewListOfMobileSlider() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		mobilesliderpage = new MobileSliderPage(driver);
		mobilesliderpage.click_MobileSlide();
		mobilesliderpage.click_NewOption();
		mobilesliderpage.click_SelectCategory();
		mobilesliderpage.enter_Category();
		mobilesliderpage.upLoad_Image(Constants.IMAGEUPLOAD_MOBILE_SLIDER);
		mobilesliderpage.click_SaveButton();
		assertTrue(mobilesliderpage.savedImage_Displayed());
	}

	@Test(groups = "smoke")
	public void verify_StatusOptionForListOfMobileSlider() {
		loginPage = new LogInPage(driver);
		loginPage.logIn();
		mobilesliderpage = new MobileSliderPage(driver);
		mobilesliderpage.click_MobileSlide();
		mobilesliderpage.click_StatusOption();
		assertTrue(mobilesliderpage.sucessStatusChangeIcon_Displayed());
	}
}