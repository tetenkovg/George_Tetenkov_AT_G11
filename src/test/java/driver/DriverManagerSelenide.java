package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManagerSelenide {

    public static void setUp() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
    }

    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}