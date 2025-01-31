package io.loop.test.day5;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class T1_testNG_intro {

    @Test (priority = 2)
    public void test() {
        System.out.println("Test 1 is running");
        String actual = "Feyruz";
        String expected = "Nadir";
        assertEquals(actual, expected, "Message show only if test fails");
    }

    @Test (priority = 1)
    public void test2() {
        System.out.println("Test 2 is running");
        String actual = "Diana";
        String expected = "Diana";
        assertEquals(actual, expected, "Actual does not match expected");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method is running");

    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method is running");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is running");
    }

}
