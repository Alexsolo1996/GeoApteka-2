package Tests;

import Pages.GeoAptekaStartPage;
import org.testng.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class SortTestForStartPage extends BaseTest {

    @Step("Сортировка времени в пути по убыванию")
    @Test
    public void sortForTimeDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeDesc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"time desc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по времени в пути по убыванию прошла успешно");
    }

    @Step("Сортировка остатка по убыванию")
    @Test
    public void sortForOstatokDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokDesc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"quant desc");
        Assert.assertTrue(text.equals(text1), "Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по остатку по убыванию прошла успешно");

    }

    @Step("Сортировка цены по убыванию")
    @Test
    public void sortForPriceDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceDesc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"price desc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по цене по убыванию прошла успешно");
    }

    @Step("Сортировка цены по возростанию")
    @Test
    public void sortForPriceAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForPriceAsc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"price asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по цене по возростанию прошла успешно");
    }

    @Step("Сортировка остатка по возростанию")
    @Test
    public void sortForOstatokAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForOstatokAsc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"quant asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по остатку по возрастанию прошла успешно");
    }

    @Step("Сортировка времени по возростанию")
    @Test
    public void sortForTimeAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        String text = list.getCountOfApteks();
        list.selectFromTheListForTimeAsc();
        Thread.sleep(500);
        String text1 = list.getCountOfApteks();
        Assert.assertEquals(list.returnTextFromSelect(),"time asc");
        Assert.assertTrue(text.equals(text1),"Количество аптек не совпадает после сортировки");
        userLogger.info("Сортировка аптек по времени в пути по возрастанию прошла успешно");
    }

    @Step("Отображение рабочых часов")
    @Test
    public void showWorkHours() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.clickOnWorkingHours();
        Thread.sleep(1000);
    }
}