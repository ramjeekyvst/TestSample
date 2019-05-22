package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myDoctorOnlinePage {

		WebDriver driver;
		public myDoctorOnlinePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@class='search-box clear-input-textbox' and @type='text']")
		WebElement searchForDoctorTextBox;
		@FindBy(xpath="//button[@class='search-submit-button']")
		WebElement SearchButton;
		@FindBy(linkText="My Care")
		WebElement MyCareLink;
		@FindBy(xpath="/html/body/mdo-package/mdo-frame/div/main/div/mdo-content/div/div/div[1]/mdo-tiles/section/div/a[4]/span[2]/span[1]")
		WebElement immunizationRecordLink;
		public WebElement SearchForDoctor()
		{
			return searchForDoctorTextBox;
		}
		public WebElement searchButtoon()
		{
			return SearchButton;
		}
		public WebElement MyCare()
		{
			return MyCareLink;
		}
		public WebElement immunizationRecordLink()
		{
			return immunizationRecordLink;
		}

}
