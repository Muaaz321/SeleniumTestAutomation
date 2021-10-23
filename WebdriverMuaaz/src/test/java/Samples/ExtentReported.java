package Samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.Login;


public class ExtentReported {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		ExtentTest test = extent.createTest("MyExtent","Sample Descrition");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		test.log(Status.INFO, "Login to demo site");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.pass("Logged In");

		Login.username(driver).sendKeys("Admin");
		test.pass("Enter username");


		Login.password(driver).sendKeys("admin123");
		test.pass("Enter password");

		Login.submit(driver).click();
		test.pass("Submit");



		driver.close();
		driver.quit();
		test.log(Status.INFO, "Closed Browser");
		extent.flush();




	}
}
