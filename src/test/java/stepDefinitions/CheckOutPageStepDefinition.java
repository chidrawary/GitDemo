package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinition
{
 public CheckOutPage checkoutpage;
	
	TestContextSetUp context;
	
	public CheckOutPageStepDefinition(TestContextSetUp context)
	{
		this.context = context;
	}
	
	
	@Then("^User proceeds to checkout and validate the (.+) items in the checkout page$")
	public void User_proceed_to_checkout(String name) throws InterruptedException
	{
		checkoutpage = context.pageObjectManager.getcheckoutPage();
		Thread.sleep(2000);
		checkoutpage.CheckoutItems();
		Thread.sleep(2000);

	}
	
	@Then("validate that the user can apply promocode and place the order")
	public void validate_user_can_apply_promocode_and_place_order()
	{
		Assert.assertTrue(checkoutpage.verifyPromoBtn());
		
		Assert.assertTrue(checkoutpage.placeOrder());
	}
}