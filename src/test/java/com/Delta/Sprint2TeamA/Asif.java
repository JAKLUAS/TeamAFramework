package com.Delta.Sprint2TeamA;

import com.Delta.Pages.HomePageRentACar;
import com.Delta.Pages.PickUpPageRentACar;
import com.Delta.Pages.SelectedPageRentACar;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class Asif extends BaseClass2 {


    @Test//PASS
    public void SelectACarWithPickupLocation() {

        HomePageRentACar rent = new HomePageRentACar();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        SeleniumUtils.jsClick(rent.clickOnRentACar);
        SeleniumUtils.switchToWindow("Travel with Delta");

        PickUpPageRentACar pickup = new PickUpPageRentACar();

        SeleniumUtils.jsClick(pickup.clickOnPickUp);
        SeleniumUtils.jsClick(pickup.clickOnPickUpAndEnter);
        pickup.EnterPickUpLocation();
        SeleniumUtils.jsClick(pickup.clickOnBurbank);
        SeleniumUtils.jsClick(pickup.clickOnDate);
        SeleniumUtils.jsClick(pickup.clickOnDatePickUp);
        SeleniumUtils.jsClick(pickup.clickOnDateDropOff);
        SeleniumUtils.jsClick(pickup.clickOnDoneButton);
        pickup.clickOnPickUpTime();
        pickup.clickOnDropOffTime();
        SeleniumUtils.jsClick(pickup.clickOnSearchButton);

    }

    @Test//PASS
    public void SelectACarWithoutPickupLocation() {

        HomePageRentACar rent = new HomePageRentACar();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        SeleniumUtils.jsClick(rent.clickOnRentACar);
        SeleniumUtils.switchToWindow("Travel with Delta");

        PickUpPageRentACar pickup = new PickUpPageRentACar();

        SeleniumUtils.jsClick(pickup.clickOnDate);
        SeleniumUtils.jsClick(pickup.clickOnDatePickUp);
        SeleniumUtils.jsClick(pickup.clickOnDateDropOff);
        SeleniumUtils.jsClick(pickup.clickOnDoneButton);
        pickup.clickOnPickUpTime();
        pickup.clickOnDropOffTime();
        SeleniumUtils.jsClick(pickup.clickOnSearchButton);
        pickup.CompareResults();

    }

    @Test//PASS
    public void SelectACarEconomyAndTotalPrice() {

        HomePageRentACar rent = new HomePageRentACar();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        SeleniumUtils.jsClick(rent.clickOnRentACar);
        SeleniumUtils.switchToWindow("Travel with Delta");

        PickUpPageRentACar pickup = new PickUpPageRentACar();

        SeleniumUtils.jsClick(pickup.clickOnPickUp);
        SeleniumUtils.jsClick(pickup.clickOnPickUpAndEnter);
        pickup.EnterPickUpLocation();
        SeleniumUtils.jsClick(pickup.clickOnBurbank);
        SeleniumUtils.jsClick(pickup.clickOnDate);
        SeleniumUtils.jsClick(pickup.clickOnDatePickUp);
        SeleniumUtils.jsClick(pickup.clickOnDateDropOff);
        SeleniumUtils.jsClick(pickup.clickOnDoneButton);
        pickup.clickOnPickUpTime();
        pickup.clickOnDropOffTime();
        SeleniumUtils.jsClick(pickup.clickOnSearchButton);

        SelectedPageRentACar selected = new SelectedPageRentACar();

        SeleniumUtils.jsClick(selected.clickOnEconomy);
        selected.clickOnSortBy();

    }

    @Test //PASS
    public void SelectACarATMAndMileage() {

        HomePageRentACar rent = new HomePageRentACar();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        SeleniumUtils.jsClick(rent.clickOnRentACar);
        SeleniumUtils.switchToWindow("Travel with Delta");

        PickUpPageRentACar pickup = new PickUpPageRentACar();

        SeleniumUtils.jsClick(pickup.clickOnPickUp);
        SeleniumUtils.jsClick(pickup.clickOnPickUpAndEnter);
        pickup.EnterPickUpLocation();
        SeleniumUtils.jsClick(pickup.clickOnBurbank);
        SeleniumUtils.jsClick(pickup.clickOnDate);
        SeleniumUtils.jsClick(pickup.clickOnDatePickUp);
        SeleniumUtils.jsClick(pickup.clickOnDateDropOff);
        SeleniumUtils.jsClick(pickup.clickOnDoneButton);
        pickup.clickOnPickUpTime();
        pickup.clickOnDropOffTime();
        SeleniumUtils.jsClick(pickup.clickOnSearchButton);

        SelectedPageRentACar selected = new SelectedPageRentACar();

        SeleniumUtils.jsClick(selected.clickOnEconomy);
        SeleniumUtils.scroll(0,1200);
        SeleniumUtils.jsClick(selected.clickOnAutomaticTransmission);
        SeleniumUtils.jsClick(selected.clickOnUnlimitedMileage);

    }


}