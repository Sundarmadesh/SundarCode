package org.stepblazedemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.stepblazebase.Baseblazedemo;

import cucumber.api.java.en.When;

public class DesWeek extends Baseblazedemo {
	
	@When("Navigate {string}")
	public void navigate(String string) {
		passurl("https://blazedemo.com/index.php");
	}
	
	@When("To click on the hyperlink {string}")
	public void to_click_on_the_hyperlink(String string) {
		
	    WebElement hyper = driver.findElement(By.xpath("//a[@href='vacation.html']"));
	    hyper.click();
	    
	}

	@When("Then a new tab should open in the browser")
	public void then_a_new_tab_should_open_in_the_browser() {
		
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
			for (String page : child) {
			
			if (!page.equals(main)) {
				
				System.out.println("Hyperlink opens in a new tab");	
			} else {
				System.out.println("Hyperlink does not open in a new tab");
			}
			}
		}
		
	@When("URL should contain the string {string}")
	public void url_should_contain_the_string(String string) {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("vacation")) {
			System.out.println("URL contains the word 'vacation'");
		}else {
			System.out.println("URL does not contains the word 'vacation'");
		}
		
	}

	@When("To navigate back to the home page tab")
	public void to_navigate_back_to_the_home_page_tab() {
	    driver.findElement(By.className("brand")).click();
	}

}
