package utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    public static String baseURL = "https://www.amazon.co.uk/";

    public void setUp() throws MalformedURLException, InterruptedException {
        // drivers are set in Environment Variables
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);
    }

    public void tearDown() {
        driver.quit();
    }
}

