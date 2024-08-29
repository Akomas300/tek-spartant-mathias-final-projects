package tekFinalProject.bdd.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tekFinalProject.bdd.base.BaseSetup;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {
    private  static final Logger LOGGER = LogManager.getLogger(SeleniumUtility.class);
    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void clickOnElement(By locator){
        waitForVisibility(locator).click();
    }
    public void sendText(By locator,String text){
        waitForVisibility(locator).clear();
        if (text!=null){
        waitForVisibility(locator).sendKeys(text);}
    }
    public String gettingText(By locator ){
        return waitForVisibility(locator).getText();
    }
    public boolean isElementEnable(By locator){
       return waitForVisibility(locator).isEnabled();
    }
    public boolean isDisplayed(By locator){
        return waitForVisibility(locator).isDisplayed();
    }
    public List<WebElement> getElements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public byte[] takeScreenshot(){
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }
    public String RandomEmail(){
       return "akomas"+(int)(Math.random()*10000)+"@gmail.com";
    }
    public String RandomUsername(){
        return "mahdi"+(int)(Math.random()*1000);
    }

}
