package stepDefinitions;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps  extends  BaseTest{

    @Before
    public void beforeScenario()  {
        setup();

    }
    @Given("User is on saucedemoLogin page")
    public void user_is_on_saucedemo_login_page() {
     login.verifyUserIsOnLoginPage();

    }
    @When("I enter the username")
    public void i_enter_the_username()  {

        login.enterUserName();

    }
    @And("I enter the password")
    public void i_enter_the_password() {
        login.enterPassword();
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        login.clickLoginBtn();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        login.verifyUserIsOnHomePage();

    }
   @After
    public void afterScenario() {

        tearDown();
    }

}
