package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    private static final By HOTEL_CARD = By.cssSelector("div[data-testid='property-card']");
    private static final By HOTEL_TITLE = By.cssSelector("div[data-testid='title']");


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

    public void changeHotelStyle(int hotelIndex, String backgroundColor, String titleColor){
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(HOTEL_CARD));

        List<WebElement> hotels = webDriver.findElements(HOTEL_CARD);
        if (hotelIndex < 1 || hotelIndex > hotels.size()){
            throw new IllegalArgumentException("Hotel index " + hotelIndex + "is out of range. Total hotels: " + hotels.size());
        }

        WebElement hotel = hotels.get(hotelIndex -1);
        WebElement hotelTitle = hotel.findElement(HOTEL_TITLE);

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", hotel);

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = arguments[1];",
                hotelTitle,
                backgroundColor);

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = arguments[1];",
                hotelTitle,
                titleColor);

    }

    public void takeScreenshot(String fileName) {
        byte[] screenshotBytes = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        Path path = Paths.get(fileName);
        try {
            Files.write(path, screenshotBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
