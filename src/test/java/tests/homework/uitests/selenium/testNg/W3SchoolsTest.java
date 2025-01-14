package tests.homework.uitests.selenium.testNg;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenium.W3SchoolsJavaPage;
import pages.selenium.GoogleSearchPage;
import pages.selenium.GoogleSearchResultsPage;

public class W3SchoolsTest {

    private static final Logger LOGGER = LogManager.getLogger(W3SchoolsTest.class);

    private WebDriver driver;
    private W3SchoolsJavaPage w3Page;
    private GoogleSearchPage googleSearchPage;
    private GoogleSearchResultsPage googleSearchResultsPage;

    @BeforeTest
    public void setup() {
        LOGGER.info("Starting test: W3SchoolsTest");
        driver = DriverManager.getDriver();
        w3Page = new W3SchoolsJavaPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchResultsPage = new GoogleSearchResultsPage(driver);
        LOGGER.debug("WebDriver initialized and PageObjects created.");
    }

    @Test
    public void testDoubleClickCopyTutorial() {
        LOGGER.debug("Opening W3Schools Java page.");
        w3Page.open();

        LOGGER.debug("Accepting cookies on W3Schools page.");
        w3Page.setAcceptCookies();

        LOGGER.debug("Copying title word from W3Schools page.");
        w3Page.copyTitleWord();

        LOGGER.debug("Opening Google Search page.");
        googleSearchPage.open();

        LOGGER.debug("Accepting cookies on Google Search page.");
        googleSearchPage.acceptCookies();

        LOGGER.debug("Clicking on search field in Google Search page.");
        googleSearchPage.clickOnSearchField();

        LOGGER.debug("Pasting copied text into Google search field.");
        googleSearchPage.pasteInSearchField();

        LOGGER.debug("Pressing Enter to start search.");
        googleSearchPage.pressEnterToSearch();

        LOGGER.debug("Verifying that all Google search results contain 'Tutorial'.");
        boolean allContain = googleSearchResultsPage.allResultsContain("Tutorial");
        Assert.assertTrue(allContain, "Not all Google results contain 'Tutorial'");
        LOGGER.info("Google search results verified: all contain 'Tutorial'.");
    }

    @AfterTest
    public void teardown() {
        LOGGER.info("Tearing down WebDriver.");
        DriverManager.quitDriver();
    }
}