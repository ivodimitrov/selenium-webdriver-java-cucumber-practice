package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ConfirmationPage;
import pageobjects.ItemDetailsPage;

public class AddItemToBasket {

    private ItemDetailsPage itemDetailsPage = new ItemDetailsPage();
    private ConfirmationPage confirmationPage = new ConfirmationPage();

    @When("^user clicks on add button$")
    public void userClicksOnAddButton() {
        itemDetailsPage.clickAddToBasketButton();
    }

    @Then("^notification is shown \"([^\"]*)\"$")
    public void notificationIsShown(String itemNotification) {
        confirmationPage.verifyNotificationIsShown(itemNotification);
    }

    @And("^item has quantity \"([^\"]*)\"$")
    public void itemHasQuantity(String itemQuantity) {
        confirmationPage.verifyItemHasQuantity(itemQuantity);
    }
}
