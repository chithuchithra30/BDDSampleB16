package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMUsersStepDef {

	WebDriver driver;

	@Given("User is already in login page")
	public void user_is_already_in_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}
//
//		@When("User enters login credentials")
//		public void user_enters_login_credentials() {
//		    driver.findElement(By.name("email")).sendKeys("corpdevops@gmail.com");
//		    driver.findElement(By.name("password")).sendKeys("CrmPro123");
//		    driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
//		}

//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.name("email")).sendKeys(strUser);
//	    driver.findElement(By.name("password")).sendKeys(strPwd);
//	    driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
//
//	}
	
//	@When("User enters login credentials")
//	public void user_enters_login_credentials(DataTable userCred) {
//		List<List<String>> data = userCred.asLists();
//		
//		//record1 - col0, col1
//		//record2 - col0, col1
//	    driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	    driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
//	}

	// Getting as maps
	@When("User enters login credentials")
	public void user_enters_login_credentials(DataTable userCred) {
		List<Map<String, String>> data = userCred.asMaps();
		
		//record1 - col0, col1
		//record2 - col0, col1
	    driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
	    driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
	}
	@Then("User is on Home page")
	public void user_is_on_home_page() {
		boolean isValid = driver.findElement(By.className("user-display")).isDisplayed();
		Assert.assertTrue(isValid);
	}

	@Then("Browser is closed")
	public void browser_is_closed() {
		driver.close();
	}

}
