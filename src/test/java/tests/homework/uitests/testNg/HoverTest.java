package tests.homework.uitests.testNg;

import driver.DriverManager;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BookingHomePage;

public class HoverTest {
    private BookingHomePage bookingHomePage;

    @BeforeTest
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
    }

    @Test
    public void HoverTest() {

        bookingHomePage.open();
        bookingHomePage.acceptCookies();
        bookingHomePage.dismissSignInIfPresent();

        bookingHomePage.hoverOverCurrency();
        Assert.assertEquals(bookingHomePage.currencyTooltipText(), "select your currency", "Wrong text on the Tooltip");

        bookingHomePage.hoverOverLanguage();
        Assert.assertEquals(bookingHomePage.languageTooltipText(), "select your language", "Wrong text on the Tooltip");

    }

    @AfterTest
    public void shutDown() {
        DriverManager.quitDriver();
    }
}
