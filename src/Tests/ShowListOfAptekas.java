package Tests;

import Pages.GeoAptekaStartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;

public class ShowListOfAptekas extends BaseTest{

    @Test
    public void receiveListOfAptek() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        page.presentOfListWithApteka();
        assertAll("количество",() -> assertEquals(page.countElemWithWorkingHours(),page.countOfFoundItems()),
                () -> assertEquals(page.countElemWithAdressApteka(),page.countOfFoundItems()),
                () -> assertEquals(page.countElemWithCountTovara(),page.countOfFoundItems()),
                () -> assertEquals(page.countElemWithPrice(),page.countOfFoundItems()),
                () -> assertEquals(page.countElemWithDistance(),page.countOfFoundItems())

        );
        userLogger.info("Количество найденных аптек(с параметрами цена/дистанция/количество,адрес,время работы) совпадает с отображаемым числом");
    }
}

