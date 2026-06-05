package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {


	@Test
	public void verifyValidLogin() {
	
	    // Create LoginPage object
	    LoginPage lp = new LoginPage(driver);
	
	    // Click Signup/Login
	    lp.clickSignupLogin();
	
	    // Enter registered email
	    lp.enterEmail("nehaap27004@gmail.com");
	
	    // Enter password
	    lp.enterPassword("Neha@2004");
	
	    // Click Login button
	    lp.clickLoginButton();
	
	    // Get Logged in text
	    String actualText = lp.getLoggedInText();
	
	    // Print text
	    System.out.println("Login Text: " + actualText);
	
	    // Verify login successful
	    Assert.assertTrue(actualText.contains("Logged in as"));
	}
	/*
	@Test
	public void verifyInvalidLogin() {

		// Create LoginPage object
		LoginPage lp = new LoginPage(driver);
	
		// Click Signup/Login
		lp.clickSignupLogin();
	
		// Enter invalid email
		lp.enterEmail("wrongtest@gmail.com");
	
		// Enter invalid password
		lp.enterPassword("wrongpassword");
	
		// Click Login button
		lp.clickLoginButton();
	
		// Get actual error message
		String actualMessage = lp.getLoginErrorMessage();
	
		// Print message
		System.out.println("Error Message: " + actualMessage);
	
		// Verify error message
		Assert.assertEquals(actualMessage,
		        "Your email or password is incorrect!");
		

	}
	*/
	@Test
	public void verifyLogoutFunctionality() {


		// Create LoginPage object
		LoginPage lp = new LoginPage(driver);
	
		// Click Signup/Login
		lp.clickSignupLogin();
	
		// Enter valid email
		lp.enterEmail("nehaap27004@gmail.com");
	
		// Enter valid password
		lp.enterPassword("Neha@2004");
	
		// Click Login
		lp.clickLoginButton();
	
		// Click Logout
		lp.clickLogoutButton();
	
		// Get current URL
		String actualURL = driver.getCurrentUrl();
	
		// Print URL
		System.out.println("Current URL: " + actualURL);
	
		// Verify redirected to login page
		Assert.assertEquals(actualURL,
		        "https://automationexercise.com/login");

	}




}
