package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	

	    @Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	    	
	    	System.out.println("User is on landing page print");
	       
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	       
	    	System.out.println("User login into application with username and password print");
	    }

	    @Then("^user will be able to verify the homepage$")
	    public void user_will_be_able_to_verify_the_homepage() {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("user will be able to verify the homepage print");
	    }

	    @And("^verify cards details$")
	    public void verify_cards_details() throws Throwable {
	       System.out.println("verify cards details print");
	    }
	    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	        
	    	System.out.println(strArg1 +strArg2+ "abc");
	    	
	    	
	    }

	}


