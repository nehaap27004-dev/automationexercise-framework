package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ContactUsPage;

public class ContactUsTest extends BaseClass {
	
	@Test
	public void verifyContactUsPageNavigation() {
	
	    // Create ContactUsPage object
	    ContactUsPage contact = new ContactUsPage(driver);
	
	    // Click Contact Us menu
	    contact.clickContactUsMenu();
	
	    // Get page text
	    String actualText = contact.getGetInTouchText();
	
	    // Print text
	    System.out.println("Page Text: " + actualText);
	
	    // Verify Contact Us page opened
	    Assert.assertTrue(actualText.contains("GET IN TOUCH"));
	}

	@Test
	public void verifyContactFormSubmission() {

		
		// Create ContactUsPage object
		ContactUsPage contact = new ContactUsPage(driver);
	
		// Click Contact Us menu
		contact.clickContactUsMenu();
	
		// Enter Name
		contact.enterName("Test User");
	
		// Enter Email
		contact.enterEmail("nehaap27004@gmail.com");
	
		// Enter Subject
		contact.enterSubject("Automation Testing");
	
		// Enter Message
		contact.enterMessage("This is a Selenium automation test message.");
	
		// Click Submit
		contact.clickSubmitButton();
	
		// Accept Alert Popup
		contact.acceptAlert();
	
		// Get Success Message
		String successMessage = contact.getSuccessMessage();
	
		// Print Message
		System.out.println("Success Message: " + successMessage);
	
		// Verify Success Message
		Assert.assertTrue(successMessage.contains("Success"));
	

	}
	@Test
	public void verifyFileUploadSubmission() {

		
		// Create ContactUsPage object
		ContactUsPage contact = new ContactUsPage(driver);
	
		// Click Contact Us menu
		contact.clickContactUsMenu();
	
		// Enter Name
		contact.enterName("Test User");
	
		// Enter Email
		contact.enterEmail("testuser@gmail.com");
	
		// Enter Subject
		contact.enterSubject("File Upload Testing");
	
		// Enter Message
		contact.enterMessage("Testing file upload using Selenium.");
	
		// Upload File
		String filePath = System.getProperty("user.dir")
				+ "/testdata/testng.xml";

				contact.uploadFile(filePath);

		// Click Submit
		contact.clickSubmitButton();
	
		// Accept Alert
		contact.acceptAlert();
	
		// Get Success Message
		String successMessage = contact.getSuccessMessage();
	
		// Print Message
		System.out.println("Success Message: " + successMessage);
	
		// Verify Success Message
		Assert.assertTrue(successMessage.contains("success"));
	}

}
