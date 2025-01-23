package tests.classwork.day22;


import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class TestForTestRails {

    //C158016
    @Test(description = "158016")
    public void Test1() {
        Assert.assertTrue(true);

    }
    @Test(description = "158017")
    public void Test2() {
        Assert.assertTrue(true);
    }

    @Test(description = "158018")
    public void Test3() {
        Assert.assertTrue(true);
    }

    @Test(description = "158019")
    public void Test4() {
        Assert.assertTrue(false);
    }

    @Test(description = "158021")
    public void Test5() {
        Assert.assertTrue(false);
    }
}


