package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import people.AutomatedEngineer;

public class AutomatedEngineerTest {

    @Test
    public void testAutomatedEngineerConstructor() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 5);

        Assert.assertEquals(engineer.getAge(), 25);
        Assert.assertEquals(engineer.getExperience(), 5);
        Assert.assertEquals(engineer.getSkill(), 15); // experience * 3
    }

    @Test
    public void testSetAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 5);
        engineer.setAge(30);
        Assert.assertEquals(engineer.getAge(), 30);
    }
}
