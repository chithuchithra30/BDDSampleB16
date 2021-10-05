package runners;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//
//@CucumberOptions(
//		publish = true,
//		features = "src//test//resources//features//GooglePage.feature",
//		glue = { "stepdefs" },
//		monochrome=true,
//		plugin= {"pretty"}
//		)

@CucumberOptions(

		features = "src//test//resources//taggedfeatures//Deal.feature")

public class JUnitRunner {

}
