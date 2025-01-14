package tests.homework.uitests.selenium.junit;


import driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.selenium.BookingHomePage;
import pages.selenium.BookingSearchResultsPage;

public class LondonTest {

    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        bookingSearchResultsPage = new BookingSearchResultsPage(driver);


    }

    @Test
    public void LondonTest() {

        bookingHomePage.open();
        bookingHomePage.acceptCookies();
        bookingHomePage.dismissSignInIfPresent();
        bookingHomePage.enterDestination("London");
        bookingHomePage.selectFirstResult("London");
        bookingHomePage.clickSearch();

        bookingSearchResultsPage.changeHotelStyle(10, "green", "red");
        bookingSearchResultsPage.takeScreenshot("London.jpg");

    }

    @After
    public void shutDown() {
        DriverManager.quitDriver();
    }
}

