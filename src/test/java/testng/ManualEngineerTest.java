package testng;


import org.testng.Assert;
import org.testng.annotations.Test;
import people.ManualEngineer;

public class ManualEngineerTest {

    @Test
    public void testManualEngineerConstructor() {
        ManualEngineer engineer = new ManualEngineer(30, 4);

        Assert.assertEquals(engineer.getAge(), 30);
        Assert.assertEquals(engineer.getExperience(), 4);
        Assert.assertEquals(engineer.getSkill(), 8); // experience * 2
    }

    @Test
    public void testSetExperience() {
        ManualEngineer engineer = new ManualEngineer(30, 4);
        engineer.setExperience(6);
        Assert.assertEquals(engineer.getExperience(), 6);
    }
}