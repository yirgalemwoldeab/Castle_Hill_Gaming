package com.castle.step_definitions;

import com.castle.pages.Castle_Hill_Gaming;
import com.castle.utilities.ConfigurationReader;
import com.castle.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Castle_HIll_Gaming_StepDefinition {

    Castle_Hill_Gaming obj=new Castle_Hill_Gaming();

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("castleEnv"));
    }
    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {
        obj.userName.sendKeys(ConfigurationReader.getProperty("castleUser"));

        obj.password.sendKeys(ConfigurationReader.getProperty("castlePassword"));
    }
    @When("I click the Login Button")
    public void i_click_the_login_button() {
        obj.loginButton.click();
    }
    @Then("I am redirected to the Sauce Demo Main Page And I verify the App Logo exists")
    public void i_am_redirected_to_the_sauce_demo_main_page_and_i_verify_the_app_logo_exists() {
        Assert.assertTrue(obj.appLogo.isDisplayed());

    }

    @When("I fill the account information for account LockedOutUser into the Username field and the Password field And I click the Login Button")
    public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field_and_i_click_the_login_button() {
        obj.userName.sendKeys(ConfigurationReader.getProperty("castleUser1"));

        obj.password.sendKeys(ConfigurationReader.getProperty("castlePassword1"));
        obj.loginButton.click();

    }
    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_error_message_contains_the_text(String expectedMessage) {
        Assert.assertEquals(expectedMessage,obj.errorMessage.getText());
        System.out.println(obj.errorMessage.getText());
    }



}
