package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doctorSearchResultPage {
	WebDriver driver;
	public doctorSearchResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"doctors\"]/div/div[1]/search-result-doctor/div/div[2]/a")
	WebElement doctorName;
	public WebElement DoctorName() {
		return doctorName;
		
	}

}
