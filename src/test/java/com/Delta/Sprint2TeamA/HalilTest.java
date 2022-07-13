package com.Delta.Sprint2TeamA;

import com.Delta.Pages.HalilHomePage;
import com.Delta.Pages.Vafa_Booking_Page;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class HalilTest extends BaseClass2 {

    @Test(groups ={"smoke"})
    public void bookAFlight(){

        HalilHomePage halilHomePage = new HalilHomePage();
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(halilHomePage.from);
        halilHomePage.search.sendKeys("LGA");
        halilHomePage.departCity.click();
        SeleniumUtils.jsClick(halilHomePage.to);
        halilHomePage.search2.sendKeys("BUR");
        halilHomePage.arrivalCity.click();
    }

    @Test(groups ={"smoke"})
    public void oneWay(){
        HalilHomePage halilHomePage = new HalilHomePage();
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(halilHomePage.from);
        halilHomePage.search.sendKeys("LGA");
        halilHomePage.departCity.click();
        SeleniumUtils.jsClick(halilHomePage.to);
        halilHomePage.search2.sendKeys("BUR");
        halilHomePage.arrivalCity.click();
        halilHomePage.calendar.click();
        halilHomePage.firstDate.click();
        halilHomePage.secondDate.click();
        halilHomePage.doneButton.click();
    }

    @Test(groups ={"smoke"})
    public void bookAEuropeFlight(){
        HalilHomePage halilHomePage = new HalilHomePage();
        driver.get(ConfigReader.getProperty("url1"));
        halilHomePage.deltaButton.click();
        SeleniumUtils.scroll(0,400);
        halilHomePage.adventure.click();
        halilHomePage.dealsAndDestinations.click();
        halilHomePage.europeFlights.click();
        SeleniumUtils.scroll(0, 200);
        halilHomePage.depart.click();
        SeleniumUtils.jsClick(halilHomePage.firstCity);
        halilHomePage.destination.click();
        halilHomePage.destinationCity.click();
        SeleniumUtils.jsClick(halilHomePage.arrowButton);
}
    @Test
    public void advancedSearch() {
        HalilHomePage halilHomePage = new HalilHomePage();
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(halilHomePage.from);
        halilHomePage.search.sendKeys("LGA");
        halilHomePage.departCity.click();
        SeleniumUtils.jsClick(halilHomePage.to);
        halilHomePage.search2.sendKeys("BUR");
        halilHomePage.arrivalCity.click();
        halilHomePage.calendar.click();
        halilHomePage.firstDate.click();
        halilHomePage.secondDate.click();
        halilHomePage.doneButton.click();
        halilHomePage.passenger.click();
        halilHomePage.twoPassengers.click();
        halilHomePage.shopWithMiles.click();
        halilHomePage.advancedSearch.click();
        halilHomePage.nearbyAirports.click();
        halilHomePage.openBesFaresFor.click();
        halilHomePage.deltaComfort.click();
        halilHomePage.submit.click();

    }


}
