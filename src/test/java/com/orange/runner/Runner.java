package com.orange.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features", 
	glue = "com.orange",  
	plugin = {
		"pretty",
		"summary",
		"html:target/cucumber-reports/html-report.html",
		"json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	},
	monochrome = false,
	publish = true,
	dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {

}
