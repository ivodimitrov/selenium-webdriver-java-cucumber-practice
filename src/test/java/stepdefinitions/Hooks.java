package stepdefinitions;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class Hooks {

    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void beforeScenario() throws MalformedURLException, InterruptedException {
        driverFactory.setUp();
    }

    @After
    public void afterScenario() {
        driverFactory.tearDown();
    }
}
