package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

public class DriverManagerSelenide {

    public static void setUp() {
        Configuration.browser = "chrome";
        //Configuration.startMaximized = true;
        Configuration.timeout = 5000;
    }

    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}