package supp_method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static tests.BaseTest.driver;

/**
 * Created by user on 2/23/17.
 */
public class SuppMethod
{
    String res;
    public static final Logger userLogger = LogManager.getLogger(Logger.class.getName());
    public String searchBoxXpath = "//div[@id = \"s2id_search_select\"]";
    public String searchInputBoxXpath = ".//*[@id='select2-drop']/div/input";
    public WebElement initObject(String xpath){
        WebElement el = driver.findElement(By.xpath(xpath));
        return el;
    }

    public void click(String xpath){
        try {
            driver.findElement(By.xpath(xpath)).click();
        }
        catch (Exception e){
            Assert.fail("Элемент не найден или недоступен");
        }

    }

    public void sendDate(String xpath,String mess){
        try {
            driver.findElement(By.xpath(xpath)).sendKeys(mess);
        }
        catch (Exception e){
            Assert.fail("Элемент не найден или недоступен");
        }

    }
    public void searchElem(String xpath){
        try {
            driver.findElement(By.xpath(xpath));
        }
        catch (NoSuchElementException e){
            Assert.fail("Элемент не найден");
        }
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