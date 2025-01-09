package tests.homework.uitests.testNg;


import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BookingHomePage;
import pages.BookingSearchResultsPage;
import utils.DateUtils;

import java.time.LocalDate;

public class ParisTest {

    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    @BeforeTest
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        bookingSearchResultsPage = new BookingSearchResultsPage(driver);
        bookingHomePage.open("https://www.booking.com/");
    }

    @Test
    public void testParisSearch() {
        bookingHomePage.acceptCookies();
        bookingHomePage.dismissSignInIfPresent();

        bookingHomePage.enterDestination("Paris");
        bookingHomePage.selectFirstResult();

        LocalDate startDate = DateUtils.generateStartDate(3);
        LocalDate endDate = DateUtils.generateEndDate(startDate, 7);

        bookingHomePage.setDates(startDate, endDate);
        bookingHomePage.setGuestsAndRooms(2, 1);
        bookingHomePage.clickSearch();
        bookingSearchResultsPage.dismissSignInIfPresent();
        bookingSearchResultsPage.selectFiveStarsFilter();
        bookingSearchResultsPage.openSorterDropdown();
        bookingSearchResultsPage.selectSortOptionRatingDesc();

        String rating = bookingSearchResultsPage.getFirstHotelRating();
        Assert.assertEquals(rating, "5 out of 5", "Wrong Rating");
    }

    @AfterTest
    public void tearDown() {
        DriverManager.quitDriver();
    }
}

