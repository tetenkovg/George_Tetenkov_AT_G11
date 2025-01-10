package tests.homework.uitests.testNg;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BookingHomePage;
import pages.BookingSearchResultsPage;

public class LondonTest {

    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    @BeforeTest
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

    @AfterTest
    public void shutDown() {
        DriverManager.quitDriver();
    }
}
