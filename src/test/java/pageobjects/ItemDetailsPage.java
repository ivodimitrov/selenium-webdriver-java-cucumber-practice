package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemDetailsPage extends DriverFactory {
    /**
     * Locators will be mentioned here
     */
    // Product Back Link
    private By productBackLink = By.cssSelector("#breadcrumb-back-link");
    // Product Title
    private By productTitleHeading = By.cssSelector("#productTitle");
    // Product Type
    private By productTypeLink = By.cssSelector("#a-autoid-4-announce > span:nth-child(1)");
    // Product Price
    private By productPriceLink = By.cssSelector("span.a-color-base:nth-child(3) > span:nth-child(1)");
    // Add to Basket Button
    private By addToBasketButton = By.cssSelector("#add-to-cart-button");

    /**
     * All functions related to behavior will follow now
     */
    // Verify new web page is loaded with item details
    public void verifyNewWebPageIsLoadedWithItemDetails(String itemTitle) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productBackLink));
        assertTrue("Back link is not displayed", driver.findElement(productBackLink).isDisplayed());
        assertTrue("New web page is not loaded with item details", driver.findElement(productBackLink).getText().contains(itemTitle));
    }

    // Verify item title
    public void verifyItemTitle(String itemTitle) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productTitleHeading));
        assertTrue("Item title is not displayed", driver.findElement(productTitleHeading).isDisplayed());
        assertTrue("Item title is not correct", driver.findElement(productTitleHeading).getText().contains(itemTitle));
    }

    // Verify item type
    public void verifyItemType(String itemType) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productTypeLink));
        assertTrue("Item type is not displayed", driver.findElement(productTypeLink).isDisplayed());
        assertEquals("Item type is not correct", itemType, driver.findElement(productTypeLink).getText());
    }

    // Verify item price
    public void verifyItemPrice(String itemPrice) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productPriceLink));
        assertTrue("Item price is not displayed", driver.findElement(productPriceLink).isDisplayed());
        assertEquals("Item price is not correct", itemPrice, driver.findElement(productPriceLink).getText());
    }

    // Click on Add to Basket button
    public void clickAddToBasketButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(addToBasketButton));
        assertTrue("Add to Basket button is not displayed", driver.findElement(addToBasketButton).isDisplayed());
        driver.findElement(addToBasketButton).click();
    }
}
