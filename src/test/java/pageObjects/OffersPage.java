package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage 
{
	WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By topDeals =	By.xpath("//a[@href= '#/offers']");
	
	By search = By.xpath("//input[@type= 'search']");
	
	By productname = By.xpath("//td[1]");
	
	
	public void Topdeals()
	{
		driver.findElement(topDeals).click();
		

	}
	
	public void searchItem(String stringValue)
	{
		driver.findElement(search).sendKeys(stringValue);

	}
	
	public String getProductName()
	{
		return driver.findElement(productname).getText();
	}
	
}
