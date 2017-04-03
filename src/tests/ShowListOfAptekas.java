package tests;

import pages.GeoAptekaStartPage;
import org.testng.annotations.Test;
import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class ShowListOfAptekas extends BaseTest{

    @Test
    public void receiveListOfAptek() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        page.presentOfListWithApteka();
        assertEquals(page.countElemWithWorkingHours(),page.countOfFoundItems());
        assertEquals(page.countElemWithAdressApteka(),page.countOfFoundItems());
        assertEquals(page.countElemWithCountTovara(),page.countOfFoundItems());
        assertEquals(page.countElemWithPrice(),page.countOfFoundItems());
        assertEquals(page.countElemWithDistance(),page.countOfFoundItems());
        userLogger.info("Количество найденных аптек(с параметрами цена/дистанция/количество,адрес,время работы) совпадает с отображаемым числом");
    }
}

