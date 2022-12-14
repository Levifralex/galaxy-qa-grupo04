package com.orange.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features", 
	glue = "com.orange",  
	plugin = {
			"pretty",
			"summary",
			"html:target/test-report.html",
			"json:target/cucumber.json",
			"junit:target/cucumber.xml"
	},
	monochrome = false,
	publish = true,
	dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {

}
