package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage 
{
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By bag = By.xpath("//img[@alt = 'Cart']");
	By checkout = By.xpath("//button[text() = 'PROCEED TO CHECKOUT']");
	By promocode = By.xpath("//button[@class='promoBtn']");
	By PlaceOrder = By.xpath("//button[text()='Place Order']");
	
	public void CheckoutItems()
	{
		driver.findElement(bag).click();
		driver.findElement(checkout).click();
	}
	
	public boolean verifyPromoBtn()
	{
		return driver.findElement(promocode).isDisplayed();
	}
	
	public boolean placeOrder()
	{
		return driver.findElement(PlaceOrder).isDisplayed();
	}
}