package org.stepblazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepblazebase.Baseblazedemo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class blazedemobooking extends Baseblazedemo{
	
	@When("Navigate to {string}")
	public void navigate_to(String string) {
	    passurl("https://blazedemo.com/index.php");
	}

	@When("Select {string} as the departure city")
	public void select_as_the_departure_city(String string) {
		
	    WebElement dep = driver.findElement(By.name("fromPort"));
	    Select s = new Select(dep);
	    s.selectByVisibleText("Mexico City");
	}

	@When("Select {string} as the destination city")
	public void select_as_the_destination_city(String string) {
		
	    WebElement des = driver.findElement(By.name("toPort"));
	    Select s = new Select(des);
	    s.selectByVisibleText("London");
	}

	@When("To click on the button {string}")
	public void to_click_on_the_button(String string) {
	    WebElement Find = driver.findElement(By.xpath("//input[@type='submit']"));
	    Find.click();
	}

	@When("To choose the flight with the lowest price")
	public void to_choose_the_flight_with_the_lowest_price() {
	    
	    WebElement chooseflight = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
	    
	    chooseflight.click();
	    
	    
	}

	@When("Should be navigated to the purchase page")
	public void should_be_navigated_to_the_purchase_page() {
	    driver.findElement(By.id("inputName")).sendKeys("Sundararajan");
	    driver.findElement(By.name("address")).sendKeys("29, 2nd Cross street, Chennai");
	    driver.findElement(By.name("city")).sendKeys("Chennai");
	    driver.findElement(By.id("state")).sendKeys("Tamilnadu");
	    driver.findElement(By.name("zipCode")).sendKeys("6000126");
	    
	    WebElement card = driver.findElement(By.name("cardType"));
	    Select s = new Select(card);
	    s.selectByVisibleText("American Express");
	    
	    driver.findElement(By.id("creditCardNumber")).sendKeys("2367986756439090");
	    
	   driver.findElement(By.id("creditCardMonth")).sendKeys("07");
	   
	   driver.findElement(By.id("creditCardYear")).sendKeys("2027");
	   
	   driver.findElement(By.id("nameOnCard")).sendKeys("SUNDARARAJAN M");
	   
	   driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	    
	}

	@When("To check the price format as {string}")
	public void to_check_the_price_format_as(String string) {
	    
	}

	@When("Click on the {string} button")
	public void click_on_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("To navigated to the Purchase Confirmation page")
	public void to_navigated_to_the_Purchase_Confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("The {string} should be stored in the console or test report for future reference")
	public void the_should_be_stored_in_the_console_or_test_report_for_future_reference(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
