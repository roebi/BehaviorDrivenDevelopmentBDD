package pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Roebi
 */
@DefaultUrl("http://www.etsy.com")
public class HomePage extends PageObject {

    @FindBy(css = "button[value='Search']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);
        searchButton.click();
    }
}
