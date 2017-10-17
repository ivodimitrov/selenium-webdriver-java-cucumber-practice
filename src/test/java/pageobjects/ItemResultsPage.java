package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ItemResultsPage extends DriverFactory {

    /**
     * Locators will be mentioned here
     */

    // Results heading
    private By resultsHeading = By.xpath(".//*[@id='bcKwText']/span");
    // Result count heading
    private By resultCountHeading = By.xpath(".//*[@id='s-result-count']");
    // Item Type
    private By itemTypeHeading = By.xpath(".//*[@id='result_0']//div[2]/div[1]/div[1]/a/h3");
    // Item Price
    private By itemPriceLink = By.xpath(".//*[@id='result_0']//div[2]/div[1]/div[2]/a/span[2]");

    /**
     * All functions related to behavior will follow now
     */

    // Verify results for item are shown
    public void verifyResultsForItemAreShown(String searchItem) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(resultsHeading));
        driver.findElement(resultsHeading).isDisplayed();
        assertFalse("Verify that results count value is not equal to 0", driver.findElement(resultCountHeading).getText().equals("0"));
        assertTrue("Verify results for item are shown", driver.findElement(resultsHeading).getText().contains(searchItem));
    }

    // Verify item has type
    public void verifyItemHasType(String itemType) {
        assertEquals("Verify item has type", itemType, driver.findElement(itemTypeHeading).getText());
    }

    // Verify item has price
    public void verifyItemHasPrice(String itemPrice) {
        assertEquals("Verify item has price", itemPrice, driver.findElement(itemPriceLink).getText());
    }
}
