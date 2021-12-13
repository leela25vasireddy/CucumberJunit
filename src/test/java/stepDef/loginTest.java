package stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class loginTest {

    @Given("^the user is in login page$")
    public void the_user_is_in_login_page()
    {
        System.out.println("user enters login page");
    }

    @When("^the user enter with valid credentials$")
    public void the_user_enter_with_valid_credentials()
    {
        System.out.println("user enter valid credentials");
    }

    @And("^clicks on login button$")
    public void clicks_on_login_button()
    {
        System.out.println("user clicks enter login button");
    }

    @Then("^the user navigates successfully to homepage.$")
    public void the_user_enter_successfully_to_homepage()
    {
        System.out.println("user enters successfully to home page");
    }
}
