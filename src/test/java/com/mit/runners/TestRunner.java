package com.mit.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.mit.steps.TestRunner"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
