package com.crm.testclass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.webpages.FlipHomepage;

public class Logintest extends BaseClass{
	@BeforeMethod
	public void initial() {
		initialization();
	}
	@Test
	
	public void flip() {
		FlipHomepage pg = new FlipHomepage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pg.login();
		
		pg.enteremail();
		pg.pswd();
		pg.in();
	}
	@AfterMethod 
	public void close() {
		driver.quit();
	}

}
