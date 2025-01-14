package tests.homework.uitests.selenium.junit;

import driver.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.selenium.BookingHomePage;

public class HoverTest {
    private BookingHomePage bookingHomePage;

    @Before
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
        Assert.assertEquals("Wrong text on the Tooltip", "select your currency", bookingHomePage.currencyTooltipText());
        bookingHomePage.hoverOverLanguage();
        Assert.assertEquals("Wrong text on the Tooltip", "select your language", bookingHomePage.languageTooltipText());

    }

    @After
    public void shutDown() {
        DriverManager.quitDriver();
    }
}
