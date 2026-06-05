package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.time.Duration;
import java.time.Duration;
import org.testng.ITestResult;

import utilities.ScreenshotUtility;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import utilities.ExtentManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extent;

	public static ExtentTest test;

	@BeforeMethod
	public void setup() {
		extent = ExtentManager.getReportInstance();

		WebDriverManager.chromedriver().setup();
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		try {

		    Thread.sleep(4000);

		} catch (InterruptedException e) {

		    e.printStackTrace();
		}

		driver.get("https://automationexercise.com/");

		}

	@AfterMethod
	public void tearDown(ITestResult result) {

	
		// Create Test Entry
		test = extent.createTest(result.getName());
	
		// PASS Condition
		if (result.getStatus() == ITestResult.SUCCESS) {
	
		    test.log(Status.PASS,
		            "Test Passed");
		}
	
		// FAIL Condition
		else if (result.getStatus()
		        == ITestResult.FAILURE) {
	
		    test.log(Status.FAIL,
		            "Test Failed");
	
		    ScreenshotUtility.captureScreenshot(driver,
		            result.getName());
	
		    test.addScreenCaptureFromPath(
		            "Screenshots/"
		                    + result.getName()
		                    + ".png");
		}
	
		// SKIP Condition
		else {
	
		    test.log(Status.SKIP,
		            "Test Skipped");
		}
	
		// Save Report
		extent.flush();
	
		// Close Browser
		driver.quit();
	
	
		}




}
