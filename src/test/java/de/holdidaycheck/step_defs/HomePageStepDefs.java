package de.holdidaycheck.step_defs;

import de.holdidaycheck.pages.HomePage;
import de.holdidaycheck.utilities.BrowserUtils;
import de.holdidaycheck.utilities.ConfigurationReader;
import de.holdidaycheck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
        BrowserUtils.waitForPageToLoad(5);
        homePage.searchbox.click();
    }

    @When("the user enters {string} in search box")
    public void the_user_enters_in_search_box(String userinput) {
        BrowserUtils.waitForVisibility(homePage.inputbox, 5);
        homePage.inputbox.sendKeys(userinput);
    }

    @When("the user selects the first suggested result")
    public void the_user_selects_the_first_suggested_result() {
        BrowserUtils.waitFor(1);
        homePage.firstsuggested.click();
    }

    @Then("all search result should contain {string} in search result title")
    public void all_search_result_should_contain_in_search_result_title(String checkfor) {
        BrowserUtils.waitForPageToLoad(5);
        List<String> result = BrowserUtils.getElementsText(homePage.searchResult);
        for (String element : result) {
            Assert.assertTrue(element.toLowerCase().contains(checkfor.toLowerCase()));
        }

    }

}
