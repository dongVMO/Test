package OOP_Part_II.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected final WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitForElementVisible(String xpathLocator) {
        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }
    private WebElement getWebElement( String xpathLocator) {
        return driver.findElement(By.xpath(xpathLocator));
    }
    public void sendKeyToElement(String xpathLocator, String textValue) {
        WebElement element = getWebElement(xpathLocator);
        element.clear();
        element.sendKeys(textValue);
    }

    public void clickToElement(String xpathLocator) {
        getWebElement(xpathLocator).click();
    }
    public String getElementText( String xpathLocator) {
        return getWebElement(xpathLocator).getText();
    }
    public boolean isElementDisplayed( String xpathLocator) {
        try {
            return getWebElement(xpathLocator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
