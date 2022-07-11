package com.Delta.Sprint2TeamA;

import com.Delta.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass2 {

    public WebDriver driver;
    Faker fake = new Faker();


    @BeforeMethod(alwaysRun = true)
    public void setupMethod() {


        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }


    @AfterMethod(alwaysRun = true)
    public void tearDownMethod() {

        Driver.quitDriver();

    }
}
