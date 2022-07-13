package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HalilHomePage {

    public HalilHomePage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='fromAirportCode']")
    public WebElement from;

    @FindBy(xpath = "//input[@id='search_input']")
    public WebElement search;

    @FindBy(xpath = "//li[@class='airport-list ng-star-inserted'][1]")

    public WebElement departCity;


    @FindBy(xpath = "//input[@name='arrivalCity']")
    public WebElement to;

    @FindBy(xpath = "//input[@id='search_input']")
    public WebElement search2;

    @FindBy(xpath = "//li[@class='airport-list ng-star-inserted'][1]")
    public WebElement arrivalCity;


    @FindBy(xpath = "//span[@class='calenderDepartSpan']")
    public WebElement calendar;

    @FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")
    public WebElement firstDate;

    @FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")
    public WebElement secondDate;
    @FindBy(xpath = "//button[@value='done']")
    public WebElement doneButton;
    @FindBy(xpath = "//span[@id='passengers-val']")
    public WebElement passenger;

    @FindBy(xpath = "//li[@id='ui-list-passengers1']")
    public WebElement twoPassengers;

    @FindBy(xpath = "//label[@for='shopWithMiles']")
    public WebElement shopWithMiles;

    @FindBy(xpath = "//a[@id='adv-search']")
    public WebElement advancedSearch;

    @FindBy(xpath = "//label[@for='nearbyAirports']")
    public WebElement nearbyAirports;
    @FindBy(xpath = "//span[@id='faresFor-val']")
    public WebElement openBesFaresFor;

    @FindBy(xpath = "//li[@id='ui-list-faresFor3']")
    public WebElement deltaComfort;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement submit;

    @FindBy(xpath = "//img[@class='siteLogo']")
    public WebElement deltaButton;
    @FindBy(xpath = "//p[.='The world is open for travel so start planning your next adventure. Explore our best flight deals and get out into the world.']")
    public WebElement adventure;
    @FindBy(xpath = "//a[@data-toggle='collapse']")
    public WebElement dealsAndDestinations;

    @FindBy(xpath = "//a[@href='/us/en/flight-deals/flights-to-europe']")
    public WebElement europeFlights;

    @FindBy(xpath = "//span[@class='select-ui-icon icon-Dropdown-caret']")
    public WebElement depart;

    @FindBy (id="ui-list-fromAirportCode1")           //(css = "li[id='ui-list-fromAirportCode1']")
    public WebElement firstCity;

    @FindBy(id = "toAirportCode-val")
    public WebElement destination;

    @FindBy(xpath = "//li[@id='ui-list-toAirportCode6']")
    public WebElement destinationCity;

    @FindBy(css = "button[id='btn-filter-update']")
    public WebElement arrowButton;


}
