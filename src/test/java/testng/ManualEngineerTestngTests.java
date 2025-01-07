package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import people.ManualEngineer;

public class ManualEngineerTestngTests {

    @Test
    public void checkGetAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 2);
        Assert.assertEquals(manualEngineer.getAge(), 25, "Wrong age!");
    }

    @Test
    public void checkGetSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 8);
        Assert.assertEquals(manualEngineer.getSkill(), 16, "Wrong Skill!");
    }

    @Test
    public void checkGetExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(40, 10);
        Assert.assertEquals(manualEngineer.getExperience(), 10, "Wrong Experience!");
    }
    @Test
    public void checkSetAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 2);
        manualEngineer.setAge(19);
        Assert.assertEquals(manualEngineer.getAge(), 19, "Wrong age!");
    }

    @Test
    public void checkSetSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 8);
        manualEngineer.setSkill(12);
        Assert.assertEquals(manualEngineer.getSkill(), 12, "Wrong Skill!");
    }

    @Test
    public void checkSetExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(40, 10);
        manualEngineer.setExperience(18);
        Assert.assertEquals(manualEngineer.getExperience(), 18, "Wrong Experience!");
    }
}
