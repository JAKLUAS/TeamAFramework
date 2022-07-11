package Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='sign-up btn btn-link']")
    public WebElement clickOnSignUp;

    @FindBy(xpath = "//input[@name='textfield'][1]")
    public WebElement selecctOnFisrtNameBox;

    @FindBy(xpath = "//input[@aria-label='Last Name']")
    public WebElement SelectOnLastNameBox;

    @FindBy(xpath = "//div[@class='idp-dropdown__selected'][1]")
    public  WebElement SelectOnMonth;


    @FindBy(xpath = "//li[@class='idp-dropdown__list-item ng-star-inserted'][4]")

    public WebElement April;

   @FindBy(xpath = "//span[@aria-label='DD']")
   public WebElement  SelectDayBox;

   @FindBy(xpath = "//li[@id='dateoption-2']")
   public  WebElement Select2;

   @FindBy(xpath = "//span[@aria-label='YYYY']")
    public  WebElement selectOnYearBox;

   @FindBy(xpath = "//li[@data-value='1992']")
    public  WebElement clickon1992;

   @FindBy(xpath = "//span[@aria-label='Select Gender']")
    public WebElement clickOnGenderBox;

   @FindBy(xpath = "//li[@data-value='M']")
    public WebElement clickOnMale;

   @FindBy(xpath = "//button[@id='basic-info-next']")
    public WebElement clickOnNextButton;


   @FindBy(xpath = "//span[@aria-label='United States']")

    public WebElement clickOnCountry;

   @FindBy(xpath = "//li[@data-value='US']")
    public  WebElement selectUnitedStates;

   @FindBy(xpath = "//input[@aria-label='Address Line 1']")
    public WebElement clickOnAddressBox;

   @FindBy(xpath = "//input[@aria-label='City']")
    public WebElement clickOnCityBox;

   @FindBy(xpath = "//span[@aria-label='Select One']")
    public WebElement selectStateBox;

   @FindBy(xpath = "//li[@data-label='California']")
    public WebElement clickOnCA;

   @FindBy(xpath = "//input[@aria-label='Postal Code']")
    public WebElement clickOnPostalCodeBox;

   @FindBy(xpath = "//span[@aria-label='United States (1)']")
    public WebElement clickOnRegionCode;

   @FindBy(xpath = "//li[@data-label='United States (1)']")
    public WebElement chooseUnitedStates;

   @FindBy(xpath = "//input[@aria-label='Phone Number']")
    public WebElement clickOnPhoneBox;

   @FindBy(xpath = "//input[@aria-label='Email Address']")
   public WebElement clickOnEmailAddressBox;

   @FindBy(xpath = "//input[@aria-label='Confirm Email Address']")
    public WebElement ClickOnConfirmEmail;

   @FindBy(xpath = "//button[@id='contact-info-next']")
   public WebElement ClickOnNext;

   @FindBy(xpath = "//input[@aria-label='Enter a Username']")
    public WebElement clickOnUsernameBox;

   @FindBy(xpath = "//input[@aria-label='Enter  a Password']")
    public WebElement clickOnPassword;

   @FindBy(xpath = "//input[@aria-label='Confirm Password']")
    public WebElement clickOnConfirmPass;

   @FindBy(xpath = "//span[@aria-label='Select Question'][1]")
    public WebElement clickOn1Question;

   @FindBy(xpath = "//li[@data-label='What is the name of your first pet?'][1]")
    public WebElement clickOnPetName;

   @FindBy(xpath = "//input[@aria-label='Answer 1']")
    public WebElement SelectOn1Answer;

   @FindBy(xpath = "//span[@aria-label='Select Question']")
    public WebElement clickOn2Question;

   @FindBy(xpath = "//li[@id='securityQs2option-2']")
    public WebElement select2ndQuestion;

   @FindBy(xpath = "//input[@aria-label='Answer 2']")
    public WebElement ClickOn2ndAnswer;

   @FindBy(xpath = "//label[@class='idp-checkbox idp-checkbox__label']")
    public WebElement ClickOnMiles;

   @FindBy(xpath = "//button[@id='login-info-submit']")
    public WebElement SubmitButton;

























}
