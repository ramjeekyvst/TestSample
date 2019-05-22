package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindDoctorsLocationsPage {
	WebDriver driver;
	public FindDoctorsLocationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy(linkText="California - Northern")
  WebElement California_Northern;
  @FindBy(id="zip")
	WebElement ZIP;
	@FindBy(id="searchButton")
	WebElement Search;
	public WebElement ZipCode()
	{
		return ZIP;
	}
	public WebElement searchButton()
	{
		return Search;
	}
  
  public WebElement selectRegion()
  {
	  return California_Northern;
  }
}
