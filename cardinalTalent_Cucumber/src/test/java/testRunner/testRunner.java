package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features=".//features/Login.feature",
			glue="stepsDefinitions",
			dryRun=false
			)
public class testRunner {

}
