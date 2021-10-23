package Challanges;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		
		
		//List<WebElement> information = driver.findElements(By.xpath("//div[@class='maincounter-number']"));
		
		List<WebElement> information = driver.findElements(By.xpath("//div[contains(text(),'Today')]/"));
		
		for(WebElement e:information) {
			System.out.println("ELEMENT = " + e);
		}
		
		

		
		driver.close();
		driver.quit();
	}

}
