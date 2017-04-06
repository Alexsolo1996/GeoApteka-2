package tests;

import pages.GeoAptekaStartPage;
import org.testng.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class AptekaTabTests extends BaseTest {

    @Step("Сортировка времени в пути по убыванию")
    @Test
    public void sortForTimeDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForTimeDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"time desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки времени в пути по убыванию");
        userLogger.info("Сортировка аптек по времени в пути по убыванию прошла успешно");
    }

    @Step("Сортировка остатка по убыванию")
    @Test
    public void sortForOstatokDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForOstatokDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"quant desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(), "Количество аптек не совпадает после сортировки остатка по убыванию");
        userLogger.info("Сортировка аптек по остатку по убыванию прошла успешно");

    }

    @Step("Сортировка цены по убыванию")
    @Test
    public void sortForPriceDescending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForPriceDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"price desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки цены по убыванию");
        userLogger.info("Сортировка аптек по цене по убыванию прошла успешно");
    }

    @Step("Сортировка цены по возростанию")
    @Test
    public void sortForPriceAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForPriceAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"price asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки цены по возрастанию");
        userLogger.info("Сортировка аптек по цене по возростанию прошла успешно");
    }

    @Step("Сортировка остатка по возростанию")
    @Test
    public void sortForOstatokAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForOstatokAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"quant asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки остатка по возрастанию");
        userLogger.info("Сортировка аптек по остатку по возрастанию прошла успешно");
    }

    @Step("Сортировка времени по возростанию")
    @Test
    public void sortForTimeAscending() throws InterruptedException {
        GeoAptekaStartPage list = new GeoAptekaStartPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForTimeAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"time asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки времени в пути по возрастанию");
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