package Tests;

import Pages.GeoAptekaStartPage;
import SuppMethod.SuppMethod;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 2/23/17.
 */
/*@RunWith(Suite.class)
@Suite.SuiteClasses({
        SortTestForStartPage.class,
        ShowListOfAptekas.class
})*/
public class BaseTest{

    public static WebDriver driver;
    public  String url = "https://morrion.nabu.soft.cn.ua";
    String searchBoxXpath = "//div[@id = \"s2id_search_select\"]";
    String searchInputBoxXpath = ".//*[@id='select2-drop']/div/input";
    /*@Parameterized.Parameters
        public static Collection<Object[]> data(){
            Object [][]data = new Object[][]{{"https://morrion.nabu.soft.cn.ua"},{"https://morrion.ru.nabu.soft.cn.ua"}};
            return Arrays.asList(data);
     }*/
    @Before
    public  void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get(url);
        SuppMethod sup = new SuppMethod(driver);
        sup.click(searchBoxXpath);
        sup.sendDate(searchInputBoxXpath, "Аспирин");
        Thread.sleep(1000);
        sup.sendDate(searchInputBoxXpath, "'\ue007'");
    }
    @After
    public  void tearDown() throws Exception {
        driver.quit();
    }
}