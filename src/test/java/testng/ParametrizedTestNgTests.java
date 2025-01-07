package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import people.AutomatedEngineer;
import people.ManualEngineer;

public class ParametrizedTestNgTests {
    @DataProvider (name = "EngineerTestData")
    public Object[][] testData(){
        return new Object[][]{
                {25,5},
                {30,7},
                {40, 10}
        };
    }

    @Test(dataProvider = "EngineerTestData")
    public void testAutomatedEngineerSetAge(int age, int experience) {
        AutomatedEngineer engineer = new AutomatedEngineer(age, experience);
        Assert.assertEquals(engineer.getAge(), age);
    }
    @Test(dataProvider = "EngineerTestData")
    public void testAutomatedEngineerSetExperience(int age, int experience) {
        AutomatedEngineer engineer = new AutomatedEngineer(age, experience);
        Assert.assertEquals(engineer.getExperience(), experience);
    }

    @Test(dataProvider = "EngineerTestData")
    public void testAutomatedEngineerSetSkill(int age, int experience) {
        AutomatedEngineer engineer = new AutomatedEngineer(age, experience);
        Assert.assertEquals(engineer.getSkill(), experience * 3);
    }

    @Test(dataProvider = "EngineerTestData")
    public void testManualEngineerSetAge(int age, int experience) {
        ManualEngineer engineer = new ManualEngineer(age, experience);
        Assert.assertEquals(engineer.getAge(), age);
    }

    @Test(dataProvider = "EngineerTestData")
    public void testManualEngineerSetExperience(int age, int experience) {
        ManualEngineer engineer = new ManualEngineer(age, experience);
        Assert.assertEquals(engineer.getExperience(), experience);
    }

    @Test(dataProvider = "EngineerTestData")
    public void testManualEngineerSetSkill(int age, int experience) {
        ManualEngineer engineer = new ManualEngineer(age, experience);
        Assert.assertEquals(engineer.getSkill(), experience * 2);
    }

}
