package com.Delta.Pages;
import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vafa_Booking_Page {


    public Vafa_Booking_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='fromAirportCode']")
    public WebElement clickOnFROM;

    @FindBy(xpath = "//input[@id='search_input']")
    public WebElement clickOnSearch;

    @FindBy(xpath = "//li[@class='airport-list ng-star-inserted'][1]")
    public WebElement clickOnLGA; //

    @FindBy(xpath = "//input[@name='arrivalCity']")
    public WebElement clickOnTO;

    @FindBy(xpath = "//input[@id='search_input']")
    public WebElement clickOnSearch2;

    @FindBy(xpath = "//li[@class='airport-list ng-star-inserted'][1]")
    public WebElement clickOnBUR;

    @FindBy(xpath = "//span[@class='calenderDepartSpan']")
      public WebElement clickONCalendar;

    @FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")
    public WebElement clickONDate1;

    @FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")
    public WebElement clickONDate2;

    @FindBy(xpath = "//button[@value='done']")
    public WebElement clickONDone;
    @FindBy(xpath = "//span[@id='passengers-val']")
    public WebElement clickOnPassenger;

    @FindBy(xpath = "//li[@id='ui-list-passengers1']")
    public WebElement selectTwoPassengers;

    @FindBy(xpath = "//label[@for='shopWithMiles']")
    public WebElement shopWithMiles;

    @FindBy(xpath = "//a[@id='adv-search']")
    public WebElement clickOnAdvancedSearch;

    @FindBy(xpath = "//label[@for='nearbyAirports']")
    public WebElement clickOnNearbyAirports;
    @FindBy(xpath = "//span[@id='faresFor-val']")
    public WebElement openBesFaresFor;

    @FindBy(xpath = "//li[@id='ui-list-faresFor3']")
    public WebElement clickOnDeltaComfort;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement clickOnSubmit;

}