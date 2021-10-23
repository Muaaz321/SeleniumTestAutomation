package SingletonFrameworkPages;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmApplyleavePages {
	WebDriver driver;

	public OrangehrmApplyleavePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="applyleave_txtLeaveType")
	WebElement LeaType;

	@FindBy(id="applyleave_txtFromDate")
	WebElement fromDate;

	@FindBy(id="applyleave_txtToDate")
	WebElement toDate;

	@FindBy(id="applyleave_txtComment")
	WebElement comment;

	@FindBy(id="applyBtn")
	WebElement Apply;


	public void ApplyLeaveform() {


		try {
			LeaType.sendKeys("CAN - Personal");
			fromDate.sendKeys("2021-11-18");
			toDate.sendKeys("2021-11-26");
			comment.sendKeys("Automated Comment");
			Apply.click();
		} catch (Exception e) {
			assertFalse(true);
			e.printStackTrace();
			System.out.println(e.getCause());
			
		}


	}



}
