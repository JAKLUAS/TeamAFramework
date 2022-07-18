package com.Delta.Sprint3TeamA;

import com.Delta.Pages.AfaDeltaMobilePage;
import com.Delta.Pages.AfaHomePage;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AfaSprint3 extends BaseClass3{

  @Test(groups = "smoke")
  public void ClickOnFlyDeltaApp(){

    AfaHomePage afa = new AfaHomePage();

    driver.get(ConfigReader.getProperty("url1"));


    SeleniumUtils.scroll(500, 1800);
    logger.info("click on download Delta App");
    afa.clickOnDownloadDeltaApp.click();
    SeleniumUtils.waitFor(3);
    logger.info("click on Digital Drop Down ");
    afa.clickOnDeltaDigitalDropDown.click();
    logger.info("click on innovation delta");
    afa.clickOnInnovationDelta.click();
    SeleniumUtils.waitFor(3);
    SeleniumUtils.scroll(500, 1700);
    logger.info("click on Learn more button");
    afa.clickOnLearnMore.click();
    SeleniumUtils.scroll(500, 600);
    logger.info("click on Airport Security button");
    afa.clickOnAirportSecurity.click();
    SeleniumUtils.scroll(500, 1800);
    logger.info("click On Next Button");
    afa.clickOnNextButton.click();
  }
  @Test(groups = "smoke")
  public void clickOnAppStoreAndGooglePlay(){

    driver.get(ConfigReader.getProperty("url1"));
   AfaHomePage afa = new AfaHomePage();
    AfaDeltaMobilePage delta = new AfaDeltaMobilePage();

    SeleniumUtils.scroll(500, 1800);
    logger.info("click on download Delta App");
    afa.clickOnDownloadDeltaApp.click();
    SeleniumUtils.waitFor(3);
    logger.info("click on App store button");
   // delta.clickOnNoThanxPopUp.click();
    delta.clickOnAppStore.click();
    logger.info("click on Yes Continue to site pop up");
    delta.clickOnYesContinue.click();
    SeleniumUtils.switchToWindow("https://www.delta.com/us/en/delta-digital/mobile");
    SeleniumUtils.waitFor(3);
    logger.info("click on Google play button");
    SeleniumUtils.jsClick(delta.clickOnGoogle);
    logger.info("click on Yes Continue to site pop up");
    delta.clickOnYesContinue.click();

  }


  @Test
    public void SearchFromNotFindingWhatYouNeed(){

      driver.get(ConfigReader.getProperty("url1"));
      AfaHomePage afa = new AfaHomePage();
      AfaDeltaMobilePage delta = new AfaDeltaMobilePage();
      SeleniumUtils.scroll(500, 1800);
      logger.info("click on download Delta App");
      afa.clickOnDownloadDeltaApp.click();
      SeleniumUtils.waitFor(3);
      SeleniumUtils.scroll(500, 2800);
      logger.info("click on fly Delta app 5.0 Aims to simplify travel");
      delta.ClickOnFlyDeltaApp.click();
      SeleniumUtils.scroll(500, 5000);
      logger.info("click on Accept  pop up");
      delta.clickOnPopUp.click();
      logger.info("click on search here section");
      delta.ClickSearchSection.click();
      logger.info("Type flights inside search section");
      delta.ClickSearchSection.sendKeys("Flights", Keys.ENTER);
      logger.info("mark Article checkbox");
      delta.clickOnArticleCheckbox.click();
      logger.info("click on first Article");
      delta.clickOnFirstArticle.click();
  }
}
