package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchFoundPage {
	WebDriver driver;
	public searchFoundPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Your Pregnancy")
	WebElement Pregnancy;
	
	public WebElement PregnancyLink()
	{
		return Pregnancy;
	}
}
