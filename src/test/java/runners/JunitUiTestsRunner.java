package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        tests.homework.uitests.junit.GoogleWeatherTest.class,
        tests.homework.uitests.junit.HoverTest.class,
        tests.homework.uitests.junit.LondonTest.class,
        tests.homework.uitests.junit.ParisTest.class,
        tests.homework.uitests.junit.W3SchoolsTest.class
})

public class JunitUiTestsRunner {
}
//mvn test -Dtest=runners.JunitUiTestsRunner