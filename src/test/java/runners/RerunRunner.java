package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "@target//failed_sceanrios.txt", 
		glue = { "stepdefs" },
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty"}
				
		)
public class RerunRunner extends AbstractTestNGCucumberTests{

}
