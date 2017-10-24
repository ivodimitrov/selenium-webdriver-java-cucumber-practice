package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HomePage extends DriverFactory {
    /**
     * Locators will be mentioned here
     */
    // Amazon Logo
    // private By amazonLogo = By.xpath(".//*[@id='nav-logo']/a[1]/span[1]");
    private By amazonLogo = By.cssSelector("span.nav-logo-base");
    // Dropdown Section
    // private By searchDropdown = By.xpath(".//*[@id='searchDropdownBox']");
    private By searchDropdown = By.cssSelector("#searchDropdownBox");
    // Search Field
    // private By searchFieldTextbox = By.xpath(".//*[@id='twotabsearchtextbox']");
    private By searchFieldTextbox = By.cssSelector("#twotabsearchtextbox");

    /**
     * All functions related to behavior will follow now
     */
    // Verify that home page is correct and opened
    public void verifyHomePageIsDisplayed(String webPage) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(amazonLogo));
        driver.findElement(amazonLogo).isDisplayed();
        assertEquals("Verify that home page is correct", webPage, driver.getTitle());
    }

    // Verify choosen section from dropdown is correct
    public void verifyUserChosesSectionFromDropdown(String dropdownSection) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(searchDropdown));
        Select dropdownSectionOptions = new Select(driver.findElement(searchDropdown));
        assertFalse("Verify Dropdown does not support multiple selection", dropdownSectionOptions.isMultiple());
        dropdownSectionOptions.selectByVisibleText(dropdownSection);
        assertEquals("Verify choosen section from dropdown is correct", dropdownSection, dropdownSectionOptions.getFirstSelectedOption().getText());
    }

    // Search for item in Search field
    public void userEntersItemInSearchField(String searchItem) {
        driver.findElement(searchFieldTextbox).click();
        driver.findElement(searchFieldTextbox).clear();
        driver.findElement(searchFieldTextbox).sendKeys(searchItem);
        driver.findElement(searchFieldTextbox).submit();
    }
}
