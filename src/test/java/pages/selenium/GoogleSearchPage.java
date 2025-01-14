package pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchPage {

    private final WebDriver driver;

    private static final String GOOGLE = "https://google.com";
    private static final By SEARCH_FIELD = By.name("q");
    private static final By ACCEPT_COOKIES = By.xpath("//button/div[text()='Accept all']");


    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(GOOGLE);
    }

    public void acceptCookies() {
        driver.findElement(ACCEPT_COOKIES).click();
    }

    public void clickOnSearchField() {
        driver.findElement(SEARCH_FIELD).click();
    }

    public void pasteInSearchField() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
    }

    public void pressEnterToSearch() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.ENTER).build().perform();
    }
}
