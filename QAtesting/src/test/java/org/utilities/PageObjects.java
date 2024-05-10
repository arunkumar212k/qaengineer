package org.utilities;

import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects extends BaseTest{
	WebDriver driver;
	
	public PageObjects(WebDriver driver) {
		System.out.println("driver is:"+ driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	private static final String loginpage_username_xpath = "//input[@id='txtUsername']";
	@FindAll({ @FindBy(xpath = loginpage_username_xpath) })
	public WebElement loginpage_username;

	private static final String loginpage_password_xpath= "//input[@id='txtPassword']";
	@FindAll({@FindBy(xpath = loginpage_password_xpath)
	})
	public WebElement loginpage_password;

	private static final String rememberme_xpath= "//label[@class='remember-me-field']";
	@FindAll({@FindBy(xpath = rememberme_xpath)
	})
	public WebElement rememberme;
	
	private static final String login_button_xpath= "//button[contains(text(),'Login')]";
	@FindAll({@FindBy(xpath = login_button_xpath)
	})
	public WebElement login_button;
	
	private static final String employee_list_xpath= "//a[contains(text(),'Employee List')]";
	@FindAll({@FindBy(xpath = employee_list_xpath)
	})
	public WebElement employee_list;
	
	private static final String add_emp_button_xpath= "//div[@data-tooltip='Add Employee']";
	@FindAll({@FindBy(xpath = add_emp_button_xpath)
	})
	public WebElement add_emp_button;
	
	private static final String firstname_xpath= "//input[@id='first-name-box']";
	@FindAll({@FindBy(xpath = firstname_xpath)
	})
	public WebElement firstname;
	
	private static final String secondname_xpath= "//input[@id='middle-name-box']";
	@FindAll({@FindBy(xpath = secondname_xpath)
	})
	public WebElement secondname;
	
	private static final String lastname_xpath= "//input[@id='last-name-box']";
	@FindAll({@FindBy(xpath = lastname_xpath)
	})
	public WebElement lastname;
	
	private static final String autogenerate_toggle_xpath= "(//span[contains(text(),'Auto Generate Employee ID')]//following::div)[1]";
	@FindAll({@FindBy(xpath = autogenerate_toggle_xpath)
	})
	public WebElement autogenerate_toggle;
	
	
	private static final String country_selectdropdown_xpath= "//div[contains(@class,'filter-option-inner')]/div";
	@FindAll({@FindBy(xpath = country_selectdropdown_xpath)
	})
	public WebElement country_selectdropdown;
	
	
	private static final String country_selectdropdown2_xpath= "//option[contains(text(),'India Office')]";
	@FindAll({@FindBy(xpath = country_selectdropdown2_xpath)
	})
	public WebElement country_selectdropdown2;
	
	private static final String datepicker_xpath= "//input[@id='joinedDate']";
	@FindAll({@FindBy(xpath = datepicker_xpath)
	})
	public WebElement datepicker;
	
	private static final String employee_id_xpath= "//input[@id='employeeId']";
	@FindAll({@FindBy(xpath = employee_id_xpath)
	})
	public WebElement employee_id;
	
	private static final String next_button_xpath= "//button[@id='modal-save-button']";
	@FindAll({@FindBy(xpath = next_button_xpath)
	})
	public WebElement next_button;
	//input[@id='otherId']
	private static final String other_id_xpath= "//input[@id='otherId']";
	@FindAll({@FindBy(xpath = other_id_xpath)
	})
	public WebElement other_id;
	
	private static final String create_login_details_toggle_on_xpath= "(//span[contains(text(),'Create Login Details')]//following::div)[1]";
	@FindAll({@FindBy(xpath = create_login_details_toggle_on_xpath)
	})
	public WebElement create_login_details_toggle_on;
	
	private static final String createlogin_username_xpath= "//input[@id='username']";
	@FindAll({@FindBy(xpath = createlogin_username_xpath)
	})
	public WebElement createlogin_username;
	
	private static final String createlogin_password_xpath= "//input[@id='password']";
	@FindAll({@FindBy(xpath = createlogin_password_xpath)
	})
	public WebElement createlogin_password;
	
	private static final String createlogin_confirmpass_xpath= "//input[@id='confirmPassword']";
	@FindAll({@FindBy(xpath = createlogin_confirmpass_xpath)
	})
	public WebElement createlogin_confirmpass;
	
	private static final String adminrole_dropdown_xpath= "//button[@data-id='adminRoleId']";
	@FindAll({@FindBy(xpath = adminrole_dropdown_xpath)
	})
	public WebElement adminrole_dropdown;
	
	private static final String adminrole_dropdown2_xpath= "//span[contains(text(),'Regional HR Admin')]";
	@FindAll({@FindBy(xpath = adminrole_dropdown2_xpath)
	})
	public WebElement adminrole_dropdown2;
	
	private static final String personal_details_title_xpath= "//h4[contains(text(),'Personal Details')]";
	@FindAll({@FindBy(xpath = personal_details_title_xpath)
	})
	public WebElement personal_details_title;
	
	private static final String all_regions_toggle_xpath= "(//span[contains(text(),'All Regions')]//following::div)[1]";
	@FindAll({@FindBy(xpath = all_regions_toggle_xpath)
	})
	public WebElement all_regions_toggle;
	
	private static final String select_regions_dropdown_xpath= "//input[@placeholder='Select Regions']";
	@FindAll({@FindBy(xpath = select_regions_dropdown_xpath)
	})
	public WebElement select_regions_dropdown;
	
	private static final String select_regions_dropdown2_xpath= "//li[@id='IN']";
	@FindAll({@FindBy(xpath = select_regions_dropdown2_xpath)
	})
	public WebElement select_regions_dropdown2;
	
	private static final String selected_india_label_xpath= "(//p[contains(text(),'India')]//following::span)[2]";
	@FindAll({@FindBy(xpath = selected_india_label_xpath)
	})
	public WebElement selected_india_label;
	
	private static final String selected_location_toggle_xpath= "(//span[contains(text(),'Select Locations')]//following::div)[1]";
	@FindAll({@FindBy(xpath = selected_location_toggle_xpath)
	})
	public WebElement selected_location_toggle;
	
	private static final String selected_location_dropdown_xpath= "//input[@placeholder='Select Locations']";
	@FindAll({@FindBy(xpath = selected_location_dropdown_xpath)
	})
	public WebElement selected_location_dropdown;
	
	private static final String select_location_dropdown2_xpath= "(//span[contains(text(),'India Office')])[2]";
	@FindAll({@FindBy(xpath = select_location_dropdown2_xpath)
	})
	public WebElement select_location_dropdown2;
	
	private static final String personal_details_next_xpath= "//button[contains(text(),'Next')]";
	@FindAll({@FindBy(xpath = personal_details_next_xpath)
	})
	public WebElement personal_details_next;
	
	private static final String employment_details_title_xpath= "//h4[contains(text(),'Employment Details')]";
	@FindAll({@FindBy(xpath = employment_details_title_xpath)
	})
	public WebElement employment_details_title;
	
	
	private static final String employee_status_xpath= "//button[@data-id='employment_status_id']";
	@FindAll({@FindBy(xpath = employee_status_xpath)
	})
	public WebElement employee_status;
	
	private static final String employee_status2_xpath= "//span[contains(text(),'Full-Time Permanent')]";
	@FindAll({@FindBy(xpath = employee_status2_xpath)
	})
	public WebElement employee_status2;
	
	private static final String comment_xpath= "//textarea[@id='comment']";
	@FindAll({@FindBy(xpath = comment_xpath)
	})
	public WebElement comment;
	
	private static final String contact_details_title_xpath= "//h4[contains(text(),'Contact Details')]";
	@FindAll({@FindBy(xpath = contact_details_title_xpath)
	})
	public WebElement contact_details_title;
	
	private static final String Onboarding_title_xpath= "//h4[contains(text(),'Onboarding')]";
	@FindAll({@FindBy(xpath = Onboarding_title_xpath)
	})
	public WebElement Onboarding_title;
	
	private static final String onboarding_dropdown_xpath= "//input[@class='select-dropdown']";
	@FindAll({@FindBy(xpath = onboarding_dropdown_xpath)
	})
	public WebElement onboarding_dropdown;
	
	private static final String onboarding_dropdown2_xpath= "(//span[contains(text(),'Onboarding - India')])[1]";
	@FindAll({@FindBy(xpath = onboarding_dropdown2_xpath)
	})
	public WebElement onboarding_dropdown2;
	
	private static final String save_button_xpath= "//button[contains(text(),'Save')]";
	@FindAll({@FindBy(xpath = save_button_xpath)
	})
	public WebElement save_button;
	
	private static final String success_toast_xpath= "//div[contains(text(),'Successfully Saved')]";
	@FindAll({@FindBy(xpath = success_toast_xpath)
	})
	public WebElement success_toast;
	//div[contains(text(),'Employee Management')]
	private static final String employee_management_title_xpath= "//div[contains(text(),'Employee Management')]";
	@FindAll({@FindBy(xpath = employee_management_title_xpath)
	})
	public WebElement employee_management_title;
	
	private static final String verify_firstname_xpath= "//input[@id='firstName']";
	@FindAll({@FindBy(xpath = verify_firstname_xpath)
	})
	public WebElement verify_firstname;
	
	private static final String verify_middlename_xpath= "//input[@id='middleName']";
	@FindAll({@FindBy(xpath = verify_middlename_xpath)
	})
	public WebElement verify_middlename;
	
	private static final String verify_lastname_xpath= "//input[@id='lastName']";
	@FindAll({@FindBy(xpath = verify_lastname_xpath)
	})
	public WebElement verify_lastname;
	
	private static final String verify_employeeid_xpath= "//input[@id='employeeId']";
	@FindAll({@FindBy(xpath = verify_employeeid_xpath)
	})
	public WebElement verify_employeeid;
	
	private static final String personal_details_button_xpath= "//a[contains(text(),'Personal Details ')]";
	@FindAll({@FindBy(xpath = personal_details_button_xpath)
	})
	public WebElement personal_details_button;
	
	
	private static final String image_upload_xpath= "//div[@class='col-12 photo-preview']//img[@src='images/default-photo.png']";
	@FindAll({@FindBy(xpath = image_upload_xpath)
	})
	public WebElement image_upload;

	
	
	//xpath to create a goal
	
	
	private static final String perfomance_xpath= "//a[@id='menu_item_241'][2]";
	@FindAll({@FindBy(xpath = perfomance_xpath)})
	public WebElement perfomance;
	
	private static final String goals_xpath= "(//a[contains(text(),'Goals')])[1]";
	@FindAll({@FindBy(xpath = goals_xpath)})
	public WebElement goals;
	
	private static final String mygoals_xpath= "//a[contains(text(),' My Goals ')]";
	@FindAll({@FindBy(xpath = mygoals_xpath)})
	public WebElement mygoals;
	
	private static final String create_goal_xpath= "//span[contains(text(),'Create Goal')]";
	@FindAll({@FindBy(xpath = create_goal_xpath)})
	public WebElement create_goal;
	
	private static final String add_goal_xpath= "//h4[contains(text(),'Add Goal')]";
	@FindAll({@FindBy(xpath = add_goal_xpath)})
	public WebElement add_goal;
	
	private static final String enter_goal_name_xpath= "//input[@id='name_value']";
	@FindAll({@FindBy(xpath = enter_goal_name_xpath)})
	public WebElement enter_goal_name;
	
	private static final String duedate_xpath= "//input[@id='dueDate']";
	@FindAll({@FindBy(xpath = duedate_xpath)})
	public WebElement duedate;

	private static final String priority_xpath= "(//div[contains(@class,'filter-option-inner')]/div)[2]";
	@FindAll({@FindBy(xpath = priority_xpath)})
	public WebElement priority;
	
	private static final String high_priority_xpath= "//span[contains(text(),'High')]";
	@FindAll({@FindBy(xpath = high_priority_xpath)})
	public WebElement high_priority;
	
	private static final String addweight_xpath= "//input[@id='spinnerInputweight']";
	@FindAll({@FindBy(xpath = addweight_xpath)})
	public WebElement addweight;
	
	private static final String save_button2_xpath= "//span[contains(text(),'Save')]";
	@FindAll({@FindBy(xpath = save_button2_xpath)})
	public WebElement save_button2;
	
	private static final String toggle_xpath= "//a[@id='sidebar-toggle']";
	@FindAll({@FindBy(xpath = toggle_xpath)})
	public WebElement toggle;
	
	private static final String image1_xpath= "//i[@class='mce-ico mce-i-mce-ico mce-i-settings']";
	@FindAll({@FindBy(xpath = image1_xpath)})
	public WebElement image1;
	
	private static final String insert_image_xpath= "//i[@class='mce-ico mce-i-image']";
	@FindAll({@FindBy(xpath = insert_image_xpath)})
	public WebElement insert_image;
	
	private static final String source_editbox_xpath= "(//label[contains(text(),'Source')]//following::input)[1]";
	@FindAll({@FindBy(xpath = source_editbox_xpath)})
	public WebElement source_editbox;
	
	
	private static final String ok_button_xpath= "//span[contains(text(),'Ok')]";
	@FindAll({@FindBy(xpath = ok_button_xpath)})
	public WebElement ok_button;
	
	private static final String create_goal_username_xpath= "//div[@class='goal-name-container']";
	@FindAll({@FindBy(xpath = create_goal_username_xpath)})
	public WebElement create_goal_username;
	
	private static final String priority_high_xpath= "(//div[@class='goal-summary-value'])[2]";
	@FindAll({@FindBy(xpath = priority_high_xpath)})
	public WebElement priority_high;

	private static final String duedate_name_xpath= "(//div[@class='goal-summary-value'])[5]";
	@FindAll({@FindBy(xpath = duedate_name_xpath)})
	public WebElement duedate_name;
	
	private static final String logout_button_xpath= "//span[contains(text(),'Log Out')]";
	@FindAll({@FindBy(xpath = logout_button_xpath)})
	public WebElement logout_button;
	
	private static final String logout_button2_xpath= "//a[contains(text(),'Logout from all browsers')]";
	@FindAll({@FindBy(xpath = logout_button2_xpath)})
	public WebElement logout_button2;

	private static final String attendance_xpath = "(//span[contains(text(),'Leave')])[1]";
	@FindAll({ @FindBy(xpath = attendance_xpath) })
	public WebElement attendance;
}

