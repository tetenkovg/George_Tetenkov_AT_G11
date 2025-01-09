package tests.homework.unit.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJunitTests.class,
        ParametrizedJunitTests.class,
        ManualEngineerJunitTests.class
})

public class JunitEngineerRunner {
}
