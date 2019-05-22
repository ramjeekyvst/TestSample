package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {
	WebDriver driver;
	public  signInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[@class='page-heading ng-binding']")
	WebElement SignInText;
	public WebElement SignIn()
	{
		return SignInText;
	}


}
