package com.supermarket1.base;

import org.testng.annotations.DataProvider;

public class DataProviderSuperMarket {
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
}
