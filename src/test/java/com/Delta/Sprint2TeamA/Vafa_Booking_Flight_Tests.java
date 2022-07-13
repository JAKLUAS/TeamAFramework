package com.Delta.Sprint2TeamA;

import Pages.SortAndFilterPage;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import java.util.List;

public class Vafa_Booking_Flight_Tests extends BaseClass2 {

    @Test
    public void selectfromNYCtoBUR() {

        SortAndFilterPage sfp = new SortAndFilterPage();
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(sfp.clickOnFROM);
        sfp.clickOnSearch.sendKeys("LGA");
        sfp.clickOnLGA.click();
        SeleniumUtils.jsClick(sfp.clickOnTO);
        sfp.clickOnSearch2.sendKeys("BUR");
        sfp.clickOnBUR.click();
    }

    @Test
    public void FromNYCtoBURWithDates(){
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();
        SeleniumUtils.jsClick(sfp.clickOnFROM);
        sfp.clickOnSearch.sendKeys("LGA");
        sfp.clickOnLGA.click();
        SeleniumUtils.jsClick(sfp.clickOnTO);
        sfp.clickOnSearch2.sendKeys("BUR");
        sfp.clickOnBUR.click();
        sfp.clickONCalendar.click();
        sfp.clickONDate1.click();
        sfp.clickONDate2.click();
        sfp.clickONDone.click();
        }


    @Test
    public void FromNYCtoBURWithPassengers() {
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();
        SeleniumUtils.jsClick(sfp.clickOnFROM);
        sfp.clickOnSearch.sendKeys("LGA");
        sfp.clickOnLGA.click();
        SeleniumUtils.jsClick(sfp.clickOnTO);
        sfp.clickOnSearch2.sendKeys("BUR");
        sfp.clickOnBUR.click();
        sfp.clickONCalendar.click();
        sfp.clickONDate1.click();
        sfp.clickONDate2.click();
        sfp.clickONDone.click();
        sfp.clickOnPassenger.click();
        sfp.selectTwoPassengers.click();

    }

    @Test
    public void FromNYCtoBURWithMiles() {
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();
        SeleniumUtils.jsClick(sfp.clickOnFROM);
        sfp.clickOnSearch.sendKeys("LGA");
        sfp.clickOnLGA.click();
        SeleniumUtils.jsClick(sfp.clickOnTO);
        sfp.clickOnSearch2.sendKeys("BUR");
        sfp.clickOnBUR.click();
        sfp.clickONCalendar.click();
        sfp.clickONDate1.click();
        sfp.clickONDate2.click();
        sfp.clickONDone.click();
        sfp.clickOnPassenger.click();
        sfp.selectTwoPassengers.click();
        sfp.shopWithMiles.click();
    }

        @Test
        public void FromNYCtoBURWithAdvancedSearch() {
            driver.get(ConfigReader.getProperty("url1"));
            SortAndFilterPage sfp = new SortAndFilterPage();
            SeleniumUtils.jsClick(sfp.clickOnFROM);
            sfp.clickOnSearch.sendKeys("LGA");
            sfp.clickOnLGA.click();
            SeleniumUtils.jsClick(sfp.clickOnTO);
            sfp.clickOnSearch2.sendKeys("BUR");
            sfp.clickOnBUR.click();
            sfp.clickONCalendar.click();
            sfp.clickONDate1.click();
            sfp.clickONDate2.click();
            sfp.clickONDone.click();
            sfp.clickOnPassenger.click();
            sfp.selectTwoPassengers.click();
            sfp.shopWithMiles.click();
            sfp.clickOnAdvancedSearch.click();
            sfp.clickOnNearbyAirports.click();
            sfp.openBesFaresFor.click();
            sfp.clickonDeltaComfort.click();
            sfp.clickOnSubmit.click();

        }
    }
