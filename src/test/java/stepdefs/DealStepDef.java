package stepdefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DealStepDef {

	WebDriver driver;

	@Given("User has logged")
	public void user_has_logged() {
	    System.out.println("User has logged");
	}

	@When("User enters new deal details")
	public void user_enters_new_deal_details() {
		System.out.println("User has entered new deal details");
	}
	
	@When("User update deal details")
	public void user_update_deal_details() {
		System.out.println("User has updated deal details");
	}
	
	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("User has viewed deal details");
	}
	
	@When("User deleted a deal details")
	public void user_deleted_a_deal_details() {
		System.out.println("User has deleted a deal details");
	}
	
	@Given("User has logout")
	public void user_has_logout() {
		System.out.println("User has logged out");
	}

}
