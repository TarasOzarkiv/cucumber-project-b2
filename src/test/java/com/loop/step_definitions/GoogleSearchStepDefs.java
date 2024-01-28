package com.loop.step_definitions;

import com.loop.pages.GoogleSearchPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }
    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        BrowserUtils.takeScreenshot();
    }
    @Then("user should see Loop Academy - Google Search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("expected does not match the actual", "Loop Academy - Google Search", actualTitle);
    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String input) {
        googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);
    }
    @Then("user should see {string} in the google title")
    public void user_should_see_in_the_google_title(String title) {
        assertEquals("expected title: - " + title + " does not match actual title: " + Driver.getDriver().getTitle(), title, Driver.getDriver().getTitle());
    }

    @Then("user searches the following item")
    public void user_searches_the_following_item(List<Map <String, String>> items) {
//        items.forEach(p -> {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(p + Keys.ENTER);
//            assertEquals(p + " - Google Search", Driver.getDriver().getTitle());
//        } );
//
//        for (String s : items){
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(s + Keys.ENTER);
//            assertEquals(s + " - Пошук Google", Driver.getDriver().getTitle());
//        }

        for (Map <String, String> item : items){
            System.out.println(item.get("items"));
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(item.get("items") + Keys.ENTER);

        }

    }
    @When("user searches for the {string}")
    public void user_searches_for_the(String country) {
        googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
        BrowserUtils.justWait(DocuportConstants.small);

    }
    @Then("user should see the {string} in the result")
    public void user_should_see_the_in_the_result(String capital) {
        assertEquals("Expected capital city: " + capital + "does NOT match with actual",
                googleSearchPage.capital.getText(), capital);

    }
}