package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pages.selenide.BookingHomePageSelenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DismissGeniune {

    private static final Logger LOGGER = LogManager.getLogger(BookingHomePageSelenide.class);

    public static void dismissGeniune (By xpath){
        LOGGER.trace("Waiting for the sign-in popup to potentially appear...");

        Selenide.sleep(2000);
        ElementsCollection dismissButton = $$(xpath);
        if (!dismissButton.isEmpty()) {
            dismissButton.get(0).click();
            LOGGER.info("Sign-in window dismissed.");
        } else {
            LOGGER.info("Sign-in window not present, continuing test.");
        }
    }
}
