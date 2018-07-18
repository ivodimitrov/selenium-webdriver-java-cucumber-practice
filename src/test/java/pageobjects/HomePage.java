package pageobjects;

import org.openqa.selenium.By;
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
    // Amazon Logo
    // private By amazonLogo = By.xpath(".//*[@id='nav-logo']/a[1]/span[1]");
    // private By amazonLogo = By.cssSelector("span.nav-logo-base");
    @FindBy(css = "span.nav-logo-base")
    private WebElement amazonLogo;

    // Dropdown Section
    // private By searchDropdown = By.xpath(".//*[@id='searchDropdownBox']");
    private By searchDropdown = By.cssSelector("#searchDropdownBox");
    // Search Field
    // private By searchFieldTextbox = By.xpath(".//*[@id='twotabsearchtextbox']");
    private By searchFieldTextbox = By.cssSelector("#twotabsearchtextbox");

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * All functions related to behavior will follow now
     */
    // Verify that home page is correct and opened
    public void verifyHomePageIsDisplayed(String webPage) {
        // waitVar.until(ExpectedConditions.presenceOfElementLocated(amazonLogo));
        waitVar.until(ExpectedConditions.visibilityOf(amazonLogo));
        // assertTrue("Home page is not displayed", driver.findElement(amazonLogo).isDisplayed());
        assertTrue("Home page is not displayed", amazonLogo.isDisplayed());
        assertEquals("Home page is not correct", webPage, driver.getTitle());
    }

    // Verify section from dropdown is correct
    public void verifyUserChosesSectionFromDropdown(String dropdownSection) {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(searchDropdown));
        Select dropdownSectionOptions = new Select(driver.findElement(searchDropdown));
        assertFalse("Dropdown support multiple selection", dropdownSectionOptions.isMultiple());
        dropdownSectionOptions.selectByVisibleText(dropdownSection);
        assertEquals("Section from dropdown is not correct", dropdownSection, dropdownSectionOptions.getFirstSelectedOption().getText());
    }

    // Search for item in Search field
    public void userEntersItemInSearchField(String searchItem) {
        driver.findElement(searchFieldTextbox).click();
        driver.findElement(searchFieldTextbox).clear();
        driver.findElement(searchFieldTextbox).sendKeys(searchItem);
        driver.findElement(searchFieldTextbox).submit();
    }
}
