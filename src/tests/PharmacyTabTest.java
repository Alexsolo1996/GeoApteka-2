package tests;

import pages.AptekaTabPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class PharmacyTabTest extends BaseConfigTest {

    @Test
    @TestCaseId("APT-01")
    public void checkPresenceOfElements() throws InterruptedException, IOException {
        AptekaTabPage page = new AptekaTabPage();
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