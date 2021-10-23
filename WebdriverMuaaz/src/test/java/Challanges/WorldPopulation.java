package Challanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation {

	
	@Test
	public void worldpopulation() throws InterruptedException {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		
//		
		driver.get("https://www.worldometers.info/world-population/");
		
		
		String number = driver.findElement(By.xpath("//div[@class='maincounter-number']//span[@class='rts-counter']")).getText();

		System.out.println(number);
	
		number = number.replaceAll("\\s", "");
		number = number.replaceAll(",", "");
		
		System.out.println("After remove all  "+number);
		
		try {
		long worldpopulation = Long.parseLong(number);
		System.out.println(worldpopulation);
		
		while(true) {	
			
			System.out.println(worldpopulation);			
			
		}
		
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		
		driver.close();
		driver.quit();
		
	}
	

	
}
