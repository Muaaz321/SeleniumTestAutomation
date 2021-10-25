package Challanges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

	   List<WebElement>	rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	   int count = rows.size();
	   System.out.println("Total rows " + count);
	   
	   
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2;i<=count;i++) {
			String ActualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(ActualXpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Magazzini Alimentari Riuniti")) {
				System.out.println("I found the Company " + element.getText() + " is position at " + i);
				break;
			}
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		
		driver.close();
		
	}

}
