package Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
//@FindBy(xpath = "//button[@class='ttClose']")
//public WebElement AlertFronTheBeginning;
    @FindBy(xpath = "//a[@class='sign-up btn btn-link']")
    public WebElement clickOnSignUp;

}
