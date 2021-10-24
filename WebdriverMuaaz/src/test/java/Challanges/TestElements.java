package Challanges;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//List<WebElement> information = driver.findElements(By.xpath("//div[@class='maincounter-number']"));
		
		String todayBirth = "//span[@class='rts-counter' and @rel='births_today']";
		String DeathToday = "//span[@class='rts-counter' and @rel='dth1s_today']";
		String PopulationGrowth = "//span[@class='rts-counter' and @rel='absolute_growth']";
		
		int count=1;
		while(count<=20) {
		population(todayBirth);
		population(DeathToday);
		population(PopulationGrowth);
		
		count++;
		}
		
       
		driver.close();
		driver.quit();
	}
	
			public static void population(String population) {
		
				List<WebElement> numberofpeople = driver.findElements(By.xpath(population));						
				List<Integer> todayBirthlist = new ArrayList<>();		
			
				for(WebElement e:numberofpeople) {
				System.out.println(e.getText());
				}	
		
	}
	
	
}


         