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
    public void searchElemts(String xpath){
        driver.findElements(By.xpath(xpath));
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
    /* <suite name="Suite1">
        <test name="exampletest1">
            <classes>
                <class name="Tests.ShowListOfAptekas" />
            </classes>
        </test>
        <test name="exampletest2">
            <classes>
                <class name="Tests.SortTestForStartPage" />
            </classes>
        </test>
    </suite>*/
}
