package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ConfirmationPage;
import pageobjects.ItemDetailsPage;

public class AddItemToBasket {

    ItemDetailsPage itemDetailsPage = new ItemDetailsPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @When("^user clicks on add button$")
    public void userClicksOnAddButton() throws Throwable {
        itemDetailsPage.clickAddToBasketButton();
    }

    @Then("^notification is shown \"([^\"]*)\"$")
    public void notificationIsShown(String itemNotification) throws Throwable {
        confirmationPage.verifyNotificationIsShown(itemNotification);
    }

    @And("^item has quantity \"([^\"]*)\"$")
    public void itemHasQuantity(String itemQuantity) throws Throwable {
        confirmationPage.verifyItemHasQuantity(itemQuantity);
    }
}
