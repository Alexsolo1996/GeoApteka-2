package supp_method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static tests.BaseConfigTest.driver;

/**
 * Created by user on 2/23/17.
 */
public class SuppMethod
{
    String res;
    public static final Logger userLogger = LogManager.getLogger(Logger.class.getName());
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

    public ArrayList<String> arrayWithElementSortBySite(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        ArrayList <String> arr = new ArrayList<>();
        for(WebElement el : list){
            arr.add(el.getText());
        }
        return arr;
    }

    public ArrayList<String> sortArrayAscManually(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        ArrayList <String> array = new ArrayList<>();
        for(WebElement el : list){
            array.add(el.getText());
        }
        Collections.sort(array, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return array;
    }
    public ArrayList<String> sortArrayDescManyally(String xpath){
        ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath(xpath));
        ArrayList <String> array = new ArrayList<>();
        for(WebElement el : list){
            array.add(el.getText());
        }
        Collections.sort(array, new Comparator<String>() {
            public int compare(String o2, String o1) {
                return o1.compareTo(o2);
            }
        });
        return array;
    }

    public void compareResultOfSort(ArrayList<String> arr1, ArrayList <String> arr2){
        for(int i = 0; i < arr1.size() && arr1.size() == arr2.size(); i++){
            if(!arr1.get(i).equals(arr2.get(i))){
                Assert.fail("Результаты сортировок - ручная и сайта - не совпадают");
            }
            else continue;
        }
    }
}