package org.test;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Automation Testing\\Clonefolder\\SundarCode\\src\\test\\resources\\blazedemo\\blaze.feature",
glue = "org.stepblazedemo", monochrome = true, strict = false, dryRun = false, plugin = {
"json:F:\\Automation Testing\\Clonefolder\\SundarCode\\Reports\\Json\\report.json"})

public class teststepblaze  {
	
			@AfterClass
			public static void report() {
			
				JvmReport.reportjvm("F:\\\\Automation Testing\\\\Clonefolder\\\\SundarCode\\\\Reports\\\\Json\\\\report.json");
				

			}

	}


