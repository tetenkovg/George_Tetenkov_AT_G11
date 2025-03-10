package tests.homework.uitests.selenium.junit;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Thread.sleep;

public class GoogleWeatherTest {
    @Test
    public void getWeather() throws InterruptedException {

        String tomorrowDay = dateFinder();
        String tomorrowXpath = tomorrowXpath(tomorrowDay);
        String SEARCH_BUTTON_XPATH = "//*[@class='lJ9FBc']//*[@name='btnK']";

        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.com");
        WebElement acceptAll = driver.findElement(By.xpath("//button/div[text()='Accept all']"));
        acceptAll.click();
        driver.findElement(By.name("q")).sendKeys("погода минск");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON_XPATH)));
        driver.findElement(By.xpath(SEARCH_BUTTON_XPATH)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tomorrowXpath)));
        List<WebElement> elements = driver.findElements(By.xpath(tomorrowXpath));
        String ariaLabelText = elements.get(0).getDomAttribute("aria-label");
        System.out.println(ariaLabelText);
        driver.quit();
    }


    public String tomorrowXpath(String tomorrowDay){
        return String.format("//*[contains(@aria-label, '°Celsius %s 12:00')]", tomorrowDay);
    }

    public String dateFinder() {
        String tomorrowDay;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        return tomorrowDay = now.plusDays(1).format(formatter);
    }
}
