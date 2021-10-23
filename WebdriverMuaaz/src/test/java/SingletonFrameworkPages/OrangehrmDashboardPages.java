package SingletonFrameworkPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmDashboardPages {

	WebDriver driver;
	
	public OrangehrmDashboardPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[4]/div/a/img")
	WebElement applyLeave;
	
	@FindBy(xpath ="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[4]/div/a/img")
	WebElement AssignLeave;
	
	
	public void ApplyLeave() {
		try {
		applyLeave.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
	
	
	
	
	
	
}
