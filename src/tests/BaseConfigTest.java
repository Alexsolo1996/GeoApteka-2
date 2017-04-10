package tests;

import supp_method.SuppMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import pages.GeoAptekaStartPage;

public class BaseConfigTest extends SuppMethod{

    public static WebDriver driver;
    String url = "https://morrion.nabu.soft.cn.ua";

    @BeforeClass()
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get(url);
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        click(page.searchBoxXpath);
        sendDate(page.searchInputBoxXpath, "Аспирин");
        Thread.sleep(1000);
        sendDate(page.searchInputBoxXpath, "'\ue007'");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}