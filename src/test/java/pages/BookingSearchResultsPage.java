package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BookingSearchResultsPage {
    private final WebDriver webDriver;

    public BookingSearchResultsPage(WebDriver driver) {
        this.webDriver = driver;
    }

    private static final By SIGN_IN_DISMISS_BTN = By.xpath("//button[@aria-label='Dismiss sign in information.']");
    private static final By FIVE_STARS_FILTER = By.xpath("(//div[./input[contains(@aria-label, '5 stars')]]/label)[1]");
    private static final By SORTER_DROPDOWN = By.cssSelector("[data-testid='sorters-dropdown-trigger']");
    private static final By SORT_OPTION_RATING_DESC = By.xpath("//span[text()='Property rating (high to low)']");
    private static final By SKELETON_LOADER = By.cssSelector("[data-testid=skeleton-loader]");
    private static final By HOTEL_STARS = By.xpath("//div[./h3]/div/span/div");


    public void dismissSignInIfPresent() {
        List<WebElement> dismissButtons = webDriver.findElements(SIGN_IN_DISMISS_BTN);
        if (!dismissButtons.isEmpty()) {
            dismissButtons.get(0).click();
            System.out.println("Sign-in window dismissed.");
        } else {
            System.out.println("Sign-in window not present, continuing test.");
        }
    }

    public void selectFiveStarsFilter() {
        try {
            webDriver.findElement(FIVE_STARS_FILTER).click();
        } catch (StaleElementReferenceException e) {
            webDriver.findElement(FIVE_STARS_FILTER).click();
        }
    }

    public void openSorterDropdown() {
        try {
            webDriver.findElement(SORTER_DROPDOWN).click();
        } catch (StaleElementReferenceException e) {
            webDriver.findElement(SORTER_DROPDOWN).click();
        }
    }

    public void selectSortOptionRatingDesc() {
        webDriver.findElement(SORT_OPTION_RATING_DESC).click();
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.invisibilityOfElementLocated(SKELETON_LOADER));
    }

    public String getFirstHotelRating() {
        List<WebElement> stars = webDriver.findElements(HOTEL_STARS);
        return stars.get(0).getAttribute("aria-label");
    }
}
