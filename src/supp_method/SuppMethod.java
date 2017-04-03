package supp_method;

import tests.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 2/23/17.
 */
public class SuppMethod extends BaseTest
{
    String res;
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

    //Получение общего количества элементов с переданным локатором
    public String searchAllElementsThatPresenceOnTabForActualResult(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        String count = String.valueOf(list.size());
        userLogger.info("actual "+count);
        return count;
    }

    //Данный метод дублирует searchAllElementsThatPresenceOnTabForActualResult, но нужен для поиска элементов
    //с параметром дистанция, поскольку на странице есть дополнительные 5 элементов с таким локатором
    public String searchAllElementsThatPresenceOnTabForDistance(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        int c = list.size() - 5;
        String count = String.valueOf(c);
        userLogger.info("actual "+count);
        return count;
    }

    public String searchElemThatShowsHowMuchAptekasFoundForExpectedResult(String countFoundItems) {
        String str = driver.findElement(By.xpath(countFoundItems)).getText();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int start = 0;
        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            res = String.valueOf(result);
            start = matcher.end();
        }
        userLogger.info("expected "+res);
        return res;
    }
}