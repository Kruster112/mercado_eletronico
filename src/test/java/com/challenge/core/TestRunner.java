package com.challenge.core;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber/report.json",
		"json:target/cucumber-report/cucumber.json" }, 
		features = "src/test/resources/features", 
		glue = { "com/challenge/step",
				"com/challenge/core" }
)
public class TestRunner {

}
