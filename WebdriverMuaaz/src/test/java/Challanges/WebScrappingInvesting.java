package Challanges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebScrappingInvesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.investing.com/currencies/streaming-forex-rates-majors");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		WebElement e = driver.findElement(By.xpath("//i[@class=\"popupCloseIcon largeBannerCloser\"]"));
		
		if(e.isDisplayed()) {
			e.click();
		}
		
		
		String Currencies = "//table[@id='cr1' and @class='genTbl closedTbl crossRatesTbl']";
		
		//List<WebElement> allCurrencies = driver.findElements(By.xpath(Currencies));
		
//		System.out.println("++++ Live FX Price ++++ ");
//		for(WebElement e:allCurrencies) {
//			System.out.println(e.getText());
//		}
		
		//List<WebElement> askandDate = driver.findElements(By.xpath("//tr[@id='pair_4']/td[@class='pid-4-ask' and @class='pid-4-time']"));

		
		System.out.println("Total Length " + Currencies.length());
		System.out.println("  FOREX  "+"  BID  "+" " + "  ASK  "+" "+ " HIGH  "+ " " + "LOW  ");
		
		String Bid = null;
		String Ask = null;
		String High = null;
		String Low = null;
		
		
		for(int i=1;i <= Currencies.length();i++) {
			
			String forex = driver.findElement(By.xpath("//tr[@id='pair_"+i+"']/td/a")).getText();
				
			Bid = driver.findElement(By.xpath("//tr[@id='pair_"+i+"']/td[@class='pid-"+i+"-bid']")).getText();
			
			Ask = driver.findElement(By.xpath("//tr[@id='pair_"+i+"']/td[@class='pid-"+i+"-ask']")).getText();
			
			High = driver.findElement(By.xpath("//tr[@id='pair_"+i+"']/td[@class='pid-"+i+"-high']")).getText();
			
			Low = driver.findElement(By.xpath("//tr[@id='pair_"+i+"']/td[@class='pid-"+i+"-low']")).getText();
			
			
						
			String connectval = forex + " " + Bid+ " " + Ask + " "+ High + " " + Low;
			
			System.out.println(connectval);

				
		}
			
		
		driver.close();
	}

}
