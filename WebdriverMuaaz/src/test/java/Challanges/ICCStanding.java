package Challanges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCStanding {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.cse.lk/");
		
		String aspi = "//div[@class='quick-chart-content aspi']";
		String snp = "//div[@class='quick-chart-content snp']";
		
		List<WebElement> ASPI = driver.findElements(By.xpath(aspi));
		List<WebElement> SandP = driver.findElements(By.xpath(snp));
		
		System.out.println("ASPI INDEX");
		for(WebElement e:ASPI) {
			System.out.println(e.getText());
		}
		
		System.out.println("S & P INDEX");
		for(WebElement e:SandP) {
			System.out.println(e.getText());
		}
		
		
		driver.close();
		
	}

}
