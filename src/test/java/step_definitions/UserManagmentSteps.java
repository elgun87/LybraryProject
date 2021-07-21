package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UserManagmentPage;

import java.util.*;

public class UserManagmentSteps {
    @When("user click on Users link")
    public void user_click_on_users_link() {
        new UserManagmentPage().click_on_users_link();
    }

    @When("user should see show record default values as {int}")
    public void user_should_see_show_record_default_values_as(Integer int1) {
        boolean flag = new UserManagmentPage().verify_show_records_default_value(int1);
        Assert.assertTrue("Default value is not equal expected", flag);
    }

    @When("show records should have following options:")
    public void show_records_should_have_following_options(List<Integer> values) {
        boolean flag = new UserManagmentPage().verify_show_records_values(values);
        Assert.assertTrue("Values is not equal expected", flag);
    }

    @Then("user can view User Managment Table Headers as:")
    public void userCanViewUserManagmentTableHeadersAs(List<String> headers) {
        boolean flag = new UserManagmentPage().verify_table_headers(headers);
        Assert.assertTrue("Table header is not matching as expected",flag);
    }
}
