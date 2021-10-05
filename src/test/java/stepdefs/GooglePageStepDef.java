package stepdefs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {

	WebDriver driver;

	@Given("I launch Google Page")
	public void i_launch_google_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
		driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		driver.findElement(By.name("q")).submit();
	}

	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		Assert.assertEquals("Java Tutorial - Google Search", driver.getTitle());
	}
	
	@When("I search Cucumber Tutorial")
	public void i_search_cucumber_tutorial() {
		driver.findElement(By.name("q")).sendKeys("Cucumber Tutorial");
		driver.findElement(By.name("q")).submit();
	}

	@Then("Should display Cucumber result page")
	public void should_display_cucumber_result_page() {
		Assert.assertEquals("Cucumber Tutorial - Google Search", driver.getTitle());
	}
	

	@When("I search Selenium Tutorial")
	public void i_search_selenium_tutorial() {
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		driver.findElement(By.name("q")).submit();
	}

	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals("Selenium Tutorial - Google Search", driver.getTitle());
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
	@After
	public void attachImage(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File screenshot = screen.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent, "image/png", "image1");
					
		}
	}

}
