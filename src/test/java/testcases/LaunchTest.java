package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LaunchTest extends BaseClass {


	@Test
	public void verifyWebsiteLaunch() {
		// Get website title
	    String actualTitle = driver.getTitle();
	    // Print title in console
	    System.out.println("Website Title: " + actualTitle);
	    // Verify title
	    Assert.assertEquals(actualTitle, "Automation Exercise");
	}

}
