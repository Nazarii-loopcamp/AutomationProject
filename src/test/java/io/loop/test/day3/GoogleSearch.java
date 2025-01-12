package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        // Create driver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Maximize
        driver.manage().window().maximize();

        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAIL");
        }

        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("Actual URL: " + actualURL + ", matches expected URL: " + expectedURL + ". => TEST PASS");
        } else {
            System.out.println("Actual URL: " + actualURL + ", DOES NOT match expected URL: " + expectedURL + ". => TEST FAIL");
        }

        driver.quit();

    }
}
