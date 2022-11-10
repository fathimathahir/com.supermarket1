package com.supermarket1.constants;

public class Constants {
	public static final String CONFIG_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\config.properties";
	public static final String PDF_FILE_PATH = "file:\\" + System.getProperty("user.dir")
			+ "\\src\\main\\resources\\PdfFiles";

	public static final String EXTENT_REPORT_PATH = System.getProperty("user.dir") + "\\ExtentReport";

	/** Login page **/
	public static final String EXPECTED_COLOR_ALERT_TEXT_INVALIDDATA = "rgba(220, 53, 69, 1)";
	/** manage content--manage page **/
	public static final String IMAGEUPLOAD_MANAGEPAGE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad";

	/** ManageContentPage **/
	public static final String EXPECTED_ATTRIBUTE_FOR_SUCESSRESETALERT = "alert alert-success alert-dismissible";
	public static final String EXPECTED_COLOR_NEW_OPTION = "rgba(220, 53, 69, 1)";
	public static final String EXPECTED_COLOR_RESET_OPTION = "rgba(248, 249, 250, 1)";

	/** Manage order page **/
	public static final String EXPECTED_ORDERID_LISTORDER = "406";

	/** Manage location page **/
	public static final String EXPECTED_ALERTFOR_DELETE = "Do you want to delete this Location?";

	/** Manage slide page **/
	public static final String IMAGEUPLOAD_MANAGESLIDE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad\\grocery.png";

	/** Manage offer page **/
	public static final String IMAGEUPLOAD_MANAGEOFFER_CODE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad\\grocery.png";
	public static final String EXPECTED_SUCESSS_ALERT = "alert alert-success alert-dismissible";

	/** Manage category page **/
	public static final String IMAGEUPLOAD_MANAGE_CATEGORY = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad\\pastry.png";
	public static final String IMAGEUPLOAD_MANAGE_SUBCATEGORY = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad\\subcategory.png";

	/** Mobile slide page **/
	public static final String IMAGEUPLOAD_MOBILE_SLIDER = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\ImageUpLoad\\bakeproduct.png";

	/** Manage delivery boy page **/
	public static final String EXPECTED_TEXT_SEARCH = "Max08_11_2022_11_24_19";


	/** Manage users page **/
	public static final String EXPECTED_ATTTRIBUTE_VALUE = "alert alert-success alert-dismissible";
}