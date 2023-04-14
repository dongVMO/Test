package OOP_Part_II.testCases;

import OOP_Part_II.base.AbstractTest;
import OOP_Part_II.base.PageFactoryManager;
import OOP_Part_II.steps.HomePageObject;
import OOP_Part_II.steps.RequestPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static OOP_Part_II.pageUIs.RequestPage.RESULT_LABEL;

public class SearchGoogleTests extends AbstractTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private RequestPageObject requestPage;
    private String data_search;

    @Parameters({"browser"})
    @BeforeClass()
    public void beforeClass(@Optional("chrome") String browserName) {
        driver = getBrowserDriver(browserName);
        data_search = "automationFC";
    }

    @Test
    public void TC_Search_Data() {
        homePage = PageFactoryManager.getHomePageGenerator(driver);
        System.out.println("Step 1: Input data: " + data_search);
        requestPage = homePage.inputToData(data_search);
        System.out.println("Step 2: Enter search");
        requestPage.verifyResult();
        System.out.println("Step 3: Result is displayed: " + requestPage.getElementText(RESULT_LABEL));
    }

}
