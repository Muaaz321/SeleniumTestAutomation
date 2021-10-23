package Challanges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaraouselNoon {

	static WebDriver driver;

	public static void main(String[] args) {
		
		 List<String> currentoptions = new ArrayList<>();
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");


		WebElement nextButton = driver.findElement(By.xpath("//div[starts-with(@class,'swiper-button-next custom-navigation swiper-nav-')][1]"));

		
		while(nextButton.isDisplayed()) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			nextButton.click();
			System.out.println("Clicked in while loop");
			
			List<WebElement> productname = 
					driver.findElements(By.xpath("//div[@class='swiper-container "
							+ "swiper-container-initialized swiper-container-horizontal' and "
							+ "@data-qa='widget_productCarousel'][1]"));
			
           for(WebElement e:productname) {	
        	   
        	   
        	   currentoptions.add(e.getText());
        	   
			}
           
		}

		



		driver.close();
		driver.quit();



	}

}
