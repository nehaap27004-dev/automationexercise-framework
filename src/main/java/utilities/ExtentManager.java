package utilities;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	
	public static ExtentReports extent;
	
	public static ExtentReports getReportInstance() {
	
	    if (extent == null) {
	
	        ExtentSparkReporter sparkReporter =
	                new ExtentSparkReporter(
	                        "reports/ExtentReport.html");
	
	        sparkReporter.config()
	                .setReportName("Automation Exercise Report");
	
	        sparkReporter.config()
	                .setDocumentTitle("Selenium Automation Report");
	
	        extent = new ExtentReports();
	
	        extent.attachReporter(sparkReporter);
	    }
	
	    return extent;
	}


}
