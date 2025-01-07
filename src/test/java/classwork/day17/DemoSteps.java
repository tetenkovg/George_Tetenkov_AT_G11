package classwork.day17;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSteps {

    WebDriver driver = new ChromeDriver();
    CucumberSitePageObject page = new CucumberSitePageObject(driver);

    @Given("I open a site") public void openSite() {
        String url = "https://booking.com";
        driver.get(url);
        System.out.println("Opening url: " + url);
    }
    @When("I fill {string} into form") public void typeCity(String theCity) {
        page.findCity(theCity);
    }
    @Then(" I see greeting message") public void doAssert() {
        Assert.assertTrue("Expected hotel prise is lower than expected!", true);
    }
}
