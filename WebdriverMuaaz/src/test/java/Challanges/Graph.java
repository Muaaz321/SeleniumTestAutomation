package Challanges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Graph {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("+++ Headless ++++");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://emicalculator.net/");
		Thread.sleep(5000);
		
	   String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
	   String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
	   
	    List<WebElement> barsList =  driver.findElements(By.xpath(verticalXpath));
	    
	    System.out.println(barsList.size());
	    
	    Actions act = new Actions(driver);
	    for(WebElement e:barsList) {
	    	act.moveToElement(e).perform();
	    	//Thread.sleep(500);
	    	String text = driver.findElement(By.xpath(textXpath)).getText();
	    	
	    	System.out.println(text);
	    }
	
	    
	    driver.close();
	    driver.quit();
	}

}
