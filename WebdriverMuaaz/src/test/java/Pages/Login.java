package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	static WebElement element = null;
	
	public static WebElement username(WebDriver driver) {
		
		
		  element= driver.findElement(By.name("txtUsername"));
		  return element;
		
	}
	
	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.name("txtPassword"));
		return element;
		
	}
	
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.name("Submit"));
		return element;
	}
}
