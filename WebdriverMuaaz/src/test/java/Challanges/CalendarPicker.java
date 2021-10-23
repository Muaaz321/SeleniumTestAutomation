package Challanges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPicker {

	static WebDriver driver;

	public static void main(String[] args) {
	

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		//Thread.sleep(10000);

		//		new WebDriverWait(driver, Duration.ofSeconds(5)).
		//			until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all")));
		//		
				WebDriverWait wdw = new WebDriverWait(driver, 10);
				wdw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all")));

		

		//String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();

		//System.out.println(monthyearval);

//		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
////		System.out.println(monthyearval);
//
////		String month = monthyearval.split(" ")[0].trim();
////		String year = monthyearval.split(" ")[1].trim();
//
//		while(!(month.equals("June") && year.equals("2022"))) {
//			driver.findElement(By.xpath("//a[@Title='Next']")).click();
//
//			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
//
//			System.out.println(monthyearval);
//
//			month = monthyearval.split(" ")[0].trim();
//			year = monthyearval.split(" ")[1].trim();		
//
//			driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();

		selectDate("16", "June", "2021");

		driver.close();
		driver.quit();

	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	   }
	


	public static void selectDate(String exDay, String exMonth, String exYear) {

		if(exMonth.equals("February") && Integer.parseInt(exDay)>29) {
			
		System.out.println("wrong date : " + exDay + " : " + exMonth);
		return;
			}
		
		
		if(Integer.parseInt(exDay) > 31) {
			System.out.println("wrong date : " + exDay + " : " + exMonth);
			return;
		}
		
		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearval);

//		String month = monthyearval.split(" ")[0].trim();
//		String year = monthyearval.split(" ")[1].trim();

		while(!(getMonthYear(monthyearval)[0].equals(exMonth) && 
						getMonthYear(monthyearval)[1].equals(exYear))) {
			driver.findElement(By.xpath("//a[@Title='Next']")).click();
			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();

//			System.out.println(monthyearval);
//
//			month = monthyearval.split(" ")[0].trim();
//			year = monthyearval.split(" ")[1].trim();		

			try {
			driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
			}catch (Exception e) {
				System.out.println("wrong date : " + exDay + " : " + exMonth);
			}
		}

	}
}