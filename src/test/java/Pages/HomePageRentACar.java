package Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRentACar {

    public HomePageRentACar(){

        PageFactory.initElements(Driver.getDriver(),this);//to call all @FindBy elements, must be added to Page Package

    }

    @FindBy(xpath = "//a[@data-analytics-id = 'home-shop-3']")
    public WebElement clickOnRentACar;












}
