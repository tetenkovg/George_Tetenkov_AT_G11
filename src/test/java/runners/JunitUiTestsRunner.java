package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.homework.uitests.selenium.junit.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        GoogleWeatherTest.class,
        HoverTest.class,
        LondonTest.class,
        ParisTest.class,
        W3SchoolsTest.class
})

public class JunitUiTestsRunner {
}
//mvn test -Dtest=runners.JunitUiTestsRunner