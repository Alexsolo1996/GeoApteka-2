package Tests;

import SuppMethod.SuppMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BaseTest{

    public static WebDriver driver;
    String searchBoxXpath = "//div[@id = \"s2id_search_select\"]";
    String searchInputBoxXpath = ".//*[@id='select2-drop']/div/input";
    String url = "https://morrion.nabu.soft.cn.ua";
    static final Logger userLogger = LogManager.getLogger(Logger.class.getName());


    @BeforeClass()
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

    @AfterClass
    public  void tearDown() throws Exception {
        driver.quit();
    }
}