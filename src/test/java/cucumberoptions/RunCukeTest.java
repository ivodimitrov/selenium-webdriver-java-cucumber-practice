package cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

// @RunWith(Cucumber.class) -- JUnit

@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/java/features",
        glue = "stepdefinitions",
        monochrome = true)

public class RunCukeTest extends AbstractTestNGCucumberTests {

}
