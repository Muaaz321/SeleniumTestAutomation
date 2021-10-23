package OrangehrmTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import Pages.OrangehrmLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	
private static WebDriver driver = null;
	
public static void main(String[] args) {
	
	try {
	Orangehrm();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}	

public static void Orangehrm() {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");

	OrangehrmLogin orangelogin = new OrangehrmLogin(driver);
	orangelogin.Login("Admin", "admin123");

	driver.close();
	driver.quit();

}
	
}
