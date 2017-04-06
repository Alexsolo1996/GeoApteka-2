package tests;

import pages.GeoAptekaStartPage;
import org.testng.annotations.Test;
import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class PresenceOfItemsForThePharmacyTest extends BaseTest{

    @Test
    public void checkPresenceOfElements() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        page.presentOfListWithApteka();
        assertEquals(page.getCountElemWithWorkingHours(), page.getCountOfFoundItems(),"Количество аттрибута \"Часы работы\" не соответсвует с отображемым значением");
        assertEquals(page.getCountElemWithAdressApteka(), page.getCountOfFoundItems(),"Количество аттрибута \"Адрес аптеки\" не соответсвует с отображемым значением");
        assertEquals(page.getCountElemWithCountTovara(), page.getCountOfFoundItems(),"Количество аттрибута \"Количество товара\" не соответсвует с отображемым значением");
        assertEquals(page.getCountElemWithPrice(), page.getCountOfFoundItems(),"Количество аттрибута \"Цена\" не соответсвует с отображемым значением");
        assertEquals(page.getCountElemWithDistance(), page.getCountOfFoundItems(),"Количество аттрибута \"Дистанция к аптеке\" не соответсвует с отображемым значением");
        userLogger.info("Количество найденных аптек(с параметрами цена/дистанция/количество,адрес,время работы) совпадает с отображаемым числом");
    }
}