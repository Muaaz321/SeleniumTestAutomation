package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Practice.TestBase;

public class TestBase {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent=null;
	public static ExtentTest test;


	public static Properties prop = new Properties();



	public static void init() throws IOException {

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Muaaz Automation");
		htmlReporter.config().setReportName("Muaaz Functional Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		
		
		InputStream input = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Practice//config.properties");
		
		
		System.out.println(System.getProperty("user.dir"));
		prop.load(input);
		System.out.println(prop.getProperty("browser"));

		switch (prop.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			
		default:
			break;
		}


		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();



		driver.get(prop.getProperty("Url"));			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	


	}




	public static void TearDown() {
		
		extent.flush();
		driver.close();
		driver.quit();
		
	}


}
