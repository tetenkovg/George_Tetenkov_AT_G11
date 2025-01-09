package tests.classwork.day17;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class CucumberRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "summary"
            },
            glue = {
                    "classwork.day17"
            },
            features = {
                    "src/test/resources/features/firstTest.feature"
            }
    )
    public class BookingRunner {}
}
