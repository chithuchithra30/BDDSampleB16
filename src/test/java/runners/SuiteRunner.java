package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = ".", //or we can give the feature path also
		glue = { "stepdefs" },
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "rerun:target//failed_sceanrios.txt"}
				
		)
public class SuiteRunner extends AbstractTestNGCucumberTests{

}
