package com.supermarket1.tests;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.PushNotificationPage;
import com.supermarket1.utilities.PdfReader;

public class PushNotificationTest extends Base {

	PushNotificationPage pushnotificationpage;
	LogInPage loginpage;
	PdfReader pdfreader;

	@Test
	public void verify_PushNotification()

	{
		HashMap<String, String> map = new HashMap<String, String>();

		loginpage = new LogInPage(driver);
		loginpage.logIn();
		pushnotificationpage = new PushNotificationPage(driver);
		pushnotificationpage.clickOn_PushNotification();

		pdfreader = new PdfReader();
		map = pdfreader.Pdf_ReadData("pushnotificationdata");
		String notificationtitle = map.get("title 1");
		String notificationdescription = map.get("description1");
		pushnotificationpage.enter_PushNotificationdata(notificationtitle, notificationdescription);
		assertTrue(pushnotificationpage.sendButton_Enabled());
	}

}
