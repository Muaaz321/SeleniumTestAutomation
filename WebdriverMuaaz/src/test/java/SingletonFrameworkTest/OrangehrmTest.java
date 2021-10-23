package SingletonFrameworkTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.OrangehrmLogin;
import SingletonFramework.Constant;
import SingletonFramework.ConstantAssert;
import SingletonFramework.TestBase;
import SingletonFrameworkPages.OrangehrmApplyleavePages;
import SingletonFrameworkPages.OrangehrmDashboardPages;
import SingletonFrameworkPages.OrangehrmLoginPage;

public class OrangehrmTest {

	
	
	@BeforeClass
	public void setUp() {
		TestBase.initialize();
		System.out.println("IN INITIALIZATION");
	}
	
	@Ignore
	@Test(priority = 1)
	public void verifyOrangeHrmTitleTest() {
		String title = TestBase.driver.getTitle();
		System.out.println("Title is " + title);
		Assert.assertEquals(title,ConstantAssert.loginTitle);
	}
	
	@Ignore
	@Test(priority = 1)
	public void logoTest() {
		Assert.assertEquals(TestBase.driver.findElement(By.id("divLogo")).isDisplayed(), true);
		
	}
	
	@Ignore
	@Test
	@Parameters({"orangeusername","orangepassword"})
	public void Login(@Optional("Admin") String username,@Optional("admin123") String password) throws InterruptedException {
		OrangehrmLoginPage Login = new OrangehrmLoginPage(TestBase.driver);
		Login.userLogin(username, password);
	}
	
	
	@Test(priority = 1)
	@Parameters({"orangeusername","orangepassword"})
	public void ApplyLeave(@Optional("Admin") String username,@Optional("admin123") String password) throws InterruptedException {
		
		OrangehrmLoginPage Login = new OrangehrmLoginPage(TestBase.driver);
		Login.userLogin(username, password);
		
		String ApplyLeave = TestBase.driver.findElement(By.xpath("//*[text()='Apply Leave']")).getText().toString();
		Assert.assertEquals(ApplyLeave, "Apply Leave");
		
		
		
		OrangehrmDashboardPages Dashboard = new OrangehrmDashboardPages(TestBase.driver);
		Dashboard.ApplyLeave();
		
		OrangehrmApplyleavePages ApplyLeave1 = new OrangehrmApplyleavePages(TestBase.driver);
		ApplyLeave1.ApplyLeaveform();
		
		//todo
		//String SuccessLeave = TestBase.driver.findElement(By.xpath("//*[text()='Apply Leave']")).getText().toString();
		//Assert.assertEquals(ApplyLeave, "Apply Leave");
		
		
		}
	
	
	@Test(priority = 1)
	@Parameters({"orangeusername","orangepassword"})
	public void AssignLeave(@Optional("Admin") String username,@Optional("admin123") String password) throws InterruptedException {
		
		OrangehrmLoginPage Login = new OrangehrmLoginPage(TestBase.driver);
		Login.userLogin(username, password);
		
		String AssignLeave = TestBase.driver.findElement(By.xpath("//*[text()='Assign Leave']")).getText().toString();
		Assert.assertEquals(AssignLeave, "Apply Leave");
		
		
		
		OrangehrmDashboardPages Dashboard = new OrangehrmDashboardPages(TestBase.driver);
		Dashboard.ApplyLeave();
		
		OrangehrmApplyleavePages ApplyLeave1 = new OrangehrmApplyleavePages(TestBase.driver);
		ApplyLeave1.ApplyLeaveform();
		
		//todo
		//String SuccessLeave = TestBase.driver.findElement(By.xpath("//*[text()='Apply Leave']")).getText().toString();
		//Assert.assertEquals(ApplyLeave, "Apply Leave");
		
		
		}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//TestBase.Close();
		TestBase.Quit();
	}
}
