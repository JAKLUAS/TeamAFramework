package TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AfasUserStory extends BaseClass {



    @Test(groups = "smoke")
    public void bookRoundTripForTwo() throws InterruptedException {



        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")).click();
        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")).click();
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
        Thread.sleep(20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")));
        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();
    }

    @Test(groups = "smoke")
    public  void roundTripWithShopAndMiles() throws InterruptedException {



        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")).click();
        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")).click();
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
        Thread.sleep(20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")));
        driver.findElement(By.xpath("//label[@class='content icon-Checked booking-widget_checkbox-mobile searchOptionFilter']")).click();
        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();


    }
    @Test(groups = "smoke")
    public void RoundTripWithMyDatesAreflexible() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")).click();
        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")).click();
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
        Thread.sleep(20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")));
        driver.findElement(By.xpath("//label[@for='chkFlexDate']")).click();
        driver.findElement(By.xpath("//button[@id='btn-book-submit']")).click();



    }

    @Test()
    public void roundTripWithAdvancedButtonSelection() throws InterruptedException {



        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")).click();
        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")).click();
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
        Thread.sleep(20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")));

        driver.findElement(By.xpath("//a[@class='arrow-wht-expander icon-advsearchtriangle']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//label[@class='nearbyAirports booking-widget_checkbox-mobile icon-Checked advSearchoptionLabel']")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@class='btn btn-danger rounded-circle btn-right-arrow icon-submitarrow circle-outline float-right last-focusable-element']")));

    }

    @Test()
    public  void roundTripForTwoInTheMainCabin() throws InterruptedException {



        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='search_input']")));
        driver.findElement(By.xpath("//input[@id='search_input']" )).sendKeys("LGA");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
        driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[4]//td[7]")).click();
        driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[5]//td[4]")).click();
        driver.findElement(By.xpath("//button[@type='button'][2]")).click();
        driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
        Thread.sleep(20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")));
        driver.findElement(By.xpath("//a[@class='arrow-wht-expander icon-advsearchtriangle']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//label[@class='nearbyAirports booking-widget_checkbox-mobile icon-Checked advSearchoptionLabel']")).click();
        driver.findElement(By.xpath("//span[@id='faresFor-val']")).click();
        driver.findElement(By.xpath("//li[@id='ui-list-faresFor1']")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@class='btn btn-danger rounded-circle btn-right-arrow icon-submitarrow circle-outline float-right last-focusable-element']")));





    }











}
