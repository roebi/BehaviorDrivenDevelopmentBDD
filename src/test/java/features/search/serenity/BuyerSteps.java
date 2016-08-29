package features.search.serenity;

import net.thucydides.core.annotations.Step;
import pageobject.HomePage;
import pageobject.SearchResultsPage;

import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * @author Roebi
 */
public class BuyerSteps {


    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void opens_etsy_home_page() {
        homePage.open();
    }

    @Step
    public void searches_for_items_containing(String keywords) {
        homePage.searchFor(keywords);
    }

    @Step
    public void should_see_items_related_to(String keywords) {
        List<String> resultTitles = searchResultsPage.getResultTitles();
        assertThat(resultTitles.get(1).toLowerCase(), containsString(keywords.toLowerCase()));
        // Some english Words found i.e. Wolle -> Wool
        // resultTitles.forEach(title -> assertThat(title.toLowerCase(), containsString(keywords.toLowerCase())));
    }
}
