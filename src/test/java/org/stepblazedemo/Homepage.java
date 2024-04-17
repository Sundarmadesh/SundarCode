package org.stepblazedemo;

import org.stepblazebase.Baseblazedemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage extends Baseblazedemo {
	
	@Given("To launch the chrome application")
	public void to_launch_the_chrome_application() {
	    LaunchBrowser();
	    Winmax();
	}

	@When("To navigate {string}")
	public void to_navigate(String string) {
	    passurl("https://blazedemo.com/index.php");
	}

	@Then("To verify the page title as {string}")
	public void to_verify_the_page_title_as(String string) {
		
		String s = "Welcome to the Simple Travel Agency!";
	    String title = driver.getTitle();
	    
	    if (s.equals(title)) {
			System.out.println("The page title is: " +s);
		} else {
			System.out.println("The page Title is:" +title);
		}
}
}
