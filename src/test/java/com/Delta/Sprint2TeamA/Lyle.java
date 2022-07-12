package com.Delta.Sprint2TeamA;

import Pages.VacPackageDeals;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

import java.util.Set;

public class Lyle extends BaseClass2 {

    @Test
    public void clickVacationPackageDeals() {

            VacPackageDeals vacDeals = new VacPackageDeals();
            driver.get(ConfigReader.getProperty("urlLyle"));
            vacDeals.cookieButton.click();
            vacDeals.vacationIcon.click();
            String mainWindow = driver.getWindowHandle();
            Set <String> windowHandles = driver.getWindowHandles();
            for(String title: windowHandles){
                if(!title.equals(mainWindow)){
                    driver.switchTo().window(title);
                }
                }
            vacDeals.shopThisDeal.click();


    }
    @Test
        public void hotelLocationAndDates() {

            VacPackageDeals vacDeals = new VacPackageDeals();
            driver.get(ConfigReader.getProperty("urlLyle"));
            vacDeals.cookieButton.click();
            vacDeals.vacationIcon.click();
            String mainWindow = driver.getWindowHandle();
            Set <String> windowHandles = driver.getWindowHandles();
             for(String title: windowHandles){
                if(!title.equals(mainWindow)){
                    driver.switchTo().window(title);
            }
        }
            vacDeals.shopThisDeal.click();

            SeleniumUtils.jsClick(vacDeals.Hotel_Car);
            vacDeals.hotelLocation.sendKeys(ConfigReader.getProperty("arrHotelLoc"));
            SeleniumUtils.waitFor(2);
            SeleniumUtils.jsClick(vacDeals.hotelLocationLAX);

            vacDeals.checkIn.click();
            vacDeals.checkInDate.click();
            SeleniumUtils.waitFor(1);
            vacDeals.checkOutDate.click();
        }

        @Test
        public void roomAndNumberofOccupants(){

            VacPackageDeals vacDeals = new VacPackageDeals();
            driver.get(ConfigReader.getProperty("urlLyle"));
            vacDeals.cookieButton.click();
            vacDeals.vacationIcon.click();
            String mainWindow = driver.getWindowHandle();
            Set <String> windowHandles = driver.getWindowHandles();
            for(String title: windowHandles){
                if(!title.equals(mainWindow)){
                    driver.switchTo().window(title);
                }
            }
            vacDeals.shopThisDeal.click();

            SeleniumUtils.jsClick(vacDeals.Hotel_Car);
            vacDeals.hotelLocation.sendKeys(ConfigReader.getProperty("arrHotelLoc"));
            SeleniumUtils.waitFor(2);
            SeleniumUtils.jsClick(vacDeals.hotelLocationLAX);

            vacDeals.checkIn.click();
            vacDeals.checkInDate.click();
            SeleniumUtils.waitFor(1);
            vacDeals.checkOutDate.click();

            vacDeals.numberOfRooms.click();
            vacDeals.oneRoom.click();

            vacDeals.numberOfAdults.click();
            vacDeals.twoAdults.click();

            vacDeals.numberOfChildren.click();
            vacDeals.oneChild.click();

            vacDeals.childAge.click();
            SeleniumUtils.waitFor(2 );
            vacDeals.twoYearsOld.click();
        }
        @Test
        public void clickSearchButton() {

            VacPackageDeals vacDeals = new VacPackageDeals();
            driver.get(ConfigReader.getProperty("urlLyle"));
            vacDeals.cookieButton.click();
            vacDeals.vacationIcon.click();
            String mainWindow = driver.getWindowHandle();
            Set <String> windowHandles = driver.getWindowHandles();
            for(String title: windowHandles){
                if(!title.equals(mainWindow)){
                    driver.switchTo().window(title);
                }
            }
            vacDeals.shopThisDeal.click();

            SeleniumUtils.jsClick(vacDeals.Hotel_Car);
            vacDeals.hotelLocation.sendKeys(ConfigReader.getProperty("arrHotelLoc"));
            SeleniumUtils.waitFor(2);
            SeleniumUtils.jsClick(vacDeals.hotelLocationLAX);

            vacDeals.checkIn.click();
            vacDeals.checkInDate.click();
            SeleniumUtils.waitFor(1);
            vacDeals.checkOutDate.click();

            vacDeals.numberOfRooms.click();
            vacDeals.oneRoom.click();

            vacDeals.numberOfAdults.click();
            vacDeals.twoAdults.click();

            vacDeals.numberOfChildren.click();
            vacDeals.oneChild.click();

            vacDeals.childAge.click();
            SeleniumUtils.waitFor(2 );
            vacDeals.twoYearsOld.click();

            vacDeals.searchButton.click();
        }
        @Test
        public void sortByPrice() throws InterruptedException {

            VacPackageDeals vacDeals = new VacPackageDeals();
            driver.get(ConfigReader.getProperty("urlLyle"));
            vacDeals.cookieButton.click();
            vacDeals.vacationIcon.click();
            String mainWindow = driver.getWindowHandle();
            Set <String> windowHandles = driver.getWindowHandles();
            for(String title: windowHandles){
                if(!title.equals(mainWindow)){
                    driver.switchTo().window(title);
                }
            }
            vacDeals.shopThisDeal.click();

            SeleniumUtils.jsClick(vacDeals.Hotel_Car);
            vacDeals.hotelLocation.sendKeys(ConfigReader.getProperty("arrHotelLoc"));
            SeleniumUtils.waitFor(2);
            SeleniumUtils.jsClick(vacDeals.hotelLocationLAX);

            vacDeals.checkIn.click();
            vacDeals.checkInDate.click();
            SeleniumUtils.waitFor(1);
            vacDeals.checkOutDate.click();

            vacDeals.numberOfRooms.click();
            vacDeals.oneRoom.click();

            vacDeals.numberOfAdults.click();
            vacDeals.twoAdults.click();

            vacDeals.numberOfChildren.click();
            vacDeals.oneChild.click();

            vacDeals.childAge.click();
            SeleniumUtils.waitFor(2);
            vacDeals.twoYearsOld.click();

            vacDeals.searchButton.click();

            SeleniumUtils.waitFor(7);
            vacDeals.sortBy.click();
            vacDeals.sortByPrice.click();


    }


}
