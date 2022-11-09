package com.supermarket1.base;

import org.testng.annotations.DataProvider;

import com.supermarket1.utilities.Excel;

public class DataProviderSuperMarket {
	Excel excel;
	
	 /**Manage expense**/
	@DataProvider (name="searchcategory")
	 public Object[] [] expenseCategory()
	 {
		return new Object [][] {{"Mango"},{"Chocolates"},{"Vegetables"},{"Grocery"}};
			
		
	 }
	@DataProvider (name="addnews")
	 public Object[] [] managenews()
	 {
		return new Object [][] {{"Happy customer"},{"Stock Clearance"},{"Wishlist Items"}};
			
		
	 }
  
	 /**Manage Category**/
	@DataProvider (name="searchlists")
	 public Object[] [] managecategory()
	 {
		return new Object [][] {{"pastry"},{"Diary&Bakery"},{"DryFruits"}};
			
		
	 }
	 /**Manage offer code**/
		@DataProvider (name="searchOffers")
		 public Object[] [] manageOfferCode()
		 {
			return new Object [][] {{"500"},{"457"},{"107"},{"102"}};
				
			
		 }
		 /**AdMIN user page**/
		@DataProvider (name="searchadminsExcel")
		 public Object[] [] adminusers()
		 {
			excel=new Excel();
			excel.setExcelFile("adminuser", "searchadmin");	
			return excel.get_MultiDimensionalObjectArray(3, 1);
		 }
}
