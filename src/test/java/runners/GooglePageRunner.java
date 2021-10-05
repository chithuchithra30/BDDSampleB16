package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//", 
		glue = { "stepdefs" },
		dryRun = false, // Will display the result without opening browser, will verify whether all steps are defined or not(Helpful before actually running)
		monochrome = true, // Will provide more readable output(won't display junk characters in the console)
		plugin = {"pretty", //more verbose console output
				"html:target//reports//report.html",
//				"usage:target//reports//usagereport",
//				"json:target//reports//jsonreport.json"
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}  
		)
public class GooglePageRunner extends AbstractTestNGCucumberTests {
		@Override	
		@DataProvider(parallel=true)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	}
