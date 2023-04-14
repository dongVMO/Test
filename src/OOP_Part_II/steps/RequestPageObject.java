package OOP_Part_II.steps;

import OOP_Part_II.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static OOP_Part_II.pageUIs.RequestPage.*;

public class RequestPageObject extends BasePage {
    public RequestPageObject(WebDriver driver) {
        super(driver);
    }
    public RequestPageObject verifyResult() {
        waitForElementVisible(RESULT_LABEL);
        Assert.assertTrue(isElementDisplayed(RESULT_LABEL));
        return this;
    }
}
