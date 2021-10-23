package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangehrmLogin {

	WebDriver driver=null;
	
	public OrangehrmLogin(WebDriver driverc) {
		this.driver = driverc;
	}
	
	
	
	@FindBy(name = "txtUsername")
	WebElement Username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(name="Submit")
	WebElement submit;
	
	
	public void Login(String username,String password) {
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		submit.click();
		
	}
	
	
	
}
