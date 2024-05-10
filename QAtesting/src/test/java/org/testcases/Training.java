package org.testcases;

import java.util.Set;

import org.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.utilities.PageObjects;

import setup.test.Actionutility;

public class Training extends BaseTest{
String os;
PageObjects pageobjects;


	public Training verifytraining() throws Exception {
		LoginTest logintest = new LoginTest();
		logintest.login();
		return this;
	}
	
	/*public Training verifyleave() throws Exception{
		System.out.println("hi null");
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		this.logintest.login();
		return this;

	}*/

	public Training verifyleave() throws InterruptedException {
		System.out.println("hi null");
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		Thread.sleep(5000);
		System.out.println("the webelement is"+ elm.attendance);
		elm.attendance.click();
		String mainwindowHandles = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle: windowHandles) {
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			
			
			if (handle != mainwindowHandles) {
				driver.close();
				
			}
		
		}
		driver.switchTo().window(mainwindowHandles);  
		return this;
		
		
	}
	
	

}
