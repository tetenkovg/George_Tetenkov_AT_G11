package tests.homework.uitests.junit;


import driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import pages.BookingHomePage;
import pages.BookingSearchResultsPage;
import utils.DateUtils;

import java.time.LocalDate;

public class ParisTest {

    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        bookingSearchResultsPage = new BookingSearchResultsPage(driver);

    }

    @Test
    public void testParisSearch() {
        bookingHomePage.open();
        bookingHomePage.acceptCookies();
        bookingHomePage.dismissSignInIfPresent();

        bookingHomePage.enterDestination("Paris");
        bookingHomePage.selectFirstResult("Paris");

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
        Assert.assertEquals("Wrong Rating", "5 out of 5", rating);
    }


    @After
    public void teardown() {
        DriverManager.quitDriver();
    }
}


