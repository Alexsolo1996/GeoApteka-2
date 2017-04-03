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
        assertEquals(page.getCountElemWithWorkingHours(),page.getCountOfFoundItems());
        assertEquals(page.getCountElemWithAdressApteka(),page.getCountOfFoundItems());
        assertEquals(page.getCountElemWithCountTovara(),page.getCountOfFoundItems());
        assertEquals(page.getCountElemWithPrice(),page.getCountOfFoundItems());
        assertEquals(page.getCountElemWithDistance(),page.getCountOfFoundItems());
        userLogger.info("Количество найденных аптек(с параметрами цена/дистанция/количество,адрес,время работы) совпадает с отображаемым числом");
    }
}

