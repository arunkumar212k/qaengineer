package org.testsuite;

import java.lang.reflect.Method;

import org.testcases.LoginTest;
import org.testcases.Training;
import org.testng.annotations.Test;

public class Trainingtestsuite extends Training {
	
		@Test(priority = 1)
		public void verify_login_test(Method method) throws Exception {
		verifytraining();
		verifyleave();
	//	verifyleave();
		}

}
