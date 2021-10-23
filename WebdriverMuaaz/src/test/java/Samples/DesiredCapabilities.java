package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"//Drivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
}
