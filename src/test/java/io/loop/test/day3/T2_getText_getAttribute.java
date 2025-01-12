package io.loop.test.day3;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopcampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(LoopcampConstants.REGISTRATION_FORM_URL);

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();
        if (actualHeaderForForm.contains(LoopcampConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected: " + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + ", matches actual: " + actualHeaderForForm + " = TEST PASS");
        } else {
            System.err.println("Expected: " + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + ", DOES NOT match actual: " + actualHeaderForForm + " = TEST FAIL");
        }

        WebElement firstNamePlaceholder = driver.findElement(By.name("firstname"));
        String actualFirstNamePlaceholder = firstNamePlaceholder.getAttribute("placeholder");

        if (actualFirstNamePlaceholder.contains(LoopcampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME)) {
            System.out.println("Expected: " + LoopcampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME + ", matches actual: " + actualFirstNamePlaceholder + " = TEST PASS");
        } else {
            System.out.println("Expected: " + LoopcampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME + ", DOES NOT match actual: " + actualFirstNamePlaceholder + " = TEST FAIL");
        }

    }
}
