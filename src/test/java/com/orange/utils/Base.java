package com.orange.utils;

import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver;
	
	public int TIME_OUT = 10;
	
	public String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/auth/login";
	
	public static String USER_ADMIN = "Admin";
	public static String PASSWORD_ADMIN = "admin123";
	public static long MILI_SECONDS = 2000;
}
