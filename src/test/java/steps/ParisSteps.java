package steps;

import driver.DriverManager;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.selenium.BookingHomePage;
import pages.selenium.BookingSearchResultsPage;
import utils.DateUtils;

import java.time.LocalDate;

public class ParisSteps {

    private static final Logger LOGGER = LogManager.getLogger(ParisSteps.class);

    private WebDriver driver;
    private BookingHomePage bookingHomePage;
    private BookingSearchResultsPage bookingSearchResultsPage;

    private LocalDate startDate;
    private LocalDate endDate;

    @Given("I open Booking home page")
    public void i_open_booking_home_page() {
        LOGGER.debug("Opening Booking home page.");
        driver = DriverManager.getDriver();
        bookingHomePage = new BookingHomePage(driver);
        bookingSearchResultsPage = new BookingSearchResultsPage(driver);
        bookingHomePage.open();
        LOGGER.info("Booking home page opened.");
    }

    @And("I accept cookies if present")
    public void i_accept_cookies_if_present() {
        LOGGER.debug("Accepting cookies if present.");
        bookingHomePage.acceptCookies();
        LOGGER.info("Cookies accepted.");
    }

    @And("I dismiss sign-in popup if present")
    public void i_dismiss_sign_in_popup_if_present() {
        LOGGER.debug("Dismissing sign-in popup if present.");
        bookingHomePage.dismissSignInIfPresent();
        LOGGER.info("Sign-in popup dismissed if present.");
    }

    @When("I enter city {string}")
    public void i_enter_city(String cityName) {
        LOGGER.debug("Entering city: " + cityName);
        bookingHomePage.enterDestination(cityName);
        LOGGER.info("City entered: " + cityName);
    }

    @And("I select city from list {string}")
    public void i_select_city_from_list(String cityName) {
        LOGGER.debug("Selecting city from list: " + cityName);
        bookingHomePage.selectFirstResult(cityName);
        LOGGER.info("City selected from list: " + cityName);
    }

    @And("I set check-in date after {int} days with {int} nights")
    public void i_set_check_in_date_after_days_with_n_nights(Integer startOffset, Integer duration) {
        LOGGER.debug("Setting check-in date after " + startOffset + " days with " + duration + " nights.");
        startDate = DateUtils.generateStartDate(startOffset);
        endDate = DateUtils.generateEndDate(startDate, duration);
        bookingHomePage.setDates(startDate, endDate);
        LOGGER.info("Check-in date set from " + startDate + " to " + endDate);
    }

    @And("I set {int} adults and {int} room")
    public void i_set_adults_and_room(Integer adults, Integer rooms) {
        LOGGER.debug("Setting " + adults + " adults and " + rooms + " room(s).");
        bookingHomePage.setGuestsAndRooms(adults, rooms);
        LOGGER.info("Guests and rooms set: " + adults + " adults, " + rooms + " room(s).");
    }

    @And("I click Search")
    public void i_click_search() {
        LOGGER.debug("Clicking Search button.");
        bookingHomePage.clickSearch();
        LOGGER.info("Search button clicked.");
    }

    @And("I filter by five stars")
    public void i_filter_by_five_stars() {
        LOGGER.debug("Filtering by five stars.");
        bookingSearchResultsPage.selectFiveStarsFilter();
        LOGGER.info("Five-star filter applied.");
    }

    @And("I open sorter dropdown")
    public void i_open_sorter_dropdown() {
        LOGGER.debug("Opening sorter dropdown.");
        bookingSearchResultsPage.openSorterDropdown();
        LOGGER.info("Sorter dropdown opened.");
    }

    @And("I sort by property rating desc")
    public void i_sort_by_property_rating_desc() {
        LOGGER.debug("Sorting by property rating descending.");
        bookingSearchResultsPage.selectSortOptionRatingDesc();
        LOGGER.info("Sorted by property rating descending.");
    }

    @Then("first hotel rating should be {string}")
    public void first_hotel_rating_should_be(String expectedRating) {
        LOGGER.debug("Verifying first hotel rating.");
        String actualRating = bookingSearchResultsPage.getFirstHotelRating();
        Assert.assertEquals("Wrong Rating", expectedRating, actualRating);
        LOGGER.info("Verified first hotel rating: " + actualRating);
    }
}