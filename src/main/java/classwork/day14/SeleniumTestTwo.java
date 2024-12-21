package classwork.day14;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumTestTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://google.com/");

        driver1.findElement(By.xpath("//*[@id='L2AGLb']")).click();
        driver1.findElement(By.name("q")).sendKeys("погода минск");
        sleep(2000);
        WebElement firstElement = driver1.findElement(By.xpath("//*[@role='listbox']/*[@data-entityname='погода минск']"));
        firstElement.click();
        sleep(500);

        WebElement tomorrow = driver1.findElement(By.xpath("//*[@id='wob_gsvg']/text[25]"));
        sleep(500);
        tomorrow.click();



        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        driver1.quit();
    }
}
