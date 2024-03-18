package org.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.utilities.PageObjects;

import com.aventstack.extentreports.util.Assert;
import com.google.inject.spi.Element;

import io.reactivex.rxjava3.functions.Action;

public class LoginTest extends BaseTest {

	String os;
	PageObjects pageobjects;

	@Test
	public LoginTest login() throws InterruptedException {
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
		elm.employee_list.click();
		Thread.sleep(1000);
		return this;
	}

	@Test
	public LoginTest empDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		elm.employee_list.click();
		Thread.sleep(1000);
		elm.add_emp_button.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		// WebElement chooseFile =
		// driver.findElement(By.xpath("//label[@id='photo-preview-lable']"));
		// chooseFile.sendKeys("/QAtesting/src/main/arun_1.jpg");
		elm.firstname.sendKeys(OR.getProperty("firstname"));
		elm.secondname.sendKeys(OR.getProperty("middlename"));
		elm.lastname.sendKeys(OR.getProperty("lastname"));
		elm.autogenerate_toggle.click();
		elm.country_selectdropdown.click();
		elm.country_selectdropdown2.click();
		Thread.sleep(2000);
		elm.datepicker.click();
		elm.datepicker.clear();
		elm.datepicker.sendKeys(OR.getProperty("date"));
		Thread.sleep(2000);
		elm.employee_id.sendKeys(OR.getProperty("emp_id"));
		Thread.sleep(3000);
		elm.create_login_details_toggle_on.click();
		elm.createlogin_username.sendKeys(OR.getProperty("create_login_username"));
		elm.createlogin_password.sendKeys(OR.getProperty("create_login_password"));
		Thread.sleep(1000);
		elm.createlogin_confirmpass.sendKeys(OR.getProperty("create_login_confirm_password"));
		elm.adminrole_dropdown.click();
		Thread.sleep(2000);
		elm.adminrole_dropdown2.click();
		Thread.sleep(2000);
		elm.all_regions_toggle.click();
		elm.select_regions_dropdown.click();
		elm.select_regions_dropdown2.click();
		assertTrue(elm.selected_india_label.isDisplayed(), "India is selected");
		String india_label = elm.selected_india_label.getText();
		System.out.println("The selected label is :" + india_label);
		Thread.sleep(1000);
		elm.selected_location_toggle.click();
		elm.selected_location_dropdown.click();
		elm.select_location_dropdown2.click();
		Thread.sleep(1000);
		elm.next_button.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		return this;
	}

	@Test
	public LoginTest personalDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		assertTrue(elm.personal_details_title.isDisplayed(), "Personal details title is shown");
		String personal_details_title = elm.personal_details_title.getText();
		System.out.println("the personal details is:" + personal_details_title);
		assertEquals(personal_details_title, "Personal Details");
		Thread.sleep(1000);
		elm.personal_details_next.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		return this;
	}

	@Test
	public LoginTest employmentDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		assertTrue(elm.employment_details_title.isDisplayed(), "Employment Details title is shown");
		String employment_details_title = elm.employment_details_title.getText();
		System.out.println("the employment details is:" + employment_details_title);
		assertEquals(employment_details_title, "Employment Details");
		elm.employee_status.click();
		elm.employee_status2.click();
		elm.comment.sendKeys("comments");
		elm.personal_details_next.click();
		return this;
	}

	@Test
	public LoginTest contactDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		assertTrue(elm.contact_details_title.isDisplayed(), "Contact Details title is shown");
		String contact_details_title = elm.contact_details_title.getText();
		System.out.println("the contact details is:" + contact_details_title);
		assertEquals(contact_details_title, "Contact Details");
		elm.personal_details_next.click();
		// elm.other_id.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		return this;
	}

	@Test
	public LoginTest OnboardingDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		assertTrue(elm.Onboarding_title.isDisplayed(), "Onboarding title is shown");
		String Onboarding_title = elm.Onboarding_title.getText();
		System.out.println("the Onboarding title is:" + Onboarding_title);
		assertEquals(Onboarding_title, "Onboarding");
		Thread.sleep(2000);
		elm.onboarding_dropdown.click();
		elm.onboarding_dropdown2.click();
		elm.save_button.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		assertTrue(elm.success_toast.isDisplayed(), "Success toast is shown");
		String success_toast = elm.success_toast.getText();
		System.out.println("the employment details is:" + success_toast);
		assertEquals(success_toast, "Successfully Saved");

		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		return this;
	}

	@Test
	public LoginTest verifyAllDetails() throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);
		elm.personal_details_button.click();
		Thread.sleep(1000);
		String verifyfirstname = elm.verify_firstname.getAttribute("value");
		System.out.println("the first name is:" + verifyfirstname);

		String verifymiddlename = elm.verify_lastname.getAttribute("value");
		System.out.println("the last name is:" + verifymiddlename);
	
		String verifylastname = elm.verify_middlename.getAttribute("value");
		System.out.println("the middle name is:" + verifylastname);

		String verifyempid = elm.verify_employeeid.getAttribute("value");
		System.out.println("the employeeid name is:" + verifyempid);

		elm.logout_button.click();
		Thread.sleep(1000);
		// elm.logout_button2.click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		return this;

	}

	@Test
	public LoginTest creating_a_goal() throws InterruptedException {
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

		return this;

	}
	
	
	public LoginTest verify_created_data () throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		PageObjects elm = new PageObjects(driver);

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
		return this;

}
}