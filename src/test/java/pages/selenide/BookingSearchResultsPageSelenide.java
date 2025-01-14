package pages.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import utils.DismissGeniune;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BookingSearchResultsPageSelenide {

    private static final Logger LOGGER = LogManager.getLogger(BookingSearchResultsPageSelenide.class);

    private static final By SIGN_IN_DISMISS_BTN = By.xpath("//button[@aria-label='Dismiss sign in information.']");
    private static final By FIVE_STARS_FILTER = By.xpath("(//div[./input[contains(@aria-label, '5 stars')]]/label)[1]");
    private static final By SORTER_DROPDOWN = By.cssSelector("[data-testid='sorters-dropdown-trigger']");
    private static final By SORT_OPTION_RATING_DESC = By.xpath("//span[text()='Property rating (high to low)']");
    private static final By SKELETON_LOADER = By.cssSelector("[data-testid=skeleton-loader]");
    private static final By HOTEL_STARS = By.xpath("//div[./h3]/div/span/div");
    private static final By HOTEL_CARD = By.cssSelector("div[data-testid='property-card']");
    private static final By HOTEL_TITLE = By.cssSelector("div[data-testid='title']");


    public void dismissGeniune() {
        DismissGeniune.dismissGeniune(SIGN_IN_DISMISS_BTN);
    }


    public void selectFiveStarsFilter() {
        LOGGER.trace("Selecting five-star filter. Locator: " + FIVE_STARS_FILTER);
        try {
            $(FIVE_STARS_FILTER).click();
        } catch (StaleElementReferenceException e) {
            LOGGER.error("StaleElementReferenceException caught while selecting five-star filter. Retrying...");
            $(FIVE_STARS_FILTER).click();
        }
        LOGGER.info("Five-star filter applied.");
    }

    public void openSorterDropdown() {
        LOGGER.trace("Opening sorter dropdown. Locator: " + SORTER_DROPDOWN);
        try {
            $(SORTER_DROPDOWN).click();
        } catch (StaleElementReferenceException e) {
            LOGGER.error("StaleElementReferenceException caught while opening sorter dropdown. Retrying...");
            $(SORTER_DROPDOWN).click();
        }
        LOGGER.info("Sorter dropdown opened.");
    }

    public void selectSortOptionRatingDesc() {
        LOGGER.trace("Selecting sort option: Property rating (high to low). Locator: " + SORT_OPTION_RATING_DESC);
        $(SORT_OPTION_RATING_DESC).click();
        $(SKELETON_LOADER).should(disappear);
        LOGGER.info("Sorted by property rating descending.");
    }

    public String getFirstHotelRating() {
        LOGGER.trace("Retrieving first hotel rating. Locator: " + HOTEL_STARS);
        ElementsCollection stars = $$(HOTEL_STARS);
        String rating = stars.get(0).getAttribute("aria-label");
        LOGGER.info("First hotel rating retrieved: " + rating);
        return rating;
    }

    public void changeHotelStyle(int hotelIndex, String backgroundColor, String titleColor) {
        LOGGER.trace("Changing style for hotel card at index: " + hotelIndex);

        $(HOTEL_CARD).should(appear);

        ElementsCollection hotels = $$(HOTEL_CARD);
        if (hotelIndex < 1 || hotelIndex > hotels.size()) {
            throw new IllegalArgumentException("Hotel index " + hotelIndex + " is out of range. Total hotels: " + hotels.size());
        }

        WebElement hotel = hotels.get(hotelIndex - 1);
        WebElement hotelTitle = $(HOTEL_TITLE);

        executeJavaScript("arguments[0].scrollIntoView(true);", hotel);
        executeJavaScript("arguments[0].style.backgroundColor = arguments[1];", hotelTitle, backgroundColor);
        executeJavaScript("arguments[0].style.color = arguments[1];", hotelTitle, titleColor);

        LOGGER.info("Changed hotel card style. Index: " + hotelIndex + ", Background color: " + backgroundColor + ", Title color: " + titleColor);
    }

    public void takeScreenshot(String fileName) {
        LOGGER.trace("Taking screenshot and saving to file: " + fileName);

        byte[] screenshotBytes = Selenide.screenshot(OutputType.BYTES);
        Path path = Paths.get(fileName);

        try {
            Files.write(path, screenshotBytes);
            LOGGER.info("Screenshot saved to file: " + fileName);
        } catch (IOException e) {
            LOGGER.error("Failed to save screenshot to file: " + fileName, e);
            throw new RuntimeException(e);
        }
    }

}