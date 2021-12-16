package stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class parameterizationTest {
    @Given("the user is in weblogin page")
    public void the_user_is_in_weblogin_page()
    {
        System.out.println("user is in webloginpage");
    }

    @And("clicks signup button")
    public void clicks_signup_button()
    {
        System.out.println("user clicks on signup button");
    }
    @Then("user signup must be successfull")
    public void user_signup_must_be_successfull()
    {
        System.out.println("signup must be successfull");
    }


    @When("the user signup with username {string} and password {string}")
    public void theUserSignupWithUsernameAndPassword(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }
}
