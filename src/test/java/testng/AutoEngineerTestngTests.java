package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import people.AutomatedEngineer;


public class AutoEngineerTestngTests {

    @Test
    public void checkGetAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 2);
        Assert.assertEquals(automatedEngineer.getAge(), 25, "Wrong age!");
    }

    @Test
    public void checkGetSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(30, 8);
        Assert.assertEquals(automatedEngineer.getSkill(), 24, "Wrong Skill!");
    }

    @Test
    public void checkGetExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(40, 10);
        Assert.assertEquals(automatedEngineer.getExperience(), 10, "Wrong Experience!");
    }
    @Test
    public void checkSetAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 2);
        automatedEngineer.setAge(19);
        Assert.assertEquals(automatedEngineer.getAge(), 19, "Wrong age!");
    }

    @Test
    public void checkSetSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(30, 8);
        automatedEngineer.setSkill(12);
        Assert.assertEquals(automatedEngineer.getSkill(), 12, "Wrong Skill!");
    }

    @Test
    public void checkSetExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(40, 10);
        automatedEngineer.setExperience(18);
        Assert.assertEquals(automatedEngineer.getExperience(), 18, "Wrong Experience!");
    }
}
