package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.DriverFactory;

import static org.junit.Assert.*;

public class HomePage extends DriverFactory {
    /**
     * Locators will be mentioned here
     */
    @FindBy(css = "span.nav-logo-base")
    private WebElement amazonLogo;

    @FindBy(css = "#searchDropdownBox")
    private WebElement searchDropdown;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchFieldTextbox;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * All functions related to behavior will follow now
     */
    // Verify that home page is correct and opened
    public void verifyHomePageIsDisplayed(String webPage) {
        waitVar.until(ExpectedConditions.titleContains(webPage));
        waitVar.until(ExpectedConditions.visibilityOf(amazonLogo));
        assertTrue("Home page is not displayed", amazonLogo.isDisplayed());
        assertEquals("Home page is not correct", webPage, driver.getTitle());
    }

    // Verify section from dropdown is correct
    public void verifyUserChosesSectionFromDropdown(String dropdownSection) {
        Select dropdownSectionOptions = new Select(searchDropdown);
        assertFalse("Dropdown support multiple selection",
                dropdownSectionOptions.isMultiple());
        dropdownSectionOptions.selectByVisibleText(dropdownSection);
        assertEquals("Section from dropdown is not correct",
                dropdownSection,
                dropdownSectionOptions.getFirstSelectedOption().getText());
    }

    // Search for item in Search field
    public void userEntersItemInSearchField(String searchItem) {
        searchFieldTextbox.click();
        searchFieldTextbox.clear();
        searchFieldTextbox.sendKeys(searchItem);
        searchFieldTextbox.submit();
    }
}
