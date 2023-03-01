package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoPage;
import pompages.HomePage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BaseClass 
{
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaForSeleniumPage coreJava;
	protected CoreJavaVideoPage javavideo;
	protected TestingPage testing;
	protected ContactUsPage contact;
	
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	 public void classConfiguration()
	 {
		 property= new PropertiesUtility();
		 excel= new ExcelUtility();
		 web= new WebDriverUtility();
		 
		 property.propertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		 excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		 
		 
		 
	 }
	@BeforeMethod
	public void methodConfiguration()
	{
		long time= Long.parseLong(property.fetchProperty("timeouts"));
		 driver=web.openApplication(property.fetchProperty("browser"), 
				 property.fetchProperty("url"), time);
		 
		 home= new HomePage(driver);
		 Assert.assertTrue(home.getLogo().isDisplayed());
		 skillraryDemo= new SkillraryDemoAppPage(driver);
		 selenium=new SeleniumTrainingPage(driver);
		 coreJava=new CoreJavaForSeleniumPage(driver);
		 javavideo=new CoreJavaVideoPage(driver);
		 testing=new TestingPage(driver);
		 contact = new ContactUsPage(driver); 
		 
		 
	}
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
}



