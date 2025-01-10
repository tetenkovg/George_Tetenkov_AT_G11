package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDate;
import java.util.List;

public class BookingHomePage {
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
        webDriver.get(BOOKING_URL);
    }

    public void acceptCookies() {
        webDriver.findElement(ACCEPT_COOKIES_BTN).click();
    }

    public void dismissSignInIfPresent() {
        List<WebElement> dismissButtons = webDriver.findElements(SIGN_IN_DISMISS_BTN);
        if (!dismissButtons.isEmpty()) {
            dismissButtons.get(0).click();
            System.out.println("Sign-in window dismissed.");
        } else {
            System.out.println("Sign-in window not present, continuing test.");
        }
    }

    public void enterDestination(String destination) {
        WebElement input = webDriver.findElement(WHERE_TO_GO_INPUT);
        input.sendKeys(destination);
    }

    public void selectFirstResult(String cityName) {
        String xpath = String.format("//div[text()='%s']", cityName);
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        webDriver.findElement(By.xpath("//*[@data-date='" + startDate + "']")).click();
        webDriver.findElement(By.xpath("//*[@data-date='" + endDate + "']")).click();
    }

    public void setGuestsAndRooms(int additionalAdults, int additionalRooms) {
        webDriver.findElement(GUESTS_BTN).click();

        WebElement adultsPlus = webDriver.findElement(ADULTS_PLUS_BTN);
        WebElement roomsPlus = webDriver.findElement(ROOMS_PLUS_BTN);

        for (int i = 0; i < additionalAdults; i++) {
            adultsPlus.click();
        }
        for (int i = 0; i < additionalRooms; i++) {
            roomsPlus.click();
        }

        webDriver.findElement(DONE_BTN).click();
    }

    public void clickSearch() {
        webDriver.findElement(SEARCH_BTN).click();
    }

    public void hoverOverCurrency() {
        new Actions(webDriver)
                .moveToElement(webDriver
                        .findElement(CURRENCY))
                .perform();
    }

    public void hoverOverLanguage() {
        new Actions(webDriver)
                .moveToElement(webDriver
                        .findElement(LANGUAGE))
                .perform();
    }

    public String currencyTooltipText(){
        return webDriver.findElement(CURRENCY_TOOLTIP).getText().toLowerCase();
    }
    public String languageTooltipText(){
        return webDriver.findElement(LANGUAGE_TOOLTIP).getText().toLowerCase();
    }
}
