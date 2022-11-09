package com.supermarket1.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.constants.Constants;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.utilities.GeneralUtility;

import dev.failsafe.internal.util.Assert;

public class LogInTest extends Base {
	LogInPage loginPage;

	@Test(groups = "smoke")
	public void verify_LogIn() {
		LogInPage loginPage = new LogInPage(driver);
		loginPage.logIn();
		loginPage.is_profileImageDisplayed();
		assertTrue(loginPage.is_profileImageDisplayed());

	}

	@Test
	public void verify_InvalidData() {
		LogInPage loginPage = new LogInPage(driver);
		loginPage.logIn("125", "admin");
		String expectedcolor = Constants.EXPECTED_COLOR_ALERT_TEXT_INVALIDDATA;
		String actualcolor = loginPage.get_BackGroundColorForAlert();
		System.out.println(actualcolor);
		assertEquals(actualcolor, expectedcolor);

	}
		

	@Test(groups = "sanity")
	public void Verify_RememberMeCheckBox() {
		LogInPage loginPage = new LogInPage(driver);

		loginPage.Click_RememberMeCheckBox();
		loginPage.is_SelectedRememberMe();
		assertTrue(loginPage.is_SelectedRememberMe());
	}

	@Test
	public void verify_LogOut() {
		LogInPage loginPage = new LogInPage(driver);
		loginPage.logIn();
		loginPage.click_OnLogOut();
		assertTrue(loginPage.is_profileImageDisplayed());
	}

}
