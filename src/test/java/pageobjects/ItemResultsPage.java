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
    private By itemPriceLink = By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/div[2]");
    // private By itemPriceLink = By.cssSelector("");
    // Item title heading
    private By itemTitleLink = By.cssSelector("#result_0 .a-size-medium.s-inline.s-access-title.a-text-normal");

    /**
     * All functions related to behavior will follow now
     */
    // Verify results for item are shown
    public void verifyResultsForItemAreShown(String searchItem) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(resultCountHeading));
        assertTrue("Result count is not displayed", driver.findElement(resultCountHeading).isDisplayed());
        waitVar.until(ExpectedConditions.presenceOfElementLocated(resultsHeading));
        assertTrue("Result Heading is not displayed", driver.findElement(resultsHeading).isDisplayed());
        assertFalse("Results count value is equal to 0", driver.findElement(resultCountHeading).getText().equals("0"));
        assertTrue("Results for item are not shown", driver.findElement(resultsHeading).getText().contains(searchItem));
    }

    // Verify item type
    public void verifyItemHasType(String itemType) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemTypeHeading));
        assertTrue("Item type is not displayed", driver.findElement(itemTypeHeading).isDisplayed());
        assertEquals("Item type is not correct", itemType, driver.findElement(itemTypeHeading).getText());
    }

    // Verify item price
    public void verifyItemHasPrice(String itemPrice) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemPriceLink));
        assertTrue("Item price is not displayed", driver.findElement(itemPriceLink).isDisplayed());
        assertTrue("Item price is not correct", driver.findElement(itemPriceLink).getText().concat(itemPrice).contains(itemPrice));
    }

    // Click on item title
    public void userClicksOnItemTitle() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemTitleLink));
        driver.findElement(itemTitleLink).isDisplayed();
        driver.findElement(itemTitleLink).click();
    }
}
