package com.perfleet.stepDefs;

import com.perfleet.pages.BasePage;
import com.perfleet.pages.LoginPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

    public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("driver enters {string} and {string}")
    public void driver_Enters_And(String userName, String password) {
        userName = ConfigurationReader.get("driver_username");
        password = ConfigurationReader.get("driver_password");
        loginPage.loginBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(password);
        loginPage.submit.click();
    }

    @When("store manager enters {string} and {string}")
    public void store_Manager_Enters_And(String userName, String password) {
        userName = ConfigurationReader.get("store_manager_username");
        password = ConfigurationReader.get("store_manager_password");
        loginPage.loginBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(password);
        loginPage.submit.click();
    }

    @When("sales manager enters {string} and {string}")
    public void sales_Manager_Enters_And(String userName, String password) {
        userName = ConfigurationReader.get("sales_manager_username");
        password = ConfigurationReader.get("sales_manager_password");
        loginPage.loginBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(password);
        loginPage.submit.click();

    }
    @Then("user clicks {string} and {string}")
    public void user_Clicks_And(String fleet, String vehicle) throws InterruptedException {
    loginPage.navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(8);


    }
    @When("user clicks on any vehicle")
    public void user_clicks_on_any_vehicle() throws InterruptedException {
        BrowserUtils.waitFor(8);
        loginPage.carRow.click();

    }
    @Then("user should see {string} page under fleet vehicle module")
    public void user_should_see_page_under_fleet_vehicle_module(String string) {
        BrowserUtils.waitFor(4);
        //System.out.println("string = " + string);
        //System.out.println("genInfoText = " + loginPage.genInfoText.getText());
        Assert.assertEquals("General information text is not available", string,loginPage.genInfoText.getText());

    }


    @And("Sales manager should see {string} buttons")
    public void salesManagerShouldSeeButtons(String button) {
        BrowserUtils.waitFor(6);
        if (button.equals("Edit")){
            System.out.println("Edit btn is displayed " + loginPage.editButton.isDisplayed());
            Assert.assertTrue("Edit button is not displayed",loginPage.editButton.isDisplayed());
        } else if (button.equals("Delete")){
            System.out.println("Delete btn is displayed " + loginPage.deleteButton.isDisplayed());
            Assert.assertTrue("Delete button is not displayed",loginPage.deleteButton.isDisplayed());
        }else{
            System.out.println("Add event btn is displayed " + loginPage.deleteButton.isDisplayed());
            Assert.assertTrue("Add event button is not displayed",loginPage.addEventButton.isDisplayed());
        }
    }
}

