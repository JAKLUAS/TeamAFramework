package com.Delta.Pages;

import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AfaHomePage {



    public AfaHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);



    }

    @FindBy(xpath = "//div[@class='cardb parbase'][3]")
    public WebElement clickOnDownloadDeltaApp;

    @FindBy(xpath = "//a[@class='inspiration-sub-nav-link']")
    public WebElement clickOnDeltaDigitalDropDown;

    @FindBy(xpath = "//a[@href='/us/en/delta-digital/innovation']")
    public WebElement clickOnInnovationDelta;

   @FindBy(xpath = "//a[@class='btn btn-danger rounded-0 btn-block btn-primary-cta']")
    public WebElement clickOnLearnMore;

   @FindBy(xpath = "//li[@class='panel panel-default nav-item-drawer'][4]")
    public WebElement clickOnAirportSecurity;

   @FindBy(xpath = "//div[@class='nextarrow ']")
    public WebElement clickOnNextButton;

}
