package org.stepblazebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseblazedemo {
	
	public static WebDriver driver;
	
	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	public static void Winmax() {
		driver.manage().window().maximize();

	}
	
	public static void passurl(String str) {
		driver.get(str);
	}
	
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void pageurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void CloseBrowser() {
		driver.quit();
	}
	
	public static void passtext(WebElement txt, String s) {
		txt.sendKeys(s);
	}
	
	public static void btnclick(WebElement clk) {
		clk.click();
	}

}
