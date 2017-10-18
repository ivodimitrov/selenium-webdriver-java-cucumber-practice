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

    // Result count heading
    // private By resultCountHeading = By.xpath(".//*[@id='s-result-count']");
    private By resultCountHeading = By.cssSelector("#s-result-count");
    // Results heading
    // private By resultsHeading = By.xpath(".//*[@id='bcKwText']/span");
    private By resultsHeading = By.cssSelector("#bcKwText .a-color-state.a-text-bold");
    // Item Type
    // private By itemTypeHeading = By.xpath(".//*[@id='result_0']//div[2]/div[1]/div[1]/a/h3");
    private By itemTypeHeading = By.cssSelector(".a-size-small.s-inline.a-text-normal");
    // Item Price
    // private By itemPriceLink = By.xpath(".//*[@id='result_0']//div[2]/div[1]/div[2]/a/span[2]");
    private By itemPriceLink = By.cssSelector(".a-size-base.a-color-price.s-price.a-text-bold");
    // Item title heading
    private By itemTitleLink = By.cssSelector("#result_0 .a-size-medium.s-inline.s-access-title.a-text-normal");

    /**
     * All functions related to behavior will follow now
     */

    // Verify results for item are shown
    public void verifyResultsForItemAreShown(String searchItem) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(resultCountHeading));
        driver.findElement(resultCountHeading).isDisplayed();
        waitVar.until(ExpectedConditions.presenceOfElementLocated(resultsHeading));
        driver.findElement(resultsHeading).isDisplayed();

        assertFalse("Verify that results count value is not equal to 0", driver.findElement(resultCountHeading).getText().equals("0"));
        assertTrue("Verify results for item are shown", driver.findElement(resultsHeading).getText().contains(searchItem));
    }

    // Verify item type
    public void verifyItemHasType(String itemType) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemTypeHeading));
        driver.findElement(itemTypeHeading).isDisplayed();
        assertEquals("Verify item has type", itemType, driver.findElement(itemTypeHeading).getText());
    }

    // Verify item price
    public void verifyItemHasPrice(String itemPrice) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemPriceLink));
        driver.findElement(itemPriceLink).isDisplayed();
        assertEquals("Verify item has price", itemPrice, driver.findElement(itemPriceLink).getText());
    }

    // Click on item title
    public void userClicksOnItemTitle() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemTitleLink));
        driver.findElement(itemTitleLink).isDisplayed();
        driver.findElement(itemTitleLink).click();
    }
}
