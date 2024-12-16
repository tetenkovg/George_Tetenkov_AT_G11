package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import people.AutomatedEngineer;
import people.ManualEngineer;

public class EngineersTest {
    @DataProvider (name = "EngineerTestData")
    public Object[][] testData(){
        return new Object[][]{
                {25,5},
                {30,7},
                {40, 10}
        };
    }

    @Test(dataProvider = "EngineerTestData")
    public void testAutomatedEngineerConstructor(int age, int experience) {
        AutomatedEngineer engineer = new AutomatedEngineer(age, experience);

        Assert.assertEquals(engineer.getAge(), age);
        Assert.assertEquals(engineer.getExperience(), experience);
        Assert.assertEquals(engineer.getSkill(), experience * 3);
    }

    @Test(dataProvider = "EngineerTestData")
    public void testManualEngineerConstructor(int age, int experience) {
        ManualEngineer engineer = new ManualEngineer(age, experience);

        Assert.assertEquals(engineer.getAge(), age);
        Assert.assertEquals(engineer.getExperience(), experience);
        Assert.assertEquals(engineer.getSkill(), experience * 2);
    }

    @Test
    public void testAutoEngineerSetAge() {
        AutomatedEngineer engineer = new AutomatedEngineer(25, 5);
        engineer.setAge(30);
        Assert.assertEquals(engineer.getAge(), 30);
    }
}
