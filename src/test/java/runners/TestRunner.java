package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(features = "src/test/resources/features", glue = "stepdefinitions")
	public class TestRunner extends AbstractTestNGCucumberTests {
	}


