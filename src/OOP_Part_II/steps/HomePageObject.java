package OOP_Part_II.steps;

import OOP_Part_II.base.BasePage;
import OOP_Part_II.base.PageFactoryManager;
import org.openqa.selenium.WebDriver;

import static OOP_Part_II.pageUIs.HomePage.SEARCH_INPUT;

public class HomePageObject extends BasePage {
    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    public RequestPageObject inputToData(String dataSearch) {
        waitForElementVisible(SEARCH_INPUT);
        sendKeyToElement(SEARCH_INPUT,dataSearch + "\n");
        return PageFactoryManager.getRequestPageGenerator(driver);
    }
}
