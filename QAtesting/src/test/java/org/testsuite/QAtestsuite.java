package org.testsuite;

import java.lang.reflect.Method;

import org.base.BaseTest;
import org.testcases.LoginTest;
import org.testng.annotations.Test;

public class QAtestsuite extends LoginTest {
	@Test(priority = 1)
	public void verify_login_test(Method method) throws InterruptedException {
		login();

	}
	@Test(priority = 2)
	public void verify_empdetails(Method method) throws InterruptedException {
		empDetails();
	}
	@Test(priority = 3)
	public void verify_pageDetails(Method method) throws InterruptedException {
		personalDetails();
		employmentDetails();
		contactDetails();
		OnboardingDetails();

	}
	@Test(priority = 4)
	public void verify_all_details(Method method) throws InterruptedException {
		verifyAllDetails();

	}
	@Test(priority =5)
	public void verify_creating_goal(Method method) throws InterruptedException {
		creating_a_goal();
		verify_created_data();
		
	}
	
}
