package classwork.day25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Mobile {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        ChromeOptions caps = new ChromeOptions();
        caps.setCapability("appium:deviceName","Emulator");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName","chrome");
        caps.setCapability("appium:chromedriverExecutable","/opt/homebrew/bin/chromedriver");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723"), caps);
        driver.get("https://stackoverflow.com/");

        Thread.sleep(5000);
        driver.quit();
    }
}
