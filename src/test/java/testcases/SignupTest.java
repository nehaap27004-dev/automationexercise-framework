package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.SignupPage;

public class SignupTest extends BaseClass{
	@Test 
	public void verifyValidUserSignup() {
		// Create LoginPage object 
		LoginPage lp = new LoginPage(driver); 
		// Click Signup/Login menu 
		
		lp.clickSignupLogin();
		
		// Enter signup name 
		lp.enterSignupName("Neha"); 
		// Enter signup email 
		lp.enterSignupEmail("naap23455@gmail.com"); 
		// Click signup button 
		lp.clickSignupButton(); 
		// Verify Enter Account Information page 
		String actualTitle = driver.getTitle();
		System.out.println("Page Title: " + actualTitle); 
		Assert.assertEquals(actualTitle, "Automation Exercise - Signup");
	}
	@Test
	public void verifyExistingEmailSignup() {

		// Create LoginPage object
		LoginPage lp = new LoginPage(driver);

		// Click Signup/Login
		lp.clickSignupLogin();

		// Enter Name
		lp.enterSignupName("Neha");

		// Enter already registered email
		lp.enterSignupEmail("nehaap27004@gmail.com");

		// Click Signup button
		lp.clickSignupButton();

		// Get actual error message
		String actualMessage = lp.getEmailAlreadyExistMessage();

		// Print message
		System.out.println("Validation Message: " + actualMessage);

		// Verify message
		Assert.assertEquals(actualMessage,
				"Email Address already exist!");
	

	}
	
	@Test
	public void verifyAccountCreation() {

	// Create LoginPage object
	LoginPage lp = new LoginPage(driver);

	// Click Signup/Login
	lp.clickSignupLogin();

	// Enter Name
	lp.enterSignupName("Neha");

	// IMPORTANT:
	// Change email every execution
	lp.enterSignupEmail("nehaapne89998@gmail.com");

	// Click Signup Button
	lp.clickSignupButton();

	// Create SignupPage object
	SignupPage sp = new SignupPage(driver);

	// Select Title
	sp.selectTitle();

	// Enter Password
	sp.enterPassword("neha123");

	
	// Enter Personal Details
	sp.enterFirstName("Neha");

	sp.enterLastName("AP");

	sp.enterAddress("Trivandrum");

	// Select Country
	sp.selectCountry("India");

	// Enter Address Details
	sp.enterState("Kerala");

	sp.enterCity("TVM");

	sp.enterZipcode("695001");

	sp.enterMobileNumber("9876543210");

	// Click Create Account
	sp.clickCreateAccount();

	// Verify Account Created
	String actualTitle = driver.getTitle();

	System.out.println("Page Title: " + actualTitle);

	Assert.assertEquals(actualTitle,
	        "Automation Exercise - Account Created");

	}


}
