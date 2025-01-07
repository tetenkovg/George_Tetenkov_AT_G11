package junit;

import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;
import people.ManualEngineer;

public class ManualEngineerJunitTests {
    @Test
    public void getAgeTest() {
        ManualEngineer ae = new ManualEngineer(25, 5);
        Assert.assertEquals("Wrong Age", 25, ae.getAge());
    }

    @Test
    public void getExperienceTest() {
        ManualEngineer ae = new ManualEngineer(30, 10);
        Assert.assertEquals("Wrong Experience", 10, ae.getExperience());
    }

    @Test
    public void getSkillTest() {
        ManualEngineer ae = new ManualEngineer(45, 20);
        Assert.assertEquals("Wrong Skill", 20 * 2, ae.getSkill());
    }

    @Test
    public void setAgeTest() {
        ManualEngineer ae = new ManualEngineer(25, 5);
        ae.setAge(40);
        Assert.assertEquals("Wrong Age", 40, ae.getAge());
    }

    @Test
    public void setExperienceTest() {
        ManualEngineer ae = new ManualEngineer(30, 10);
        ae.setExperience(20);
        Assert.assertEquals("Wrong Experience", 20, ae.getExperience());
    }

    @Test
    public void setSkillTest() {
        ManualEngineer ae = new ManualEngineer(45, 20);
        ae.setSkill(50);
        Assert.assertEquals("Wrong Skill", 50, ae.getSkill());
    }
}
