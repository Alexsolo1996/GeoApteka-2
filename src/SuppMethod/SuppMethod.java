package SuppMethod;

import Tests.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 2/23/17.
 */
public class SuppMethod extends BaseTest
{
    public SuppMethod(WebDriver driver) {
        this.driver = driver;
       // this.driver = driver;
    }

    public WebElement initObject(String xpath){
        WebElement el = driver.findElement(By.xpath(xpath));
        return el;
    }

    public void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void sendDate(String xpath,String mess){
        driver.findElement(By.xpath(xpath)).sendKeys(mess);
    }

    public WebDriver getDriver(WebDriver driver){
        return this.driver = driver;
    }

    /*@Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object [][]data = new Object[][]{{"https://morrion.nabu.soft.cn.ua"},{"https://morrion.ru.nabu.soft.cn.ua"}};
        return Arrays.asList(data);
    }
    public BaseTest(String url){
        this.url = url;
    }*/

    /*@RunWith(Suite.class)
    @Suite.SuiteClasses({
        SortTestForStartPage.class,
        ShowListOfAptekas.class
    })*/
}
