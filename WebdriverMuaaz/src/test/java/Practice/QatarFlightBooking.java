package Practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Practice.TestBase;



public class QatarFlightBooking {
	
	
	
	@BeforeTest
	public void Setup( ) throws IOException {
		TestBase.init();
//		
//		try {
//			TestBase.extent.attachReporter(TestBase.htmlReporter);
//			TestBase.extent.setSystemInfo("Hostname", "LocalHost");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	
	@Test
	public static void SelectFromTo() throws InterruptedException {
		
		TestBase.test = TestBase.extent.createTest("Select From Test ");
		
		
		try {
			List<WebElement> acceptAll = TestBase.driver.findElements(By.xpath("//a[@id='cookie-close-accept-all']"));
			if(acceptAll.size()>0) {
			acceptAll.get(0).click();
			}
			TestBase.test.log(Status.PASS,"Test case passed - AcceptAll");
			
			TestBase.driver.findElement(By.xpath("//a[@class='btn knowmore' and @role='button']")).click();

			
			Thread.sleep(2000);
			
			try {
			TestBase.js.executeScript("window.scrollBy(0,300)");
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			TestBase.driver.findElement(By.xpath("//input[@class='input-base-elem tt-input' and @id='T7-from']")).sendKeys("Colombo");
			TestBase.test.log(Status.PASS,"Test case passed - FromDate");
			
			Thread.sleep(2000);
			
			WebElement DropdownToSelection = TestBase.driver.findElement(By.xpath("//div[@class='tt-dataset tt-dataset-default']/div/strong[contains(text(),'Colombo')]"));
			
			
			try {
			DropdownToSelection.click();
			TestBase.test.log(Status.PASS,"Test case passed - Colombo Selected");
			}catch (Exception e) {
				e.getStackTrace();
			}
			TestBase.driver.findElement(By.xpath("//div[@class='input-base autocomplete-typeahead']/span/input[@class='input-base-elem tt-input' and @id='T7-to']")).click();
			
			TestBase.driver.findElement(By.xpath("//input[@class='input-base-elem tt-input' and @id='T7-to']")).sendKeys("Dubai");
			
			Thread.sleep(2000);
			
			WebElement DropdownFromSelenium = TestBase.driver.findElement(By.xpath("//div[@class='tt-dataset tt-dataset-default']/div/strong[contains(text(),'Dubai')]"));
			
			try {
				DropdownFromSelenium.click();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			List<WebElement> date = TestBase.driver.findElements(By.xpath("//table[@class='table-condensed']/thead/tr/th[@colspan='5' and @class='month']"));
			WebElement Arrow =  TestBase.driver.findElement(By.xpath("//i[@class='icon-arrow-right']"));
			
			ArrayList<String> allDate = new ArrayList<>();
					
			int i=0;
			for(WebElement e:date) {
				System.out.println(e.getText());			
				String[] Month = e.getText().split(" ");	

					Arrow.click();

			}
		} catch (InterruptedException e) {

			TestBase.test.log(Status.FAIL,"Test case Fail");
			
	
			e.printStackTrace();
		}
		
		TestBase.TearDown();

	}

}
