package stepdefs;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedContactStepDef {
	
	@Before(value="@RegressionTest",order=2)
	public void setupChrome() {
	    System.out.println("Initialize chrome driver for reg");
	}
	
	@Before(value="@RegressionTest",order=1)
	public void readPropFile() {
	    System.out.println("Read from property file for reg");
	}

	@Before(value="@RegressionTest",order=3)
	public void setupDB() {
	    System.out.println("Setup DB connection for reg");
	}
	
	@Before(value="@SmokeTest",order=2)
	public void setupEdge() {
	    System.out.println("Initialize edge driver for smoke");
	}
	
	@Before(value="@SmokeTest",order=1)
	public void readPropFile2() {
	    System.out.println("Read from property2 file for smoke");
	}

	@Before(value="@SmokeTest",order=3)
	public void setupDB2() {
	    System.out.println("Setup DB2 connection for smoke");
	}
	
//	@Before("@RegressionTest")
//	public void setupChrome() {
//	    System.out.println("Initialize chrome driver");
//	}
//	
//	@Before("@SmokeTest")
//	public void setupEdge() {
//	    System.out.println("Initialize edge driver");
//	}
	
//	@BeforeStep
//	public void setupStep() {
//	    System.out.println("Before each step");
//	}
	
//	@After
//	public void teardown() {
//	    System.out.println("Close chrome driver");
//	}
	
//	@AfterStep
//	public void teardownStep() {
//	    System.out.println("After each step");
//	}
	
//	@After("@RegressionTest")
//	public void teardownChrome() {
//	    System.out.println("Close chrome driver");
//	}
//	
//	@After("@SmokeTest")
//	public void teardownEdge() {
//	    System.out.println("Close edge driver");
//	}
	
	@After(order=2)
	public void teardownChrome() {
	    System.out.println("Close chrome driver");
	}
	
	@After(order=1)
	public void readPropFile1() {
	    System.out.println("Done reading from property file");
	}

	@After(order=3)
	public void setupDB1() {
	    System.out.println("Done DB connection setup");
	}

		@Given("User must have logged")
		public void user_must_have_logged() {
		    System.out.println("User has logged");
		}


		@When("User enters new contact details")
		public void user_enters_new_contact_details() {
			System.out.println("User has entered new contact details");
		}
		
		@When("User update contact details")
		public void user_update_contact_details() {
			System.out.println("User has updated contact details");
		}
		
		@When("User view contact details")
		public void user_view_contact_details() {
			System.out.println("User has viewed contact details");
		}
		
		@When("User deleted a contact details")
		public void user_deleted_a_contact_details() {
			System.out.println("User has deleted a contact details");
		}
		
		@Given("User logout")
		public void user_logout() {
			System.out.println("User has logged out");
		}




}
