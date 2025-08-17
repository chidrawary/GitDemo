package stepDefinitions;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class Hooks 
{
	public TestContextSetUp context;
	WebDriver driver;
	
	public Hooks(TestContextSetUp context)
	{
		this.context = context;
	}
	
	@After
	public void AfterScenario()
	{
		context.driver.quit();
	}
	
	@AfterStep
	public void AfterStepScenario(Scenario scenario) throws IOException
	{
	
		if(scenario.isFailed())
		{
		driver = context.driver;
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		byte[] file = FileUtils.readFileToByteArray(source);
		scenario.attach(file, "image/png", "image");
		}

	}
}



