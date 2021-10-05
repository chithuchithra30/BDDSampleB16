package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
//		publish = true,
//		features = "src//test//resources//CRMFeatures//", 
//		glue = { "stepdefs" },
//		dryRun = false, 
//		monochrome = true, 
//		plugin = {"pretty", "html:target//reports//report1.html"}
//		)

@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedfeatures//Contact.feature", 
		glue = { "stepdefs" },
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "html:target//reports//report1.html"},
		tags = "@RegressionTest or @SmokeTest"
//		tags = "@RegressionTest"
//		tags = "not @RegressionTest",
//		tags = "@RegressionTest or @SmokeTest"
//		tags = "@RegressionTest and @SmokeTest"
//		tags = "@RegressionTest and not @SmokeTest"
//		tags = "not @SmokeTest"
		
		
// to select scenarios from selected features
//		tags = "@FunctionalTest and @RegressionTest"
//		tags = "@FunctionalTest"
//		tags = "@RegressionTest and not @EndToEndTest" //selected scenario and exclude from specific feature file
//		tags = "not @RegressionTest and not @SmokeTest"
//		tags = "@EndToEndTest and @FunctionalTest and @SmokeTest"
//		tags = "@EndToEndTest or @FunctionalTest or @SmokeTest"
		)
public class CRM_TaggedContact_Runner extends AbstractTestNGCucumberTests{

}
