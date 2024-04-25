package org.stepblazedemo;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	    
	    List<WebElement> price = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[6]"));
	    
	    double lowestPrice = Double.MAX_VALUE;
	    
	    int lowestPriceIndex = -1;
	    
	    for (int i = 0; i < price.size(); i++) {
			WebElement priceElement = price.get(i);
			String priceText = priceElement.getText().replace("$", "");
			double prices = Double.parseDouble(priceText);
			if (prices < lowestPrice) {
				
				lowestPrice = prices;
				lowestPriceIndex = i;
			}
		}
	    
	    List<WebElement> chooseflight = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[1]/input"));
	    WebElement Button = chooseflight.get(lowestPriceIndex);
	    Button.click();
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
	   
	   
	    
	}

	@When("To check the price format as {string}")
	public void to_check_the_price_format_as(String string) {
		
		WebElement AFTElement = driver.findElement(By.xpath("//div[@class='container']/p[4]"));
		
		String AFTstring = AFTElement.getText();
		
		Pattern compile = Pattern.compile("\\d{3}\\.\\d{2}");
		
		Matcher matcher = compile.matcher(AFTstring);
		
		if (matcher.find()) {
			System.out.println("Match with the format of xxx.xx");
		} else {
			System.out.println("does not match with the format of xxx.xx");
		}
	    
	}

	@When("Click on the {string} button")
	public void click_on_the_button(String string) {
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	}

	@When("To navigated to the Purchase Confirmation page")
	public void to_navigated_to_the_Purchase_Confirmation_page() {
	   String title = driver.getTitle();
	   System.out.println("Parchase page Title: " +title);
	}

	@When("The {string} should be stored in the console or test report for future reference")
	public void the_should_be_stored_in_the_console_or_test_report_for_future_reference(String string) {
	    System.out.println("Data stored");
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   System.out.println("Browser closed");
	}


}
