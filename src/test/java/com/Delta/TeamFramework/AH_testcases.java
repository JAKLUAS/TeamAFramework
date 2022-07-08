package com.Delta.TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AH_testcases extends BaseClass {

    @Test(groups="smoke")
    public void chooseDestination() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();

    }

    @Test
    public void chooseTripAndDate() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("selectTripType-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='select-ui-icon icon-Dropdown-caret ng-tns-c1-2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("ui-list-selectTripType0")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='20 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='27 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath(" //button[@value='done']")));

    }

    @Test
    public void choosePassengerAndShow() throws InterruptedException {


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("selectTripType-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='select-ui-icon icon-Dropdown-caret ng-tns-c1-2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("ui-list-selectTripType0")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='20 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='27 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath(" //button[@value='done']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("passengers-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("ui-list-passengers1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@for='shopWithMiles']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("btn-book-submit")));

    }

    @Test(groups="smoke")
    public void chooseWithNoDates() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("selectTripType-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='select-ui-icon icon-Dropdown-caret ng-tns-c1-2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("ui-list-selectTripType0")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("passengers-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("ui-list-passengers1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[@for='shopWithMiles']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("btn-book-submit")));
        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='continue-link']")).getText(), "please correct the 1 item indicated");

    }



}
