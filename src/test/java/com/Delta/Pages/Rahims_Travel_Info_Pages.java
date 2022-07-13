package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rahims_Travel_Info_Pages {

        public Rahims_Travel_Info_Pages(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath = "//ul[@class='navbar-nav nav-primary nav']//li[6]")
        public WebElement travelInfoButton;

        @FindBy(xpath = "//input[@name='textfield'][1]")
        public WebElement selecctOnFisrtNameBox;

        @FindBy(xpath = "//input[@aria-label='Last Name']")
        public WebElement SelectOnLastNameBox;
}
