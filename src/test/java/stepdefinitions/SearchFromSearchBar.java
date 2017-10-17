package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.ItemResultsPage;

public class SearchFromSearchBar {

    HomePage homePage = new HomePage();
    ItemResultsPage itemResultsPage = new ItemResultsPage();

    @Given("^web browser is at web page \"([^\"]*)\"$")
    public void webBrowserIsAtWebPage(String webPage) throws Throwable {
        homePage.verifyHomePageIsDisplayed(webPage);
    }

    @And("^user chooses section from dropdown \"([^\"]*)\"$")
    public void userChoosesSectionFromDropdown(String dropdownSection) throws Throwable {
        homePage.verifyUserChosesSectionFromDropdown(dropdownSection);
    }

    @When("^user enters item in search field \"([^\"]*)\"$")
    public void userEntersItemInSearchField(String searchItem) throws Throwable {
        homePage.userEntersItemInSearchField(searchItem);
    }

    @Then("^results for item are shown \"([^\"]*)\"$")
    public void resultsForItemAreShown(String searchItem) throws Throwable {
        itemResultsPage.verifyResultsForItemAreShown(searchItem);
    }

    @And("^first item that appears in search result has type \"([^\"]*)\"$")
    public void firstItemThatAppearsInSearchResultHasType(String itemType) throws Throwable {
        itemResultsPage.verifyItemHasType(itemType);
    }

    @And("^first item that appears in search result has price \"([^\"]*)\"$")
    public void firstItemThatAppearsInSearchResultHasPrice(String itemPrice) throws Throwable {
        itemResultsPage.verifyItemHasPrice(itemPrice);
    }
}
