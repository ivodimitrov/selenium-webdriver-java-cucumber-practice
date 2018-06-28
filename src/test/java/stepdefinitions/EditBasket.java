package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BasketPage;
import pageobjects.ConfirmationPage;

public class EditBasket {
    private ConfirmationPage confirmationPage = new ConfirmationPage();
    private BasketPage basketPage = new BasketPage();

    @When("^user clicks on edit button$")
    public void userClicksOnEditButton() {
        confirmationPage.clickEditBasketButton();
    }

    @Then("^new page \"([^\"]*)\" is loaded with basket details \"([^\"]*)\"$")
    public void newPageIsLoadedWithBasketDetails(String basketWebPage, String basketDetails) {
        basketPage.verifyNewPageIsLoadedWithBasketDetails(basketWebPage, basketDetails);
    }

    @And("^item in basket has title \"([^\"]*)\"$")
    public void itemInBasketHasTitle(String itemTitle) {
        basketPage.verifyItemTitle(itemTitle);
    }

    @And("^item in basket has type \"([^\"]*)\"$")
    public void itemInBasketHasType(String itemType) {
        basketPage.verifyItemType(itemType);
    }

    @And("^item in basket has price \"([^\"]*)\"$")
    public void itemInBasketHasPrice(String itemPrice) {
        basketPage.verifyItemPrice(itemPrice);
    }

    @And("^item in basket has quantity \"([^\"]*)\"$")
    public void itemInBasketHasQuantity(String itemQuantity) {
        basketPage.verifyItemQuantity(itemQuantity);
    }

    @And("^basket has total price \"([^\"]*)\"$")
    public void basketHasTotalPrice(String totalPrice) {
        basketPage.verifyBasketTotalPrice(totalPrice);
    }
}