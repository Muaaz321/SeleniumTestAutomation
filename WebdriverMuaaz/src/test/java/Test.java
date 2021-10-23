import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	
	
	//System.setProperty("webdriver.chrome.driver", "C://Users//muaaz.mohideen//eclipse-workspace//WebdriverMuaaz//chromeDriver.exe");
	
	@org.testng.annotations.Test
	public void SampleTest() {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");

	}
}
