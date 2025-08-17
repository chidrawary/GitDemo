package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBase 
{
	
	public WebDriver driver;	
	public WebDriver WebDriverManager() throws IOException, InterruptedException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("QAurl");	
		
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		String browser = browser_maven !=null ? browser_maven : browser_properties;
		
		if(driver == null)
		{
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
						
			}
			
			if(browser.equalsIgnoreCase("firefox"))
			{
			
				driver = new FirefoxDriver();
			}
				
			if(browser.equalsIgnoreCase("Edge"))
			{
				driver = new EgdeDriver();
			}
			
			if(browser.equalsIgnoreCase("Safari"))
			{
				driver = new SafariDriver();
			}
			
			if(browser.equals("Google"))
			{
				driver = new GoogleDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			
			Thread.sleep(2000);						
		}		
		return driver;		
	}
}
