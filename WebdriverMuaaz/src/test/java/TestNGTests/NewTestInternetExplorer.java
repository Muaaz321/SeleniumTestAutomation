package TestNGTests;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import Pages.Login;
import Pages.OrangehrmLogin;

public class NewTestInternetExplorer {
	
	private static WebDriver driver = null;
	
  @Test
  public void OrangehrmLogin() {
	  
	  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"//Drivers//IEDriverServer.exe");

	  //WebDriver driver = new FirefoxDriver();
	  //ChromeDriver driver = new ChromeDriver();	
	  
	  //WebDriverManager.chromedriver().setup();
	  driver = new InternetExplorerDriver();
	  
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  Login.username(driver).sendKeys("Admin");
	  Login.password(driver).sendKeys("admin123");
	  Login.submit(driver).click();

	  
	  driver.close();
	  driver.quit();
	  

  }
}
