package TestNGTests;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
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
public class NewTest{
	
	private static WebDriver driver = null;
	
  @Ignore
  public void OrangehrmLogin() {
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");


	  //WebDriver driver = new FirefoxDriver();
	  //ChromeDriver driver = new ChromeDriver();	
	  
	  //WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  Login.username(driver).sendKeys("Admin");
	  Login.password(driver).sendKeys("admin123");
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
	  Assert.assertTrue(false);
  }
  
  @Test
  public void Tester2() {
	  
	  System.out.println("I am inside test 2");
	  throw new SkipException("This test is skipped");
  }
  
}
