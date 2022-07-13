package com.Delta.Sprint2TeamA;

import com.Delta.Pages.Rahims_Travel_Info_Pages;
import com.Delta.Sprint2TeamA.BaseClass2;
import com.Delta.Utilities.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Rahim extends BaseClass2 {

    @Test (groups={"smoke"})
    public void DeltaOne() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();

        //new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[6]")));
        WebElement travelInfoDD = rrPages.travelInfoButton;
        Actions actions = new Actions(driver); //
        actions.moveToElement(travelInfoDD).build().perform();
        driver.findElement(By.xpath("//ul[@class='list-unstyled m-lg-0']//li[1]")).click();
        //Thread.sleep(2000);
        SoftAssert softAssertion= new SoftAssert(); //
        String actualDeltaOne = "Delta One";
        softAssertion.assertTrue(driver.getTitle().contains(actualDeltaOne));



    }
    @Test (groups={"smoke"})
    public void premiumSelect() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[6]")));
        WebElement travelInfoDD = rrPages.travelInfoButton;
        Actions actions = new Actions(driver); //
        actions.moveToElement(travelInfoDD).build().perform();
        driver.findElement(By.xpath("//ul[@class='list-unstyled m-lg-0']//li[2]")).click();
        SoftAssert softAssertion= new SoftAssert(); //
        String actualPremiumSelect = "Premium Select";
        softAssertion.assertTrue(driver.getTitle().contains(actualPremiumSelect));
    }

    @Test (groups={"smoke"})
    public void firstClass() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();

        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[6]")));
        WebElement travelInfoDD = rrPages.travelInfoButton;
        Actions actions = new Actions(driver); //
        actions.moveToElement(travelInfoDD).build().perform();
        driver.findElement(By.xpath("//ul[@class='list-unstyled m-lg-0']//li[3]")).click();
        SoftAssert softAssertion= new SoftAssert(); //
        String actualFirstClass = "First Class";
        softAssertion.assertTrue(driver.getTitle().contains(actualFirstClass));
    }

    @Test
    public void comfortPlus() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[6]")));
        WebElement travelInfoDD = rrPages.travelInfoButton;
        Actions actions = new Actions(driver); //
        actions.moveToElement(travelInfoDD).build().perform();
        driver.findElement(By.xpath("//ul[@class='list-unstyled m-lg-0']//li[4]")).click();
        SoftAssert softAssertion= new SoftAssert(); //
        String actualComfortPlus = "Comfort Pluss";
        softAssertion.assertTrue(driver.getTitle().contains(actualComfortPlus));
    }

    @Test (groups={"smoke"})
    public void mainCabin() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[6]")));
        WebElement travelInfoDD = rrPages.travelInfoButton;
        Actions actions = new Actions(driver); //
        actions.moveToElement(travelInfoDD).build().perform();
        driver.findElement(By.xpath("//ul[@class='list-unstyled m-lg-0']//li[5]")).click();

        SoftAssert softAssertion= new SoftAssert(); //
        String actualMainCabin = "Main Cabin";
        softAssertion.assertTrue(driver.getTitle().contains(actualMainCabin));
    }









}
