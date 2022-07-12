package Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectedPageRentACar {

    public SelectedPageRentACar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //input[@id='economy']")
    public WebElement clickOnEconomy;

//    @FindBy(xpath = "//div[@class='uitk-field uitk-field-select-field has-floatedLabel-label has-no-placeholder']")
//    public WebElement clickOnSortBy;

    public void clickOnSortBy(){

        Select select = new Select(Driver.getDriver().findElement(By.id("cars-sort-dropdown")));
        select.selectByValue("TOTAL_PRICE_LOW_TO_HIGH");

    }

    @FindBy(xpath = "//option[@value='TOTAL_PRICE_LOW_TO_HIGH']")
    public WebElement clickOnTotalPrice;

    @FindBy(id = "AUTO_TRANSMISSION")
    public WebElement clickOnAutomaticTransmission;

    @FindBy(id = "UNLIMITED_MILEAGE")
    public WebElement clickOnUnlimitedMileage;

    @FindBy(id = "diff-loc")
    public WebElement clickOnAddDiffLocation;

    @FindBy(id = "carsdropLoc-input")
    public WebElement clickOnDropOffAndEnter;

    public void EnterDropOffLocation(){

        Driver.getDriver().findElement(By.id("carsdropLoc")).sendKeys("Hou");
    }

    @FindBy(xpath = "//ul[@class='uitk-typeahead-results no-bullet']//li[1]")
    public WebElement clickOnHouston;

//    public void clickOnHouston(){


//    }




}
