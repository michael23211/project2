package StepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format={"pretty","html:target/reports"} ,tags = {},dryRun = false)
public class Run {

}


