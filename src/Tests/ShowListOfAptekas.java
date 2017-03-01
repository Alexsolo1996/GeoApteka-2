package Tests;

import Pages.GeoAptekaStartPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class ShowListOfAptekas extends BaseTest{

    @Test
    public void receiveListOfAptek() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        Thread.sleep(1000);
    }
}

