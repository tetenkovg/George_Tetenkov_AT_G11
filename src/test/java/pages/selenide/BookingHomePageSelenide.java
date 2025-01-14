package pages.selenide;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DismissGeniune;


import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.*;

public class BookingHomePageSelenide {

    private static final Logger LOGGER = LogManager.getLogger(BookingHomePageSelenide.class);


    private static final String BOOKING_URL = "https://www.booking.com/";

    private static final By ACCEPT_COOKIES_BTN = By.cssSelector("button#onetrust-accept-btn-handler");
    private static final By SIGN_IN_DISMISS_BTN = By.xpath("//button[@aria-label='Dismiss sign in information.']");
    private static final By WHERE_TO_GO_INPUT = By.xpath("//input[@placeholder='Where are you going?']");
    private static final String FIRST_SEARCH_RESULT = "//div[text()='%s']";
    private static final By GUESTS_BTN = By.cssSelector("[data-testid=occupancy-config]");
    private static final By ADULTS_PLUS_BTN = By.xpath("//div[@data-testid='occupancy-popup']/div/div[1]//button[@tabindex='-1'][2]");
    private static final By ROOMS_PLUS_BTN = By.xpath("//div[@data-testid='occupancy-popup']/div/div[3]//button[@tabindex='-1'][2]");
    private static final By DONE_BTN = By.xpath("//button/span[text()='Done']");
    private static final By SEARCH_BTN = By.xpath("//button/span[text()='Search']");
    private static final By CURRENCY = By.xpath("//button[@data-testid='header-currency-picker-trigger']");
    private static final By LANGUAGE = By.xpath("//button[@data-testid='header-language-picker-trigger']");

    private static final By CURRENCY_TOOLTIP = By.id(":r0:");
    private static final By LANGUAGE_TOOLTIP = By.id(":r6:");


    public void openURL() {
        LOGGER.trace("Opening URL: " + BOOKING_URL);
        open(BOOKING_URL);
    }

    public void acceptCookies() {
        LOGGER.trace("Clicking Accept Cookies button. Locator: " + ACCEPT_COOKIES_BTN);
        $(ACCEPT_COOKIES_BTN).click();
    }



    public void dismissGeniune() {
        DismissGeniune.dismissGeniune(SIGN_IN_DISMISS_BTN);
    }


    public void enterDestination(String destination) {
        LOGGER.trace("Entering destination: " + destination + ". Locator: " + WHERE_TO_GO_INPUT);
        $(WHERE_TO_GO_INPUT).sendKeys(destination);
    }

    public void selectFirstResult(String cityName) {
        String xpath = String.format("//div[text()='%s']", cityName);
        LOGGER.trace("Selecting first search result for: " + cityName + ". Locator: " + xpath);
        $x(xpath).click();
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        LOGGER.trace("Selecting start date via xpath: //*[@data-date='" + startDate + "']");
        $x("//*[@data-date='" + startDate + "']").click();
        LOGGER.trace("Selecting end date via xpath: //*[@data-date='" + endDate + "']");
        $x("//*[@data-date='" + endDate + "']").click();
    }

    public void setGuestsAndRooms(int additionalAdults, int additionalRooms) {
        LOGGER.trace("Opening Guests and Room");
        $(GUESTS_BTN).click();

        WebElement adultsPlus = $(ADULTS_PLUS_BTN);
        WebElement roomsPlus = $(ROOMS_PLUS_BTN);

        for (int i = 0; i < additionalAdults; i++) {
            LOGGER.trace("Adding Adults");
            adultsPlus.click();

        }
        for (int i = 0; i < additionalRooms; i++) {
            LOGGER.trace("Adding Rooms");
            roomsPlus.click();
        }

        LOGGER.trace("Saving Changes on Guests and Rooms");
        $(DONE_BTN).click();
    }

    public void clickSearch() {
        LOGGER.trace("Clicking Search Button");
        $(SEARCH_BTN).click();
    }

    public void hoverOverCurrency() {
        LOGGER.trace("Hovering over the Currency button.");
        $(CURRENCY).hover();
    }

    public void hoverOverLanguage() {
        LOGGER.trace("Hovering over the Language button.");
        $(LANGUAGE).hover();
    }

    public String currencyTooltipText() {
        LOGGER.trace("Returning Currency Tooltip text.");
        return $(CURRENCY_TOOLTIP).getText().toLowerCase();
    }

    public String languageTooltipText() {
        LOGGER.trace("Returning Language Tooltip text.");
        return $(LANGUAGE_TOOLTIP).getText().toLowerCase();
    }
}
