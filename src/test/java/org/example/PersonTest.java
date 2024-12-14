package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersonTest {
    @Test
    public void testPersonAge() {
        Person person = new Person(25);
        assertEquals("The age is not correct!", 25, person.getAge());
    }
}