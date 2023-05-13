package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class loginPage  {

private WebDriver driver;

    //Locator for username field
    By usrName = By.id("user-name");

    //Locator for password field
    By pswd = By.id("password");

    //Locator for login button
    By loginBtn = By.id("login-button");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserIsOnLoginPage(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.saucedemo.com/");
    }

    public void enterUserName(){
        driver.findElement(usrName).sendKeys("standard_user");
    }

    public  void enterPassword(){
        driver.findElement(pswd).sendKeys("secret_sauce");
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void verifyUserIsOnHomePage(){

        String homePageSwagLabs = driver.getCurrentUrl();
        Assert.assertEquals(homePageSwagLabs,"https://www.saucedemo.com/inventory.html");
    }
}
