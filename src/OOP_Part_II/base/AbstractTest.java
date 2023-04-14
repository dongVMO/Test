package OOP_Part_II.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    private WebDriver driver;
    private final String projectPath = System.getProperty("user.dir");
    protected WebDriver getBrowserDriver(String browserDriver){
        if (browserDriver.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserDriver.equals("h_firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            options.addArguments("window-size=1920x1080");
            driver = new FirefoxDriver(options);
        } else if (browserDriver.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserDriver.equals("h_chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("window-size=1920x1080");
            driver = new ChromeDriver(options);
        } else if (browserDriver.equals("coccoc")) {
            WebDriverManager.chromedriver().driverVersion("102.0.5005.61").setup();
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
            driver = new ChromeDriver(options);
        } else {
            throw new RuntimeException("Browser name invalid.");
        }
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        return driver;

    }

    @AfterClass()
    public void afterClass(){
        driver.quit();
    }
}
