package test.java;

import junit.framework.Assert;
import main.java.Ride_Logic;
import main.java.rideCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RideSteps {
	
	Ride_Logic ride = new Ride_Logic();
	rideCase riding = new rideCase();
	String action;
	@Given("^User enter \"([^\"]*)\" as source and \"([^\"]*)\" as Destination$")
	public void User_enter_as_source_and_as_Destination(String src, String dest) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setSource(src);
		ride.setDestination(dest);
	}

	@When("^user clicks \"([^\"]*)\"$")
	public void user_clicks(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		action=button;
	}

	@Then("^user should get \"([^\"]*)\" message$")
	public void user_should_get_message(String msg) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result= riding.ValidateRide(ride);
		Assert.assertEquals(msg, result);
		
	}



}
