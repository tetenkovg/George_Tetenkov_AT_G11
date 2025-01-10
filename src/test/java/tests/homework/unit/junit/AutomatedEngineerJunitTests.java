package tests.homework.unit.junit;

import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;

public class AutomatedEngineerJunitTests {
    @Test
    public void getAgeTest() {
        AutomatedEngineer ae = new AutomatedEngineer(25, 5);
        Assert.assertEquals("Wrong Age", 25, ae.getAge());
    }

    @Test
    public void getExperienceTest() {
        AutomatedEngineer ae = new AutomatedEngineer(30, 10);
        Assert.assertEquals("Wrong Experience", 10, ae.getExperience());
    }

    @Test
    public void getSkillTest() {
        AutomatedEngineer ae = new AutomatedEngineer(45, 20);
        Assert.assertEquals("Wrong Skill", 20 * 3, ae.getSkill());
    }

    @Test
    public void setAgeTest() {
        AutomatedEngineer ae = new AutomatedEngineer(25, 5);
        ae.setAge(40);
        Assert.assertEquals("Wrong Age", 40, ae.getAge());
    }

    @Test
    public void setExperienceTest() {
        AutomatedEngineer ae = new AutomatedEngineer(30, 10);
        ae.setExperience(20);
        Assert.assertEquals("Wrong Experience", 20, ae.getExperience());
    }

    @Test
    public void setSkillTest() {
        AutomatedEngineer ae = new AutomatedEngineer(45, 20);
        ae.setSkill(50);
        Assert.assertEquals("Wrong Skill", 50, ae.getSkill());
    }
}
