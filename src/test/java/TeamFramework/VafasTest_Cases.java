package TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class VafasTest_Cases extends BaseClass {

       @Test (groups = "smoke")
       public void selectAirportsFromNYCtoBUR()  throws InterruptedException {
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
       }

       @Test
       public void selectRoundTripDates() throws InterruptedException {
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")).click();
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
              driver.findElement(By.xpath("//span[@id='selectTripType-val']")).click();
              driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[3]//td[5]")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[6]//td[7]")).click();
              driver.findElement(By.xpath("//button[@value='done']")).click();
       }

       @Test
       public void selectTwoPassengers() throws InterruptedException {
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")).click();
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
              driver.findElement(By.xpath("//span[@id='selectTripType-val']")).click();
              driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[3]//td[5]")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[6]//td[7]")).click();
              driver.findElement(By.xpath("//button[@value='done']")).click();
              driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
              driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")).click();
       }

       @Test
       public void shopWithMiles() throws InterruptedException {
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")).click();
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
              driver.findElement(By.xpath("//span[@id='selectTripType-val']")).click();
              driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[3]//td[5]")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[6]//td[7]")).click();
              driver.findElement(By.xpath("//button[@value='done']")).click();
             driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
              driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")).click();
              driver.findElement(By.xpath("//label[@for='shopWithMiles']")).click();
       }

       @Test
       public void shopWithAdvancedSearch() throws InterruptedException {
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='fromAirportCode']")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='search_input']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("NYC");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][2]")).click();
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='arrivalCity']")));
              driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("Bur");
              driver.findElement(By.xpath("//li[@class='airport-list ng-star-inserted'][1]")).click();
              driver.findElement(By.xpath("//span[@id='selectTripType-val']")).click();
              driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[3]//td[5]")).click();
              driver.findElement(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[6]//td[7]")).click();
              driver.findElement(By.xpath("//button[@value='done']")).click();
              driver.findElement(By.xpath("//span[@id='passengers-val']")).click();
              driver.findElement(By.xpath("//li[@id='ui-list-passengers1']")).click();
              driver.findElement(By.xpath("//label[@for='shopWithMiles']")).click();
              driver.findElement(By.xpath("//a[@id='adv-search']")).click();
              driver.findElement(By.xpath("//label[@for='nearbyAirports']")).click();
              driver.findElement(By.xpath("//span[@id='faresFor-val']")).click();
              driver.findElement(By.xpath("//li[@id='ui-list-faresFor3']")).click();
              driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();

       }
}
