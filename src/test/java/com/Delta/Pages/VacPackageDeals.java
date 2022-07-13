package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacPackageDeals {

    public VacPackageDeals() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")
    public WebElement cookieButton;

    @FindBy(xpath = "//a[@href='http://www.gobeyondtheflight.com']")
    public WebElement vacationIcon;

    @FindBy(xpath = "//span[@class='intro-2-button']")
    public WebElement shopThisDeal;

    @FindBy(id = "HOTEL_CAR")
    public WebElement Hotel_Car;

    @FindBy(id = "hotelCarHotelLocation")
    public WebElement hotelLocation;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']")
    public WebElement hotelLocationLAX;

    @FindBy(id = "noOfRooms2-button")
    public WebElement numberOfRooms;

    @FindBy(xpath = "//li[@id='ui-id-152']")
    public WebElement oneRoom;

    @FindBy(id = "depart-standardHotelCarCheck")
    public WebElement checkIn;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr[5]//td[2]")
    public WebElement checkInDate;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr[5]//td[6]")
    public WebElement checkOutDate;

    @FindBy(id = "noOfAdults2-button")
    public WebElement numberOfAdults;

    @FindBy(xpath = "//li[@id ='ui-id-175']")
    public WebElement twoAdults;

    @FindBy(id = "noOfChildren2-button")
    public WebElement numberOfChildren;

    @FindBy(xpath = "//li[@id ='ui-id-212']")
    public WebElement oneChild;

    @FindBy(id = "childAge11-button")
    public WebElement childAge;

    @FindBy(xpath = "//li[@id ='ui-id-236']")
    public WebElement twoYearsOld;

    @FindBy(id = "hotelCarSearchButtonHolder")
    public WebElement searchButton;

    @FindBy(id = "stateProv-button")
    public WebElement sortBy;

    @FindBy(xpath = "//li[@id ='ui-id-2']")
    public WebElement sortByPrice;




}
