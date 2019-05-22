package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginLandingPage {
	WebDriver driver;
	public  loginLandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Doctors & Locations")
	WebElement doctorLocationlink;
	public WebElement DLLink()
	{
		return doctorLocationlink;
	}
	

}
