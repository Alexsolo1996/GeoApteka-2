package Tests;

import Pages.GeoAptekaStartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class ShowListOfAptekas extends BaseTest{

    @Test
    public void receiveListOfAptek() throws InterruptedException, IOException {
        GeoAptekaStartPage page = new GeoAptekaStartPage();
        page.clickOnAptekaTab();
        page.presentOfListWithApteka();
        Assert.assertEquals(page.countElemWithWorkingHours(),page.countOfFoundItems());
        Assert.assertEquals(page.countElemWithAdressApteka(),page.countOfFoundItems());
        Assert.assertEquals(page.countElemWithCountTovara(),page.countOfFoundItems());
        Assert.assertEquals(page.countElemWithPrice(),page.countOfFoundItems());
        Assert.assertEquals(page.countElemWithDistance(),page.countOfFoundItems());
    }
}

