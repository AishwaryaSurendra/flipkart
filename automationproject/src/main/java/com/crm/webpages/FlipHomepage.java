package com.crm.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;

public class FlipHomepage extends BaseClass {
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	WebElement login;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement create;

	
	public 	FlipHomepage() {
		PageFactory.initElements(driver, this);
	}
	
public  void login(){
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	login.click();
		
	}
	public void enteremail() {
		email.sendKeys("aishwaryasurendra6898@gmail.com");
	
}
public void pswd() {
	password.sendKeys("aishu@12695");
}
public void in() {
	create.click();
}
}
