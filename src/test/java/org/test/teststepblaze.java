package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sundar\\eclipse-workspace\\blazedemocucumber\\src\\test\\resources\\blazedemo\\blaze.feature",
glue = "org.stepblazedemo", monochrome = true, strict = false, dryRun = false)

public class teststepblaze {
	
	

}
