package Tests;

import Pages.GeoAptekaStartPage;
import org.testng.*;
import org.testng.annotations.Test;

public class SortTestForStartPage extends BaseTest {

    @Test
    public void sortForTimeDescending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"time desc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
    }

    @Test
    public void sortForOstatokDescending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"quant desc");
        Assert.assertTrue(text.equals(text1), "Количество аптек не совпадает после сортировки");

    }

    @Test
    public void sortForPriceDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceDesc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"price desc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
    }

    @Test
    public void sortForPriceAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"price asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
    }

    @Test
    public void sortForOstatokAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"quant asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
    }

    @Test
    public void sortForTimeAscending(){
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeAsc();
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"time asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
    }

    @Test
    public void showWorkHours() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.clickOnWorkingHours();
        Thread.sleep(1000);
    }
}