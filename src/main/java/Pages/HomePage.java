package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static stepDefinitions.BaseTest.driver;
public class HomePage {
    By addCart = By.id("add-to-cart-sauce-labs-backpack");

    By RemoveBtn = By.id("remove-sauce-labs-backpack");
    By ShoppingCart = By.id("shopping_cart_container");
    By cartItem = By.className("cart_item");
    public void ClickaddToCart() {
        driver.findElement(addCart).click();
    }


    public String verifyAddCart() {
        String verifyCartProduct = driver.findElement(RemoveBtn).getText();
        return verifyCartProduct;

    }
    public void clickCartoption(){
        driver.findElement(ShoppingCart).click();

    }
    public Boolean verifyCartPageitem() {
       if(driver.findElement(cartItem).isDisplayed())
           return true;
       return false;
    }
}
