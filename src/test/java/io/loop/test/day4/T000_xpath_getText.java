package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {

    /*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with yor account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPasswordLink.click();
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(DocuportConstants.RESET_PASSWORD_URL)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        WebElement validateMessage = driver.findElement(By.xpath("//div[contains(text(),'email')]"));
        String actualMessage = validateMessage.getText();
        if(actualMessage.equals(DocuportConstants.RESET_PASSWORD_MESSAGE)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);
        WebElement sendButton = driver.findElement(By.xpath("//span[contains(.,'Send')]"));
        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space()='Cancel']"));
        if(sendButton.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        if(cancelButton.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        sendButton.click();

        Thread.sleep(5000);

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(10000);
        try {
            System.out.println(successMessage.getText());
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not there anymore");
        }

    }
}
