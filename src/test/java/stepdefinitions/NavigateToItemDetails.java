package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ItemDetailsPage;
import pageobjects.ItemResultsPage;

public class NavigateToItemDetails {
    ItemResultsPage itemResultsPage = new ItemResultsPage();
    ItemDetailsPage itemDetailsPage = new ItemDetailsPage();

    @When("^user clicks on first item that appears in search result$")
    public void userClicksOnFirstItemThatAppearsInSearchResult() throws Throwable {
        itemResultsPage.userClicksOnItemTitle();
    }

    @Then("^new web page is loaded with item details \"([^\"]*)\"$")
    public void newWebPageIsLoadedWithItemDetails(String itemTitle) throws Throwable {
        itemDetailsPage.verifyNewWebPageIsLoadedWithItemDetails(itemTitle);
    }

    @And("^item has title \"([^\"]*)\"$")
    public void itemHasTitle(String itemTitle) throws Throwable {
        itemDetailsPage.verifyItemTitle(itemTitle);
    }

    @And("^item has type \"([^\"]*)\"$")
    public void itemHasType(String itemType) throws Throwable {
        itemDetailsPage.verifyItemType(itemType);
    }

    @And("^item has price \"([^\"]*)\"$")
    public void itemHasPrice(String itemPrice) throws Throwable {
        itemDetailsPage.verifyItemPrice(itemPrice);
    }
}
