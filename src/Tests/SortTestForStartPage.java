
package Tests;

import Pages.GeoAptekaStartPage;
import org.junit.Assert;
import org.junit.Test;

public class SortTestForStartPage extends BaseTest {

    @Test
    public void sortForTimeDescending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));
    }

    @Test
    public void sortForOstatokDescending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));

    }

    @Test
    public void sortForPriceDescending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));
    }

    @Test
    public void sortForPriceAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));
    }

    @Test
    public void sortForOstatokAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));
    }

    @Test
    public void sortForTimeAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertTrue("Количество аптек не совпадает после сортировки", text.equals(text1));
    }

    @Test
    public void showWorkHours() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.clickOnWorkingHours();
        Thread.sleep(1000);
    }
}
