package Core;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		System.out.println(getCredentialsMap().get("customer"));
		System.out.println(getCredentialsMap().get("legal"));
		System.out.println(getCredentialsMap().get("Admin"));//Admin:admin123
		
		
		//String AdminCredentials = getCredentialsMap().get("Admin");//Admin:admin123
		
		//driver.findElement(By.name("txtUsername")).sendKeys(AdminCredentials.split(":")[0]);//Admin --> retrive only username
		//driver.findElement(By.name("txtPassword")).sendKeys(AdminCredentials.split(":")[1]);// -- > retieve only password
		
		
		//Using a generic method
		driver.findElement(By.name("txtUsername")).sendKeys(getUsername("Admin"));
		driver.findElement(By.name("txtPassword")).sendKeys(getPassword("Admin"));
				
		
	}

	
	
	public static HashMap<String, String> getCredentialsMap() {
		
	HashMap<String, String> userMap = new HashMap<>();
	
	userMap.put("Admin", "Admin:admin123");
	userMap.put("customer", "Admin:admin123");
	userMap.put("legal", "Admin:admin123");
	
	return userMap;
		
	}
	
	
	
	public static String getUsername(String role) {	
		String Credentials = getCredentialsMap().get(role);
		return Credentials.split(":")[0];
	}
	
	
	public static String getPassword(String pwd) {	
		String Credentials = getCredentialsMap().get(pwd);
		return Credentials.split(":")[1];
	}
	
	
}
