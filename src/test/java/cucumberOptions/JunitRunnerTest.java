package cucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/features", glue = "stepDefinitions", monochrome = true,
tags="@search or @PlaceOrder", plugin = {"html:target//test_1.html" , 
		"json:target//test_1.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"rerun:target//FailedTest.txt"})
public class JunitRunnerTest
{
	
}