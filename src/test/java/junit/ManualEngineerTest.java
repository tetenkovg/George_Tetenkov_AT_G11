package junit;

import org.junit.Assert;
import org.junit.Test;
import people.ManualEngineer;

public class ManualEngineerTest {

    @Test
    public void testManualEngineerConstructor() {
        ManualEngineer engineer = new ManualEngineer(30, 4);

        Assert.assertEquals(30, engineer.getAge());
        Assert.assertEquals(4, engineer.getExperience());
        Assert.assertEquals(8, engineer.getSkill()); // experience * 2
    }

    @Test
    public void testSetExperience() {
        ManualEngineer engineer = new ManualEngineer(30, 4);
        engineer.setExperience(6);
        Assert.assertEquals(6, engineer.getExperience());
    }
}
