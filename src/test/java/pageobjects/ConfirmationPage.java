package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConfirmationPage extends DriverFactory {
    /**
     * Locators will be mentioned here
     */
    // Notification Added To Basket
    private By notificationAddedToBasketMessage = By.cssSelector(".a-size-medium.a-text-bold");
    // Item quantity
    private By itemQuantityTextBox = By.cssSelector(".a-size-medium.a-align-center.huc-subtotal>span");
    // Edit basket button
    private By editBasketButton = By.cssSelector("#hlb-view-cart-announce");

    /**
     * All functions related to behavior will follow now
     */
    // Verify notification message
    public void verifyNotificationIsShown(String itemNotification) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(notificationAddedToBasketMessage));
        assertTrue("Notification message is not displayed", driver.findElement(notificationAddedToBasketMessage).isDisplayed());
        assertEquals("Notification message is not correct", itemNotification, driver.findElement(notificationAddedToBasketMessage).getText());
    }

    // Verify item quantity
    public void verifyItemHasQuantity(String itemQuantity) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(itemQuantityTextBox));
        assertTrue("Item quantity is not displayed", driver.findElement(itemQuantityTextBox).isDisplayed());
        assertTrue("Item quantity is not correct", driver.findElement(itemQuantityTextBox).getText().contains(itemQuantity));
    }

    // Click Edit basket button
    public void clickEditBasketButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(editBasketButton));
        assertTrue("Edit basket button is not displayed", driver.findElement(editBasketButton).isDisplayed());
        driver.findElement(editBasketButton).click();
    }
}
