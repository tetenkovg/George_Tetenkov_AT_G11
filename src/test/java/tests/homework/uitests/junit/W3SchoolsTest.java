package tests.homework.uitests.junit;


import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.junit.*;
import pages.W3SchoolsJavaPage;
import pages.GoogleSearchPage;
import pages.GoogleSearchResultsPage;

public class W3SchoolsTest {

    private WebDriver driver;
    private W3SchoolsJavaPage w3Page;
    private GoogleSearchPage googleSearchPage;
    private GoogleSearchResultsPage googleSearchResultsPage;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
        w3Page = new W3SchoolsJavaPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchResultsPage = new GoogleSearchResultsPage(driver);
    }

    @Test
    public void testDoubleClickCopyTutorial() {

        w3Page.open();
        w3Page.setAcceptCookies();
        w3Page.copyTitleWord();

        googleSearchPage.open();
        googleSearchPage.acceptCookies();
        googleSearchPage.clickOnSearchField();
        googleSearchPage.pasteInSearchField();
        googleSearchPage.pressEnterToSearch();

        boolean allContain = googleSearchResultsPage.allResultsContain("Tutorial");
        Assert.assertTrue("Not all Google results contain 'Tutorial'", allContain);
    }

    @After
    public void teardown() {
        DriverManager.quitDriver();
    }
}
