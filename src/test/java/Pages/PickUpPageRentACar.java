package Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PickUpPageRentACar {

    public PickUpPageRentACar(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = " //button[@aria-label='Pick-up']")
    public WebElement clickOnPickUp;

    @FindBy(id = "location-field-locn")
    public WebElement clickOnPickUpAndEnter;

    public void EnterPickUpLocation(){

        Driver.getDriver().findElement(By.id("location-field-locn")).sendKeys("Bur");
    }

    @FindBy(xpath = "//button[@aria-label='Burbank (BUR - Hollywood Burbank) California, United States']")
    public WebElement clickOnBurbank;

    @FindBy(xpath = "//button[@id='d1-btn']")
    public WebElement clickOnDate;

    @FindBy(xpath = "//button[@aria-label='Jul 20, 2022']")
    public WebElement clickOnDatePickUp;

    @FindBy(xpath = "//button[@aria-label='Jul 27, 2022']")
    public WebElement clickOnDateDropOff;

    @FindBy(xpath = "//button[@data-stid='apply-date-picker']")
    public WebElement clickOnDoneButton;

//    @FindBy(xpath = "//div[@class='uitk-field uitk-field-select-field has-floatedLabel-label has-icon has-no-placeholder']")
//    public WebElement clickOnPickUpTime;

    public void clickOnPickUpTime(){

        Select select = new Select(Driver.getDriver().findElement(By.className("uitk-field-select")));
        select.selectByValue("1000AM");

    }

    @FindBy(xpath = "//option[@data-time='600']")
    public WebElement clickOnChosenPickUpTime;

//    @FindBy(xpath = "//select[@aria-label='Drop-off time']")
//    public WebElement clickOnDropOffTime;

    public void clickOnDropOffTime(){

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@aria-label='Drop-off time']")));
        select.selectByValue("1000AM");

    }

    @FindBy(xpath = "//option[@data-time='660']")
    public WebElement clickOnChosenDropOffTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickOnSearchButton;

    public void CompareResults(){

       Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h3[@class='uitk-error-summary-heading']")).getText(), "To continue, please correct the error below.");
    }





}


