package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ItemDetailsPage;
import pageobjects.ItemResultsPage;

public class NavigateToItemDetails {
    private ItemResultsPage itemResultsPage = new ItemResultsPage();
    private ItemDetailsPage itemDetailsPage = new ItemDetailsPage();

    @When("^user clicks on first item that appears in search result$")
    public void userClicksOnFirstItemThatAppearsInSearchResult() {
        itemResultsPage.userClicksOnItemTitle();
    }

    @Then("^new web page is loaded with item details \"([^\"]*)\"$")
    public void newWebPageIsLoadedWithItemDetails(String itemTitle) {
        itemDetailsPage.verifyNewWebPageIsLoadedWithItemDetails(itemTitle);
    }

    @And("^item has title \"([^\"]*)\"$")
    public void itemHasTitle(String itemTitle) {
        itemDetailsPage.verifyItemTitle(itemTitle);
    }

    @And("^item has type \"([^\"]*)\"$")
    public void itemHasType(String itemType) {
        itemDetailsPage.verifyItemType(itemType);
    }

    @And("^item has price \"([^\"]*)\"$")
    public void itemHasPrice(String itemPrice) {
        itemDetailsPage.verifyItemPrice(itemPrice);
    }
}
