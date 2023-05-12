package stepDefinitions;

import Pages.HomePage;
import Pages.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddtoCartSteps  extends BaseTest {

    loginPage login = new loginPage();
    HomePage home = new HomePage();
    @Before
    public void beforeScenario() {
        setup();
    }
    @Given("User is logged In")
    public void user_is_logged_in() {
        login.enterUserName();
        login.enterPassword();
        login.clickLoginBtn();
    }
    @When("Click on add to cart option")
    public void click_on_add_to_cart_option() {
      home.ClickaddToCart();
    }
    @Then("product added to cart successfully")
    public void product_added_to_cart_successfully() {
    String txt = home.verifyAddCart();
    Assert.assertEquals(txt, "Remove");
    }
    @Then("Click on Cart")
    public void click_on_cart() {
      home.clickCartoption();
    }
    @Then("Item should be shown in cart")
    public void item_should_be_shown_in_cart() {

        Assert.assertTrue(home.verifyCartPageitem());

    }
    @After
    public void afterScenario() {

        tearDown();
    }


}
