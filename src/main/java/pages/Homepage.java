package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Homepage  extends BasePage {

    By searchBoxLocator = By.cssSelector(".search-box");
    By accountLocator = By.cssSelector(".account-user");
    By accountLocatorText = By.cssSelector(".account-user > .link-text");

    //extends olduğunda super constructor
    public Homepage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(accountLocator).click();
        return new LoginPage(driver);
    }

    public String getAccountText() {
        return driver.findElement(accountLocatorText).getText();
    }

    public SearchResultPage search(String keyword) {
        sendKeys(searchBoxLocator, keyword + Keys.ENTER);
        return new SearchResultPage(driver);
    }


}
