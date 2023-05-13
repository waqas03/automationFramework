package stepDefinitions;

import Pages.HomePage;
import Pages.loginPage;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
   // public static WebDriver driver;
    private WebDriver driver;
    public loginPage login;
    public   HomePage home;



    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new loginPage(driver);
        home = new HomePage(driver);
    }

    public void tearDown() {
        driver.quit();
    }


}
