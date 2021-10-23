package Samples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestNG {

	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setup() {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	
	@org.testng.annotations.Test
	public void Test() {
		ExtentTest test = extent.createTest("MyExtent","Sample Descrition");
		//test.info(null);
		//test.fail("Details",MediaEntityBuilder.createScreenCaptureFromPath("", ""));
		
		
		//test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterSuite
	public void teardown() {}
	
	
	
	
}
