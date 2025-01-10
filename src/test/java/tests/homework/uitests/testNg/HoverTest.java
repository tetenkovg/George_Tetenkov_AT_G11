package tests.homework.uitests.testNg;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BookingHomePage;

public class HoverTest {
    private static final Logger LOGGER = LogManager.getLogger(HoverTest.class);
    private BookingHomePage bookingHomePage;

    @BeforeTest
    public void setUp() {
        LOGGER.info("Starting test: HoverTest");
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        LOGGER.debug("WebDriver initialized and BookingHomePage created.");
    }

    @Test
    public void HoverTest() {
        LOGGER.debug("Opening Booking home page.");
        bookingHomePage.open();

        LOGGER.debug("Accepting cookies.");
        bookingHomePage.acceptCookies();

        LOGGER.debug("Dismissing sign-in popup if present.");
        bookingHomePage.dismissSignInIfPresent();

        LOGGER.debug("Hovering over currency selector.");
        bookingHomePage.hoverOverCurrency();
        String currencyTooltipText = bookingHomePage.currencyTooltipText();
        LOGGER.debug("Currency tooltip text: " + currencyTooltipText);
        Assert.assertEquals(currencyTooltipText, "select your currency", "Wrong text on the Tooltip");
        LOGGER.info("Currency tooltip verified.");

        LOGGER.debug("Hovering over language selector.");
        bookingHomePage.hoverOverLanguage();
        String languageTooltipText = bookingHomePage.languageTooltipText();
        LOGGER.debug("Language tooltip text: " + languageTooltipText);
        Assert.assertEquals(languageTooltipText, "select your language", "Wrong text on the Tooltip");
        LOGGER.info("Language tooltip verified.");
    }

    @AfterTest
    public void shutDown() {
        LOGGER.info("Tearing down WebDriver.");
        DriverManager.quitDriver();
    }
}
