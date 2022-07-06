package TeamFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseClass {



    public WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void methodSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)

    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }


    @AfterMethod(alwaysRun = true)



    public void afterMessage() {
        driver.quit();
    }
}



