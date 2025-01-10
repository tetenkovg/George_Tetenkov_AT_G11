package tests.homework.uitests.testNg;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BookingHomePage;
import pages.BookingSearchResultsPage;

public class LondonTest {

    private static final Logger LOGGER = LogManager.getLogger(LondonTest.class);
    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    @BeforeTest
    public void setUp() {
        LOGGER.info("Starting test: LondonTest");
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        bookingSearchResultsPage = new BookingSearchResultsPage(driver);
        LOGGER.debug("WebDriver initialized and PageObjects created.");
    }

    @Test
    public void LondonTest() {
        LOGGER.debug("Opening Booking home page.");
        bookingHomePage.open();

        LOGGER.debug("Accepting cookies.");
        bookingHomePage.acceptCookies();

        LOGGER.debug("Dismissing sign-in popup if present.");
        bookingHomePage.dismissSignInIfPresent();

        LOGGER.debug("Entering destination: London.");
        bookingHomePage.enterDestination("London");

        LOGGER.debug("Selecting first result: London.");
        bookingHomePage.selectFirstResult("London");

        LOGGER.debug("Clicking search button.");
        bookingHomePage.clickSearch();

        LOGGER.debug("Changing style of the 10th hotel card.");
        bookingSearchResultsPage.changeHotelStyle(10, "green", "red");

        LOGGER.debug("Taking screenshot and saving as London.jpg.");
        bookingSearchResultsPage.takeScreenshot("London.jpg");

        LOGGER.info("Test case LondonTest completed.");
    }

    @AfterTest
    public void shutDown() {
        LOGGER.info("Tearing down WebDriver.");
        DriverManager.quitDriver();
    }
}
