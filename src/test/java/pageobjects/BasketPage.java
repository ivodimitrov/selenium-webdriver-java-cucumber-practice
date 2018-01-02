package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BasketPage extends DriverFactory {
    /**
     * Locators will be mentioned here
     */
    // Basket details
    private By basketDetailsTextBox = By.cssSelector(".a-row.sc-cart-header.sc-compact-bottom>h2");
    // Product Title
    private By productTitleLink = By.cssSelector(".a-size-medium.sc-product-title.a-text-bold");
    // Product Type
    private By productTypeTextBox = By.cssSelector(".a-size-small.a-color-secondary.sc-product-binding");
    // Product Price
    private By productPriceTextBox = By.cssSelector(".a-size-medium.a-color-price.sc-price.sc-white-space-nowrap.sc-product-price.sc-price-sign.a-text-bold");
    // Item quantity
    private By itemQuantityDropdown = By.cssSelector(".a-dropdown-prompt");
    // Basket total price
    private By basketTotalPriceTextBox = By.cssSelector("span.a-size-medium:nth-child(2)");

    /**
     * All functions related to behavior will follow now
     */
    // Verify new web page is loaded with basket details
    public void verifyNewPageIsLoadedWithBasketDetails(String basketWebPage, String basketDetails) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(basketDetailsTextBox));
        assertTrue("Basket details text box is not displayed", driver.findElement(basketDetailsTextBox).isDisplayed());
        assertEquals("Basket page is not correct", basketWebPage, driver.getTitle());
        assertTrue("New web page is not loaded with basket details", driver.findElement(basketDetailsTextBox).getText().contains(basketDetails));
    }

    // Verify item title
    public void verifyItemTitle(String itemTitle) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productTitleLink));
        assertTrue("Product title link is not displayed", driver.findElement(productTitleLink).isDisplayed());
        assertTrue("Item title is not correct", driver.findElement(productTitleLink).getText().contains(itemTitle));
    }

    // Verify item type
    public void verifyItemType(String itemType) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productTypeTextBox));
        assertTrue("Item type is not displayed", driver.findElement(productTypeTextBox).isDisplayed());
        assertEquals("Item type is not correct", itemType, driver.findElement(productTypeTextBox).getText());
    }

    // Verify item price
    public void verifyItemPrice(String itemPrice) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(productPriceTextBox));
        assertTrue("Item price is not displayed", driver.findElement(productPriceTextBox).isDisplayed());
        assertEquals("Item price is not correct", itemPrice, driver.findElement(productPriceTextBox).getText());
    }

    // Verify item quantity
    public void verifyItemQuantity(String itemQuantity) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemQuantityDropdown));
        assertTrue("Item quantity is not displayed", driver.findElement(itemQuantityDropdown).isDisplayed());
        assertTrue("Item quantity is not correct", driver.findElement(itemQuantityDropdown).getText().contains(itemQuantity));
    }

    // Verify basket total price
    public void verifyBasketTotalPrice(String totalPrice) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(basketTotalPriceTextBox));
        assertTrue("Basket total price is not displayed", driver.findElement(basketTotalPriceTextBox).isDisplayed());
        assertEquals("Basket total price is not correct", totalPrice, driver.findElement(basketTotalPriceTextBox).getText());
    }
}
