package steps;

import driver.DriverManager;
import io.cucumber.java.After;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CucumberHooks {
    private static final Logger LOGGER = LogManager.getLogger(CucumberHooks.class);

    @After
    public void tearDown() {
        LOGGER.info("Tearing down test in Cucumber.");
        DriverManager.quitDriver();
    }
}