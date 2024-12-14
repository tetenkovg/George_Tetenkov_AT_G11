package junit;

import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;

public class AutomatedEngineerTest {

    @Test
    public void testAutomatedEngineerConstructor() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 5);

        Assert.assertEquals(25, engineer.getAge());
        Assert.assertEquals(5, engineer.getExperience());
        Assert.assertEquals(15, engineer.getSkill()); // experience * 3
    }

    @Test
    public void testSetAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 5);
        engineer.setAge(30);
        Assert.assertEquals(30, engineer.getAge());
    }
}

