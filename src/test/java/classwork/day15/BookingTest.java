package classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class BookingTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver1.get("https://www.booking.com/");
        driver1.manage().window().maximize();

        driver1.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click(); //accept cookies

        if (driver1.findElement(By.xpath("//*[@role='dialog']")).isDisplayed()){
        }


        driver1.findElement(By.xpath("//*[@id=':rh:']")).click();
        driver1.findElement(By.xpath("//*[@class='a8887b152e']")).click();
        driver1.findElement(By.xpath("//*[@data-date='2024-12-24']")).click();
        driver1.findElement(By.xpath("//*[@data-date='2024-12-31']")).click();
        driver1.findElement(By.xpath("//*[@class='a8887b152e c7ce171153']")).click();


        WebElement adultPlus = driver1.findElement(By.xpath("//*[@id='group_adults']/following-sibling::div[2]/button[2]"));
        adultPlus.click();
        adultPlus.click();


        WebElement roomPlus = driver1.findElement(By.xpath("//*[@id='no_rooms']/following-sibling::div[2]/button[2]"));
        roomPlus.click();

        driver1.findElement(By.xpath("//*[@type='submit']")).click();

        sleep(5000);

        driver1.quit();






    }
}
