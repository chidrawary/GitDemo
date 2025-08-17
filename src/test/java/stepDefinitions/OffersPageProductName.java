package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OffersPage;
import utils.TestContextSetUp;

public class OffersPageProductName 
{
	
	TestContextSetUp context;
	
	public OffersPageProductName(TestContextSetUp context)
	{
		this.context = context;
	}
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page_to_check_if_product_exists(String stringValue) throws InterruptedException 
	{
		
//		OffersPage offerspage = new OffersPage(context.driver);	
		OffersPage offerspage = context.pageObjectManager.Offerspage();

		Thread.sleep(4000);
		offerspage.Topdeals();			
		Thread.sleep(2000);
		context.genericUtils.SwitchToChildWindow();	
		
		Thread.sleep(2000);
		offerspage.searchItem(stringValue);	
		context.offersPage = offerspage.getProductName();	
		System.out.println(context.offersPage + " " + "is extracted from offers page");		
		Thread.sleep(2000);		
	}
	
	@Then("validate that the product name matches with greencart page and offers page")
	public void validate_that_the_product_name_matches_with_greencart_page_and_offers_page()
	{
        Assert.assertEquals(context.ProductName, context.offersPage); 
		
		
		
	}
}