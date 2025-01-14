package pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GoogleSearchResultsPage {

    private final WebDriver driver;

    private static final By SEARCH_RESULTS = By.cssSelector("div.g");

    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean allResultsContain(String word) {
        List<WebElement> results = driver.findElements(SEARCH_RESULTS);
        for (WebElement r : results) {
            String text = r.getText().toLowerCase();
            if (!text.contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}