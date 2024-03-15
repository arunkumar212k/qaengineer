package org.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.utilities.PageObjects;

public class CreateGoal extends BaseTest{
	
	@Test
	public void  create_agoal() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
		PageObjects elm = new PageObjects(driver);
		elm.loginpage_username.sendKeys(OR.getProperty("username"));
		elm.loginpage_password.sendKeys(OR.getProperty("password"));
		Thread.sleep(1000);
		elm.rememberme.click();
		assertTrue(elm.login_button.isDisplayed());
		elm.login_button.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		elm.toggle.click();
		elm.perfomance.click();
		elm.goals.click();
		elm.mygoals.click();
		elm.create_goal.click();
		Thread.sleep(2000);
		elm.enter_goal_name.sendKeys(OR.getProperty("username"));
		Thread.sleep(2000);
		elm.duedate.click();
		elm.duedate.clear();
		elm.duedate.sendKeys(OR.getProperty("date"));
		Thread.sleep(2000);
		elm.priority.click();
		elm.high_priority.click();
		elm.addweight.clear();
		elm.addweight.sendKeys(OR.getProperty("weight"));
		Thread.sleep(2000);
		elm.image1.click();
		elm.insert_image.click();
		elm.source_editbox.sendKeys(OR.getProperty("image_upload_goal"));
		elm.ok_button.click();
		elm.save_button2.click();
		
		assertTrue(elm.create_goal_username.isDisplayed(),"Admin is shown");
		String create_goal_username_text = elm.create_goal_username.getText();
		System.out.println("the employment details is:"+ create_goal_username_text);
		assertEquals(create_goal_username_text,"Admin");
		
		assertTrue(elm.priority_high.isDisplayed(),"High priority is shown");
		String priority_high_text = elm.priority_high.getText();
		System.out.println("the priority high text is:"+ priority_high_text);
		assertEquals(priority_high_text,"High");
		
		assertTrue(elm.duedate_name.isDisplayed(),"duedate is shown");
		String duedate_name_text = elm.duedate_name.getText();
		System.out.println("the duedate text is:"+ duedate_name_text);
		assertEquals(duedate_name_text,"2024-03-20");
	
	}

}
