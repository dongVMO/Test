package OOP_Part_II.base;

import OOP_Part_II.steps.HomePageObject;
import OOP_Part_II.steps.RequestPageObject;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    public static HomePageObject getHomePageGenerator(WebDriver driver){
        return new HomePageObject(driver);
    }
    public static RequestPageObject getRequestPageGenerator(WebDriver driver){
        return new RequestPageObject(driver);
    }
}
