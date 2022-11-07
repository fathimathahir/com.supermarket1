package com.supermarket1.tests;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.supermarket1.base.Base;
import com.supermarket1.pages.LogInPage;
import com.supermarket1.pages.ManageUsersPage;

public class ManageUsersTest extends Base {
	 LogInPage loginPage;
   ManageUsersPage manageuserspage;
   
   
   @Test
   public void verify_ManageUserDeactivation()
   {
	   loginPage=new LogInPage(driver);
		 loginPage.logIn();
		 
		 manageuserspage=new  ManageUsersPage(driver);
		 manageuserspage.click_ManageUsersLink();
		 manageuserspage.deactivate_User("lex rex");
		 manageuserspage.unLock_Enabled();
		 
   }
}
