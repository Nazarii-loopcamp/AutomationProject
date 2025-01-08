package io.loop.test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // Setting up the web driver
        WebDriverManager.chromedriver().setup();

        // Create the instance of the driver
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the page
        driver.get("https://loopcamp.io");

    }
}
