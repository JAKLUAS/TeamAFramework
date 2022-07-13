package com.Delta.TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LyleUserStory extends BaseClass{

    @Test (groups= "smoke")
    public void getDestinations(){



        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();

    }
    @Test
    public void RoundTripandFlightDates(){

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();


        driver.findElement(By.xpath("//span[@aria-labelledby='selectTripType-label']")).click();
        driver.findElement(By.xpath("//li[@id='ui-list-selectTripType0']")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='15 August 2022, Monday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='22 August 2022, Monday']")));

    }
    @Test
    public void onePassenger() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='selectTripType-val']")));
        driver.findElement(By.xpath("//span[@id='selectTripType-val'][1]")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='15 August 2022, Monday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='22 August 2022, Monday']")));

        driver.findElement(By.xpath("//span[@aria-labelledby='passengers-label']")).click();
        driver.findElement(By.xpath("//li[text()='1 Passenger']")).click();

    }
    @Test
    public void submitButton() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='selectTripType-val']")));
        driver.findElement(By.xpath("//span[@id='selectTripType-val'][1]")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='15 August 2022, Monday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='22 August 2022, Monday']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='passengers-val']")));
        driver.findElement(By.xpath("//span[@id='passengers-val'][1]")).click();

        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();


    }
    @Test (groups= "smoke")
    public void verifyCurrentPage() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='selectTripType-val']")));
        driver.findElement(By.xpath("//span[@id='selectTripType-val'][1]")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='15 August 2022, Monday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='22 August 2022, Monday']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='passengers-val']")));
        driver.findElement(By.xpath("//span[@id='passengers-val'][1]")).click();

        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='btn-book-submit']")).isDisplayed());


    }
}
