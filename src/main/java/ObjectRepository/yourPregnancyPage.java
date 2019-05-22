
package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourPregnancyPage {
	WebDriver driver;
	public  yourPregnancyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='trimester MART-trimester-button1 ng-binding']")
	WebElement FirstTrimesterLink;
	@FindBy(xpath="//*[@id=\"timeline-bar\"]/div[2]/div/div/span[1]/a[4]")
	WebElement Week7Link;
	@FindBy(xpath="//*[@id=\"timeline-bar\"]/div[3]/div[1]/div[1]/span")
	WebElement Week7Text;
	@FindBy(linkText="Our Doctors")
	WebElement OurDoctorLink;
	public WebElement FirstTrimester()
	{
		return FirstTrimesterLink;
	}
	public WebElement Week7()
	{
		return Week7Link;
	}
	public WebElement TextWeek7()
	{
		return Week7Text;
	}
	public WebElement OurDoctor()
	{
		return OurDoctorLink;
	}

}
