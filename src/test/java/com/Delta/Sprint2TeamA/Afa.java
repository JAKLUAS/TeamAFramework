package com.Delta.Sprint2TeamA;

import Pages.SignUpPage;
import com.Delta.TeamFramework.BaseClass;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Afa extends BaseClass2 {

@Test
    public void SignUpWithFirstAndLastname(){


    SignUpPage sign = new SignUpPage();

    driver.get(ConfigReader.getProperty("url"));

    SeleniumUtils.jsClick(sign.clickOnSignUp);
}

}
