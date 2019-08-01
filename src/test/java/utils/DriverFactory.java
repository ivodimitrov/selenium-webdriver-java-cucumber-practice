package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    protected static WebDriver driver;
    protected static WebDriverWait waitVar = null;

    public void setUp() {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\Ivo.Dimitrov\\IdeaProjects\\tests-at-amazon\\src\\test\\resources\\drivers\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",
                "./src/test/resources/drivers/chromedriver.exe");

        // Initialize new WebDriver session
        System.out.println("Starting driver...");
        driver = new ChromeDriver();

        // driver = new FirefoxDriver();
        System.out.println("Started driver.");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String baseURL = "https://www.amazon.co.uk/";
        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}

