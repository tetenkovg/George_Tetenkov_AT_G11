package tests.homework.unit.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParametrizedJunitTests {
    @Parameterized.Parameter()
    public Engineer engineer;

    @Parameterized.Parameter(1)
    public int expectedSkill;

    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {
        return Arrays.asList(new Object[][]{
                {new ManualEngineer(18, 5), 10},
                {new AutomatedEngineer(18, 5), 15}
        });
    }

    @Test
    public void getAgeTest() {
        assertEquals("The age is wrong", 18, engineer.getAge());
    }

    @Test
    public void getSkillTest() {
        assertEquals("The skill is wrong", expectedSkill, engineer.getSkill());
    }

    @Test
    public void getExperienceTest() {
        assertEquals("The experience is wrong", 5, engineer.getExperience());
    }

    @Test
    public void setAgeTest() {
        engineer.setAge(99);
        assertEquals("The age is wrong", 99, engineer.getAge());
    }

    @Test
    public void setSkillTest() {
        engineer.setSkill(45);
        assertEquals("The skill is wrong", 45, engineer.getSkill());
    }

    @Test
    public void setExperienceTest() {
        engineer.setExperience(9);
        assertEquals("The experience is wrong", 9, engineer.getExperience());
    }
}

