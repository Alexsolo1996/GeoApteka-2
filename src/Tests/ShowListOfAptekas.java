package Tests;

import Pages.GeoAptekaStartPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class ShowListOfAptekas extends BaseTest{

    @Test
    public void receiveListOfAptek() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        page.presentOfListWithApteka();
        page.presentOfWorkingHours();
        page.presentOfAdressApteka();
        page.presentOfPriceAndCountTovara();
        page.presentOfDistance();
    }
}

