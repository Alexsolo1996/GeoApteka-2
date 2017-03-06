package SuppMethod;

import Tests.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

/**
 * Created by user on 2/23/17.
 */
public class SuppMethod extends BaseTest
{
    protected static WebDriverWait wait = new WebDriverWait(driver,5);

    public SuppMethod(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement initObject(String xpath){
        WebElement el = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
        return el;
    }

    public void click(String xpath){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath)))).click();
    }

    public void sendDate(String xpath,String mess){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath)))).sendKeys(mess);
    }
    public void searchElem(String xpath){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
    }
    public String searchElemts(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        String count = list.size()+" результатов.";
        return count;
    }
    public String searchElemts1(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        int c = list.size() - 5;
        String count = c + " результатов.";
        return count;
    }
    public String searchElem1(String countFoundItems) {
        String str = driver.findElement(By.xpath(countFoundItems)).getText();
        return str;
    }
}
