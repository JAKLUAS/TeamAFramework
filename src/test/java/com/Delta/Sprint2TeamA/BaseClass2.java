package com.Delta.Sprint2TeamA;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass2 {

    public WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setupMethod(){


        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }


    @AfterMethod(enabled = false)
    public void tearDownMethod(){

        Driver.quitDriver();

    }
}
