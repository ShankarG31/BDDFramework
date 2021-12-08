package myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		monochrome = true,
		dryRun = false,
		features = ".\\src\\test\\java\\features\\Login.feature",
		glue = "stepDefinition" 
		)

public class TestRunner {

}


