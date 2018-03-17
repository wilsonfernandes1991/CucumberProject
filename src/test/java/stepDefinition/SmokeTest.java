package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	@Given("^I open the Browser$")
	public void i_open_the_Browser() throws Throwable {
	    System.out.println("I open the Browser");
	    
	}

	@When("^I enter userName and password$")
	public void i_enter_user_name_and_password() throws Throwable {
	    System.out.println("I enter user name and password");
	    
	}

	@Then("^I verify home page$")
	public void i_verify_home_page() throws Throwable {
	    System.out.println("I verify home page");	    
	    
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    System.out.println("Browser Closed");
	   
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_username_and_password(String username, String password) throws Throwable {
	    System.out.println("User Name : "+username);
	    System.out.println("Password : "+password);
	}

}
