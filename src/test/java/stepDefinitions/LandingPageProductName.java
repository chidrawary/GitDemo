package stepDefinitions;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetUp;

public class LandingPageProductName 
{
	
	LandingPage landingpage;
	
	TestContextSetUp context;
	
	public LandingPageProductName(TestContextSetUp context)
	{
		this.context = context;
	}
	

	@Given("user is landed on greencart page")
	public void user_is_landed_on_greencart_page() throws InterruptedException, IOException 
	{
		context.testBase.WebDriverManager();
		
	}		

	
	@When("^user searched with shortname (.+) & extracted actual product name$")
	public void user_searched_with_shortname_extracted_actual_product_name(String shortName) throws InterruptedException 
	{		
		landingpage = context.pageObjectManager.getlandingPage();
		
		landingpage.searchItem(shortName);
		
		Thread.sleep(2000);
		
		context.ProductName = landingpage.getProductName().split("-")[0].trim();
		
		System.out.println(context.ProductName + " " + "is extracted from Product page");
		
	}
	
	@When("user increases the quantity till {string} and added to the cart")
	public void quantity_increment_add_cart(String Quantity) throws InterruptedException
	{
		
		landingpage.incrementQuantity(Integer.parseInt(Quantity));
		Thread.sleep(2000);
		landingpage.addToCart();
		Thread.sleep(4000);
	}
	
	
	
	
	
	
	
}