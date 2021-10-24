package Challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		ArrayList<String> allLinks = new ArrayList<>();
		
		for(WebElement a:links) {
			String url = a.getAttribute("href");
			allLinks.add(url);
			System.out.println(url);
			
		}
		
		driver.close();driver.quit();
		
		
	}

}
