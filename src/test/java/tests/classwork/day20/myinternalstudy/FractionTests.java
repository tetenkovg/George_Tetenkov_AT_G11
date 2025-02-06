package tests.classwork.day20.myinternalstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FractionTests {

    private static final Logger LOGGER = LogManager.getLogger(FractionTests.class);

    @Test
    public void FractionAddTest(){

        LOGGER.info("Create Fraction One");
        Fraction fractionOne = new Fraction(5,2);
        LOGGER.info("Create Fraction Two");
        Fraction fractionTwo = new Fraction(7, 6);
        LOGGER.info("Create Fraction One");
        Fraction expected = new Fraction(72, 36);

        LOGGER.info("Comparing Fraction One");
        assertEquals("Fractions does not equal each other: ", expected, Fraction.addFraction(fractionOne, fractionTwo));

        LOGGER.info("Here are our compared Fractions: Numerators {}, {} and denumerators {}, {}", fractionOne.getNumerator(), fractionTwo.getNumerator(), fractionOne.getDenumerator(), fractionTwo.getDenumerator());

    }
}
