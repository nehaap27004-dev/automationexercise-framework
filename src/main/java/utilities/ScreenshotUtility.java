package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {


	public static void captureScreenshot(WebDriver driver,
	                                     String screenshotName) {
	
	    TakesScreenshot ts =
	            (TakesScreenshot) driver;
	
	    File sourceFile =
	            ts.getScreenshotAs(OutputType.FILE);
	
	    File destinationFile =
	            new File("Screenshots/"
	                    + screenshotName + ".png");
	
	    try {
	
	        FileUtils.copyFile(sourceFile,
	                destinationFile);
	
	        System.out.println("Screenshot saved successfully.");
	
	    } catch (IOException e) {
	
	        System.out.println("Unable to save screenshot.");
	
	        e.printStackTrace();
	    }
	}


}
