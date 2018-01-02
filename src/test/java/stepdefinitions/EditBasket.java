package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BasketPage;
import pageobjects.ConfirmationPage;

public class EditBasket {
    ConfirmationPage confirmationPage = new ConfirmationPage();
    BasketPage basketPage = new BasketPage();

    @When("^user clicks on edit button$")
    public void userClicksOnEditButton() throws Throwable {
        confirmationPage.clickEditBasketButton();
    }

    @Then("^new page \"([^\"]*)\" is loaded with basket details \"([^\"]*)\"$")
    public void newPageIsLoadedWithBasketDetails(String basketWebPage, String basketDetails) throws Throwable {
        basketPage.verifyNewPageIsLoadedWithBasketDetails(basketWebPage, basketDetails);
    }

    @And("^item in basket has title \"([^\"]*)\"$")
    public void itemInBasketHasTitle(String itemTitle) throws Throwable {
        basketPage.verifyItemTitle(itemTitle);
    }

    @And("^item in basket has type \"([^\"]*)\"$")
    public void itemInBasketHasType(String itemType) throws Throwable {
        basketPage.verifyItemType(itemType);
    }

    @And("^item in basket has price \"([^\"]*)\"$")
    public void itemInBasketHasPrice(String itemPrice) throws Throwable {
        basketPage.verifyItemPrice(itemPrice);
    }

    @And("^item in basket has quantity \"([^\"]*)\"$")
    public void itemInBasketHasQuantity(String itemQuantity) throws Throwable {
        basketPage.verifyItemQuantity(itemQuantity);
    }

    @And("^basket has total price \"([^\"]*)\"$")
    public void basketHasTotalPrice(String totalPrice) throws Throwable {
        basketPage.verifyBasketTotalPrice(totalPrice);
    }
}