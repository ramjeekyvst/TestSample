package stepDefinition;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeOptions;

import ObjectRepository.FindDoctorsLocationsPage;
import ObjectRepository.doctorSearchResultPage;
import ObjectRepository.loginLandingPage;
import ObjectRepository.myDoctorOnlinePage;
import ObjectRepository.searchFoundPage;
import ObjectRepository.signInPage;
import ObjectRepository.yourPregnancyPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class stepDefinition {
	WebDriver driver;
	
	@Given("^Set Property for Chrome driver and initialized the Webdriver$")
	public void ChromeDriver() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();    
	}
	@When("^Get the property and launch the URL$")
	public void ReadPropertyFromPropertiesFile() throws Throwable {
		FileReader reader=new FileReader("qa.properties");
		Properties p=new Properties();
		p.load(reader);
		String URL=p.getProperty("url");
		driver.get(URL);
	}

	@Then("^Validate Title of the Website$")
	public void VerifyTitle() throws Throwable {
		String Title=driver.getTitle();
		System.out.println(Title);
		//Assert.assertEquals("Custom care & coverage just for you - Kaiser Permanente",Title,"Page Title  assertion is Failed");
	}
	@Given("^User is on Kaiser Login landing Page,clicked on the Doctor & Location Page link and selected region as California_Northern$")
	
	public void selectRegion()
	{
		loginLandingPage LP=new loginLandingPage(driver);
		LP.DLLink().click();
		FindDoctorsLocationsPage FDLPage=new FindDoctorsLocationsPage(driver);
		FDLPage.selectRegion().click();
		
	}
	@When("^User is on Find Doctors and Locations Page and entered below ZIPCODE and clicked on the Search button$")
	public void searchDoctorByZipCode(DataTable ZIP)
	{
		List<List<String>> Object=ZIP.raw();
		String Zip=Object.get(0).get(0);
		//int ZipCode=Integer.parseInt(Zip);
		FindDoctorsLocationsPage FDLPage=new FindDoctorsLocationsPage(driver);
		FDLPage.ZipCode().sendKeys(Zip);
		FDLPage.searchButton().click();	
		doctorSearchResultPage doctorSearch=new doctorSearchResultPage(driver);
		String doctorName=doctorSearch.DoctorName().getText();
		//Assert.assertEquals("Nivia Magdalena Acosta, MD", doctorName,"Doctor name assertion is Failed");
		System.out.println("GYN Doctor name is "+doctorName);
		doctorSearch.DoctorName().click();
	}
	
	@Then("^User is on Doctor Search results page and Search for GYN doctor$")
	
	public void searchForGynDoctorAndclikedOurPregnancyLink()
	
	{
		myDoctorOnlinePage DrOnlinePage=new myDoctorOnlinePage(driver);
		DrOnlinePage.SearchForDoctor().sendKeys("gyn");
		DrOnlinePage.searchButtoon().click();	
		searchFoundPage sPage=new searchFoundPage(driver);
		sPage.PregnancyLink().click();
		
	}
	@And("^User is on Your Pregnancy Page and selected seven week from 1stTrimetser Option and naviagted Sign In Page$")
	
	public void selectSevenWeekFromTrimesterAndNavigatedToSignInPage()
	
	{
	
		yourPregnancyPage pregnancyPage=new yourPregnancyPage(driver);
		Set<String>Ids=driver.getWindowHandles();
		Iterator<String> Id=Ids.iterator();
		String Parent=Id.next();
		String child=Id.next();
		driver.switchTo().window(child);
		pregnancyPage.FirstTrimester().click();
		pregnancyPage.Week7().click();
		String week=pregnancyPage.TextWeek7().getText();
		//Assert.assertEquals("Week 7",week,"Assertion is failed for Week 7 Text");
		pregnancyPage.OurDoctor().click();
		myDoctorOnlinePage DrOnlinePage=new myDoctorOnlinePage(driver);
		DrOnlinePage.MyCare().click();
		DrOnlinePage.immunizationRecordLink().click();
		signInPage signPage=new signInPage(driver);
		String SignText=signPage.SignIn().getText();
		//Assert.assertEquals("Sign in",SignText,"Assertion is failed fo Sign in Text validation");
		System.out.println("Title of the Page is "+ driver.getTitle());
		driver.quit();
	}


}
