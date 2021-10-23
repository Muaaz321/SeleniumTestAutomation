package TestNGTests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import Pages.Login;
import Pages.OrangehrmLogin;

// @Listeners(TestNGTests.Listeners.class) defined in the testngxml
public class NewTestChrome{
	
	private static WebDriver driver = null;
	
  @Test
  @Parameters({"username","password"})
  public void OrangehrmLogin(@Optional String username,String password) {
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");


	  //WebDriver driver = new FirefoxDriver();
	  //ChromeDriver driver = new ChromeDriver();	
	  
	  //WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  Login.username(driver).sendKeys(username);
	  Login.password(driver).sendKeys(password);
	  Login.submit(driver).click();

	  

	  driver.quit();

  }
  
  @Test
  public void Tester() {
	  
	  System.out.println("I am inside test 1");
  }
  
  @Test
  public void Tester1() {
	  
	  System.out.println("I am inside test 1");
	  AssertJUnit.assertTrue(false);
  }
  
  @Test
  public void Tester2() {
	  
	  System.out.println("I am inside test 2");
	  throw new SkipException("This test is skipped");
  }
  
}
