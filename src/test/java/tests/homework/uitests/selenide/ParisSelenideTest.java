package tests.homework.uitests.selenide;


import com.codeborne.selenide.WebDriverRunner;
import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenide.BookingHomePageSelenide;
import pages.selenide.BookingSearchResultsPageSelenide;
import utils.DateUtils;

import java.time.LocalDate;

public class ParisSelenideTest {
    private static final Logger LOGGER = LogManager.getLogger(ParisSelenideTest.class);

    private BookingHomePageSelenide bookingHomePage = new BookingHomePageSelenide();
    private BookingSearchResultsPageSelenide bookingSearchResultsPage = new BookingSearchResultsPageSelenide();

    @BeforeTest
    public void setUp() {
        LOGGER.info("Starting test: ParisTest");

    }

    @Test
    public void testParisSearch() {
        LOGGER.debug("Opening Booking home page.");
        bookingHomePage.openURL();
        // WebDriverRunner.getWebDriver().manage().window().maximize();

        LOGGER.debug("Accepting cookies.");
        bookingHomePage.acceptCookies();

        LOGGER.debug("Dismissing sign-in popup if present.");
        bookingHomePage.dismissGeniune();

        LOGGER.debug("Entering destination: Paris.");
        bookingHomePage.enterDestination("Paris");

        LOGGER.debug("Selecting first search result: Paris.");
        bookingHomePage.selectFirstResult("Paris");

        LocalDate startDate = DateUtils.generateStartDate(3);
        LocalDate endDate = DateUtils.generateEndDate(startDate, 7);

        LOGGER.debug("Setting check-in dates: from " + startDate + " to " + endDate);
        bookingHomePage.setDates(startDate, endDate);

        LOGGER.debug("Setting guests and rooms.");
        bookingHomePage.setGuestsAndRooms(2, 1);

        LOGGER.debug("Clicking search.");
        bookingHomePage.clickSearch();

        LOGGER.debug("Dismissing sign-in popup on search results page.");
        bookingSearchResultsPage.dismissGeniune();

        LOGGER.debug("Applying five-star filter.");
        bookingSearchResultsPage.selectFiveStarsFilter();

        LOGGER.debug("Opening sorter dropdown.");
        bookingSearchResultsPage.openSorterDropdown();

        LOGGER.debug("Sorting by property rating (high to low).");
        bookingSearchResultsPage.selectSortOptionRatingDesc();

        String rating = bookingSearchResultsPage.getFirstHotelRating();
        Assert.assertEquals(rating, "5 out of 5", "Wrong Rating");

        LOGGER.info("Test finished successfully: testParisSearch");
    }

    @AfterTest
    public void tearDown() {
        LOGGER.info("Tearing down test: ParisTest");
        DriverManager.quitDriver();
    }
}

