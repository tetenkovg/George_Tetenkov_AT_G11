package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.homework.uitests.testNg.ParisTest;

import java.time.LocalDate;
import java.util.List;

public class BookingHomePage {

    private static final Logger LOGGER = LogManager.getLogger(BookingHomePage.class);
    private final WebDriver webDriver;

    public BookingHomePage(WebDriver driver) {
        this.webDriver = driver;
    }

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


    public void open() {
        LOGGER.trace("Opening URL: " + BOOKING_URL);
        webDriver.get(BOOKING_URL);
    }

    public void acceptCookies() {
        LOGGER.trace("Clicking Accept Cookies button. Locator: " + ACCEPT_COOKIES_BTN);
        webDriver.findElement(ACCEPT_COOKIES_BTN).click();
    }

    public void dismissSignInIfPresent() {
        LOGGER.trace("Checking for sign-in popup. Locator: " + SIGN_IN_DISMISS_BTN);
        List<WebElement> dismissButtons = webDriver.findElements(SIGN_IN_DISMISS_BTN);
        if (!dismissButtons.isEmpty()) {
            dismissButtons.get(0).click();
            LOGGER.info("Sign-in window dismissed.");
        } else {
            LOGGER.info("Sign-in window not present, continuing test.");
        }
    }

    public void enterDestination(String destination) {
        LOGGER.trace("Entering destination: " + destination + ". Locator: " + WHERE_TO_GO_INPUT);
        WebElement input = webDriver.findElement(WHERE_TO_GO_INPUT);
        input.sendKeys(destination);
    }

    public void selectFirstResult(String cityName) {
        String xpath = String.format("//div[text()='%s']", cityName);
        LOGGER.trace("Selecting first search result for: " + cityName + ". Locator: " + xpath);
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        LOGGER.trace("Selecting start date via xpath: //*[@data-date='" + startDate + "']");
        webDriver.findElement(By.xpath("//*[@data-date='" + startDate + "']")).click();
        LOGGER.trace("Selecting end date via xpath: //*[@data-date='" + endDate + "']");
        webDriver.findElement(By.xpath("//*[@data-date='" + endDate + "']")).click();
    }

    public void setGuestsAndRooms(int additionalAdults, int additionalRooms) {
        LOGGER.trace("Opening Guests and Room");
        webDriver.findElement(GUESTS_BTN).click();

        WebElement adultsPlus = webDriver.findElement(ADULTS_PLUS_BTN);
        WebElement roomsPlus = webDriver.findElement(ROOMS_PLUS_BTN);

        for (int i = 0; i < additionalAdults; i++) {
            LOGGER.trace("Adding Adults");
            adultsPlus.click();

        }
        for (int i = 0; i < additionalRooms; i++) {
            LOGGER.trace("Adding Rooms");
            roomsPlus.click();
        }

        LOGGER.trace("Saving Changes on Guests and Rooms");
        webDriver.findElement(DONE_BTN).click();
    }

    public void clickSearch() {
        LOGGER.trace("Clicking Search Button");
        webDriver.findElement(SEARCH_BTN).click();
    }

    public void hoverOverCurrency() {
        LOGGER.trace("Hovering over the Currency button.");
        new Actions(webDriver)
                .moveToElement(webDriver
                        .findElement(CURRENCY))
                .perform();
    }

    public void hoverOverLanguage() {
        LOGGER.trace("Hovering over the Language button.");
        new Actions(webDriver)
                .moveToElement(webDriver
                        .findElement(LANGUAGE))
                .perform();
    }

    public String currencyTooltipText(){
        LOGGER.trace("Returning Currency Tooltip text.");
        return webDriver.findElement(CURRENCY_TOOLTIP).getText().toLowerCase();
    }
    public String languageTooltipText(){
        LOGGER.trace("Returning Language Tooltip text.");
        return webDriver.findElement(LANGUAGE_TOOLTIP).getText().toLowerCase();
    }
}
