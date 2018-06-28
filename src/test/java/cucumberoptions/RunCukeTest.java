package cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// @RunWith(Cucumber.class) // -- JUnit

@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/java/features",
        glue = "stepdefinitions",
        monochrome = true)

public class RunCukeTest extends AbstractTestNGCucumberTests {
}
