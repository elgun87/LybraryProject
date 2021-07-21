package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import pages.UserManagmentPage;
import utilities.Driver;

public class Login_StepDefinitions {
    //Log in Steps
    @When("user open url {string}")
    public void user_open_url(String url) {
        Driver.setDriver().get(url);
    }

    @When("user enter email as {string}")
    public void user_enter_email_as(String email) {
        new LoginPage().type_user_name(email);
    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String password) {
        new LoginPage().type_password(password);
    }

    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        new LoginPage().click_signin_btn();
    }

    @Then("user can view {string} dashboard")
    public void user_can_view_user_dashboard(String actual) {
        String expected = new LoginPage().verify_user_access();
        System.out.println(expected + " expected");
        System.out.println(actual + " actual");
        Assert.assertEquals("Expected does not match to actual",expected,actual);
    }
    @Then("user there would be {int} users")
    public void userThereWouldBeUsers(int actual) {
        int expected = new UserManagmentPage().get_users_count();
        Assert.assertTrue("Expected count does not match to actual count ",expected == actual);
    }
}
