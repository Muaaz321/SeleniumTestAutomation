package Challanges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulationSolution {

	// todo Calendar 
	
	
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		String xpath_current_population = "//div[@class='maincounter-number']//span[@class='rts-counter']";
		String xpath_today_population = "//div[contains(text(),'Today')]//parent::div//span[@class='rts-counter']";
		String xpath_thisyear_population = "//div[contains(text(),'This year')]//parent::div//span[@class='rts-counter']";

		String xpath_today_this_year_population = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		
		
		
		driver.get("https://www.worldometers.info/world-population/");

		int Count=1;
		
		while(Count<=20) {
			System.out.println(Count+" = Seconds");
			if(Count==21) break;
			
		System.out.println("---------- Current Population Count ---------------");
		printPopulationData(xpath_current_population);
		
		
		System.out.println("---------- Today and This Year population Count---------------");
		printPopulationData(xpath_today_this_year_population);
		
		System.out.println("============================================================");
		
		Thread.sleep(1000);
		Count++;
		}
	}

	public static void printPopulationData(String locator) throws InterruptedException {

			List<WebElement> populationList=driver.findElements(By.xpath(locator));
			for(WebElement e:populationList) {
				System.out.println(e.getText());
				
				//driver.findElements(By.xpath(locator)).stream().forEach(e -> System.out.println(e.getText()));
				
			}		
		}
	}








