package tests;

import pages.AptekaTabPage;
import org.testng.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class AptekaTabTests extends BaseConfigTest {

    @Step("Сортировка времени в пути по убыванию")
    @TestCaseId("APTSORT-01")
    @Test
    public void sortForTimeDescending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForTimeDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"time desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки времени в пути по убыванию");
        list.compateResultSortBySiteAndManuallyDesc();
        userLogger.info("Сортировка аптек по времени в пути по убыванию прошла успешно");
    }

    @Step("Сортировка остатка по убыванию")
    @TestCaseId("APTSORT-05")
    @Test
    public void sortForOstatokDescending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForOstatokDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"quant desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(), "Количество аптек не совпадает после сортировки остатка по убыванию");
        userLogger.info("Сортировка аптек по остатку по убыванию прошла успешно");

    }

    @Step("Сортировка цены по убыванию")
    @TestCaseId("APTSORT-03")
    @Test
    public void sortForPriceDescending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForPriceDesc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"price desc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки цены по убыванию");
        userLogger.info("Сортировка аптек по цене по убыванию прошла успешно");
    }

    @Step("Сортировка цены по возростанию")
    @TestCaseId("APTSORT-04")
    @Test
    public void sortForPriceAscending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForPriceAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"price asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки цены по возрастанию");
        userLogger.info("Сортировка аптек по цене по возростанию прошла успешно");
    }

    @Step("Сортировка остатка по возростанию")
    @TestCaseId("APTSORT-06")
    @Test
    public void sortForOstatokAscending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForOstatokAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"quant asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки остатка по возрастанию");
        userLogger.info("Сортировка аптек по остатку по возрастанию прошла успешно");
    }

    @Step("Сортировка времени по возростанию")
    @TestCaseId("APTSORT-02")
    @Test
    public void sortForTimeAscending() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.selectFromTheListForTimeAsc();
        Thread.sleep(500);
        Assert.assertEquals(list.returnTextFromSelect(),"time asc");
        Assert.assertEquals(list.getArrayFromCountOfAptekas(),list.getCountOfFoundItems(),"Количество аптек не совпадает после сортировки времени в пути по возрастанию");
        list.compareResultSortBySiteAndManuallyAsc();
        userLogger.info("Сортировка аптек по времени в пути по возрастанию прошла успешно");
    }

    @Step("Отображение рабочых часов")
    @TestCaseId("APT-06")
    @Test
    public void showWorkHours() throws InterruptedException {
        AptekaTabPage list = new AptekaTabPage();
        list.clickOnAptekaTab();
        list.clickOnWorkingHours();
        Thread.sleep(1000);
    }
}