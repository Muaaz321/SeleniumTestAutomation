package Streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamswithLambda {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://amazon.com/");
		
		List<WebElement> linklist=driver.findElements(By.xpath("//a"));
		System.out.println(linklist.size());
		
//		for(WebElement element: linklist) {
//			System.out.println(element.getText());
//		}
		
//		linklist.forEach(ele -> System.out.println(ele.getText()));
		
		//remove all blank space in links 
		
		List<String> collection  =linklist.
				stream().
						filter(ele->!ele.getText().equals("")).
								map(ele ->ele.getText()).
										collect(Collectors.toList());
		
		collection.forEach(ele -> System.out.println(ele));
		
		
		driver.quit();
		
	}

}
