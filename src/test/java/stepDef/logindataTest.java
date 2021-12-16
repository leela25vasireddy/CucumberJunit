package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

public class logindataTest {

    @Given("the user is in webpagelogin page")
    public void theUserIsInWebpageloginPage() {
        System.out.println("user is on loginpage");

    }

    @When("the user enter username {string} and password\"{int}\"")
    public void the_user_enter_username_and_password(String str1, Integer int1) {
        System.out.println(str1);
        System.out.println(int1);

    }

    @And("clicks login button")
    public void clicksLoginButton() {
        System.out.println("clicked on login button");
    }

    @Then("the user enters successfully to homepage is {string}")
    public void theUserEntersSuccessfullyToHomepageIs(String arg0) {
        System.out.println(arg0);

    }

    @When("the user signup with following details")
    public void theUserSignupWithFollowingDetails(DataTable table) {
        List<List<String>> obj = table.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));

    }


}








