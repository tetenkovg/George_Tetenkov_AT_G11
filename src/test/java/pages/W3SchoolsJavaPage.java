package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class W3SchoolsJavaPage {

    private final WebDriver driver;
    private static final String W3SCHOOLSJAVA_SITE = "https://w3schools.com/java/";
    private static final By ACCEPT_COOKIES = By.xpath("//*[@id='accept-choices']");

    private static final String TITLE_WORD = "span.color_h1";

    public W3SchoolsJavaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(W3SCHOOLSJAVA_SITE);
    }

    public void setAcceptCookies(){
        driver.findElement(ACCEPT_COOKIES).click();
    }

    public void copyTitleWord() {
        new Actions(driver).doubleClick(driver.findElement(By.cssSelector(TITLE_WORD)))
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
    }
}
