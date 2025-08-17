package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager
{
	LandingPage landingpage;
	OffersPage offerspage;
	CheckOutPage checkoutpage;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getlandingPage()
	{

		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage Offerspage()
	{
		offerspage = new OffersPage(driver);
		return offerspage;
	}
	
	public CheckOutPage getcheckoutPage()
	{
		checkoutpage = new CheckOutPage(driver);
		return checkoutpage;
	}
}