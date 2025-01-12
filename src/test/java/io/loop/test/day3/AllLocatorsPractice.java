package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://loopcamp.vercel.app/registration_form.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Nazarii");

        WebElement withClassName = driver.findElement(By.className("form-control"));
        withClassName.sendKeys("Robocop");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Duvanov");

    }
}
