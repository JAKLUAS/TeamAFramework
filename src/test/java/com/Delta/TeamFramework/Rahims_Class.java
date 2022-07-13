package com.Delta.TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Rahims_Class extends BaseClass{

    @Test (groups={"smoke"})
    public void choosingFromTo() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][3]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][0]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//div[@aria-describedby='departureDate-error1']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='18']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='24']")).click();
        driver.findElement(By.xpath("//button[@class='donebutton']")).click();
        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();

    }
    @Test (groups={"smoke"})
    public void selectNumOfPassengers() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][3]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][0]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//div[@aria-describedby='departureDate-error1']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='18']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='24']")).click();
        driver.findElement(By.xpath("//button[@class='donebutton']")).click();
        driver.findElement(By.xpath("//span[@aria-labelledby='passengers-label']")).click(); //Click and select number of passengers
        driver.findElement(By.xpath("//li[text()='2 Passengers']")).click();
        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();
    }

    @Test (groups={"smoke"})
    public void selectRefundableFares() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][3]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][0]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//div[@aria-describedby='departureDate-error1']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='18']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='24']")).click();
        driver.findElement(By.xpath("//button[@class='donebutton']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[text()='Refundable Fares']")));
        driver.findElement(By.xpath("//label[text()='Refundable Fares']")).click(); //Select refundable fares


        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();
    }

    @Test
    public void selectMyDatesAreFlexible() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][3]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][0]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//div[@aria-describedby='departureDate-error1']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='18']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='24']")).click();
        driver.findElement(By.xpath("//button[@class='donebutton']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[text()='My dates are flexible']")));
        driver.findElement(By.xpath("//label[text()='My dates are flexible']")).click(); //Select My Dates are Flexible

        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();
    }

    @Test (groups={"smoke"})
    public void AdvanceSearch() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][3]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BUR");
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='airport-list ng-star-inserted'][0]")));
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//div[@aria-describedby='departureDate-error1']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='18']")).click();
        driver.findElement(By.xpath("//td[@class = 'dl-datepicker-available-day']//a[text()='24']")).click();
        driver.findElement(By.xpath("//button[@class='donebutton']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='adv-search']")).click();
        driver.findElement(By.xpath("//span[@aria-labelledby='faresFor-label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='First Class']")).click();
        driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
    }









}
