package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {

    /*
    https://the-internet.herokuapp.com/forgot_password
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPasswordHeader.getText());

        // isDisplayed() --> will return TRUE or FALSE -- > boolean
        if (forgotPasswordHeader.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        System.out.println(forgotPasswordHeader.isDisplayed());

    }
}
