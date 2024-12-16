package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;


@RunWith(Parameterized.class)
public class EngineersTest {

    private final int age;
    private final int experience;
    private final String type;

    Random random = new Random();
    int randomNumber = random.nextInt(78) + 1;


    public EngineersTest(int age, int experience, String type) {
        this.age = age;
        this.experience = experience;
        this.type = type;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {25, 5, "manual"},
                {30, 7, "auto"},
                {40, 10, "manual"},
                {50, 30, "auto"},
                {30, 310, "manual"},
                {310, 13130, "auto"}
        });
    }

    @Test
    public void testEngineersConstructor() {
        if (type.equals("manual")) {
            ManualEngineer engineer = new ManualEngineer(age, experience);
            Assert.assertEquals("wrong age", age, engineer.getAge());
            Assert.assertEquals("Wrong exp",experience, engineer.getExperience());
            Assert.assertEquals("wrong skill",experience * 2, engineer.getSkill());
            System.out.println("Вот наш инженер "
                    + "Age:" + age +
                    " Exp: " + experience +
                    " Skill: " + engineer.getSkill() +
                    " Type " + type);
        } else if (type.equals("auto")) {
            AutomatedEngineer engineer = new AutomatedEngineer(age, experience);
            Assert.assertEquals(age, engineer.getAge());
            Assert.assertEquals(experience, engineer.getExperience());
            Assert.assertEquals(experience * 3, engineer.getSkill());
            System.out.println("Вот наш инженер " +
                    "Age:" + age +
                    " Exp: " + experience +
                    " Skill: " + engineer.getSkill() +
                    " Type " + type);
        } else {
            Assert.fail("Unkown" + type);

        }
    }

    @Test
    public void testSetAge() {
        if (type.equals("manual")) {
            ManualEngineer engineer = new ManualEngineer(age, experience);
            engineer.setAge(randomNumber);
            Assert.assertEquals(randomNumber, engineer.getAge());
            System.out.println("Вот наш инженер " +
                    " Age:" + randomNumber +
                    " Exp: " + experience +
                    " Skill: " + engineer.getSkill() +
                    " Type " + type);
        } else if (type.equals("auto")) {
            AutomatedEngineer engineer = new AutomatedEngineer(age, experience);
            engineer.setAge(randomNumber);
            Assert.assertEquals(randomNumber, engineer.getAge());
            System.out.println("Вот наш инженер " +
                    " Age:" + engineer.getAge() +
                    " Exp: " + engineer.getExperience() +
                    " Skill: " + engineer.getSkill() +
                    " Type " + type);
        } else {
            Assert.fail("Unkown" + type);

        }
    }
}

