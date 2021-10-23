package Challanges;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));	
		List<String> urlList = new ArrayList<>();
		
		for(WebElement e:links) {
			String url = e.getAttribute("href");

			//checkBrokenLink(url); // this is normal way of checking broken links
			urlList.add(url);
			//System.out.println("FROM THE ARRAY LIST" + urlList.size());
		}
		
		//to retieve specific item from the webelement
		//System.out.println("item of " +urlList.get(200));

		long stTime = System.currentTimeMillis();
		 urlList.parallelStream().forEach(e->checkBrokenLink(e)); // this is parallel way of checking broken links
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time taken :" + (stTime - endTime));
	}
	
	
	public static void checkBrokenLink(String linkurl) {
		
		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode()>=400) {
				System.out.println(linkurl + "---->"+ httpUrlConnection.getResponseMessage() + "  is a broken link");
			}else {
				System.out.println(linkurl + "---->" + httpUrlConnection.getResponseMessage());
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
