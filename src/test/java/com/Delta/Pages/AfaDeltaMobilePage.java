package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfaDeltaMobilePage {



    public AfaDeltaMobilePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[@aria-label='No thanks']")
    public  WebElement clickOnNoThanxPopUp;
    @FindBy(xpath = "//div[@class='image-align-center'][1]")
   public WebElement clickOnAppStore;

    @FindBy(xpath = "//a[@class='btn-extsite btn btn-danger rounded-0']")
    public WebElement clickOnYesContinue;

    @FindBy(xpath = "//a[@href='https://play.google.com/store/apps/details?id=com.delta.mobile.android&hl=en_US']")
    public WebElement clickOnGoogle;

    @FindBy(xpath = "//a[@href='https://news.delta.com/fly-delta-app-50-update-aims-simplify-travel']")
    public WebElement ClickOnFlyDeltaApp;

    @FindBy(xpath = "//button[@class='agree-button eu-cookie-compliance-secondary-button']")
    public WebElement clickOnPopUp;

    @FindBy(xpath = "//input[@id='edit-keywords--3']")
    public WebElement ClickSearchSection;

    @FindBy(xpath = "//input[@id='content-type-article']")
    public WebElement clickOnArticleCheckbox;

    @FindBy(xpath = "//a[@href='/delta-has-summer-adventurers-covered-more-trans-atlantic-flights-premium-flight-experiences'][1]")

    public WebElement clickOnFirstArticle;
}

