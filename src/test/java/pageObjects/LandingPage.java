package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage 
{
	public WebDriver driver;
		
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search =	By.xpath("//input[@type='search']");
	By productname = By.xpath("//h4[@class = 'product-name']");
	By increment = By.xpath("//a[@class = 'increment']");
	By addToCart = By.xpath("//button[text() = 'ADD TO CART']");
	
	public void searchItem(String shortName)
	{
		driver.findElement(search).sendKeys(shortName);
		
	}
	
	public String getProductName()
	{
		return driver.findElement(productname).getText();
	}
	
	public void incrementQuantity(int quantity)
	{
		int i = quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
		
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
}
