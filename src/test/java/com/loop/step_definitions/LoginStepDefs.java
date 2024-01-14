package com.loop.step_definitions;



import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;

import java.util.Map;

import static org.junit.Assert.assertTrue;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
//        assertTrue(3==4);
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() {

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

    }

    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {

    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {

    }

    @When("user enters password for employee")
    public void user_enters_password_for_employee() {

    }

    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {

    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {

    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {

    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {

    }
    @When("user enters credentials")
    public void user_enters_credentials(Map<String, String> credentials) {

//        for (Map.Entry <String, String> entry : credentials.entrySet()) {
//           String key =  entry.getKey();
//            System.out.println("Ket = " + key);
//            String value = entry.getValue();
//            System.out.println("Value = " + value);
//            System.out.println("===========================================");
//        }

        loginPage.loginDocuport(credentials.get("username"), credentials.get("password"));

    }

}
