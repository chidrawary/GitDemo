package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp 
{
	public WebDriver driver;
	public String ProductName;
	public String offersPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;

    public TestContextSetUp() throws IOException, InterruptedException 
    {
        testBase = new TestBase();
        driver = testBase.WebDriverManager();       
        pageObjectManager = new PageObjectManager(driver);
        
		 genericUtils = new GenericUtils(driver);

    }
}
