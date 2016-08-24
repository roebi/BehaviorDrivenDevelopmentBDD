package features.search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinitions {
    @Steps
    BuyerSteps buyer;

    @Given("I want to buy (.*)")
    public void buyerWantsToBuy(String article) {
        buyer.opens_etsy_home_page();
    }

    @When("I search for items containing '(.*)'")
    public void searchByKeyword(String keyword) {
        buyer.searches_for_items_containing(keyword);
    }

    @Then("I should only see items related to '(.*)'")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
        buyer.should_see_items_related_to(keyword);
    }
}
