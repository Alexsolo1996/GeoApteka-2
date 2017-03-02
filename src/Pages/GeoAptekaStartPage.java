package Pages;

import SuppMethod.SuppMethod;
import Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class GeoAptekaStartPage extends BaseTest
{
    WebDriver driver;
    String xpathForSelectOption = ".//*[@id='order_field']";
    String xpathForSelectDirection = ".//*[@id='order_way']";
    String countAptek = "//div[@class = \"summary\"]";
    String xpathShowWorkHours = "//div[@class = \"pharmacy_title_working has-list\"]";
    String xpathForTabApteka = "//a[@href = \"#table\"]";
    String xpathForList = "//div[@class = \"items\"]";
    String xpathForRezhymRaboty = "//div[@class = \"pharmacy_title_working has-list\"]";
    String xpathForAdressApteka = "//div[@class = \"pharmacy_title_adress\"]";
    String xpathForCountTovara = "//div[@class = \"drug_quant\"]";
    String xpathForPriceTovara = "//div[@class = \"drug_prive\"]";
    String xpathForDistance = "//div[@class = \"dist onfoot\"]";

    public GeoAptekaStartPage()
    {
        this.driver = BaseTest.driver;
    }

    public void selectFromTheListForTimeDesc(){

        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForPriceDesc(){
        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForOstatokDesc(){
        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }
    public void selectFromTheListForOstatokAsc(){
        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }
    public void selectFromTheListForPriceAsc(){
        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }
    public void selectFromTheListForTimeAsc(){
        SuppMethod method = new SuppMethod(driver);
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }
    public void clickOnAptekaTab(){
        SuppMethod method = new SuppMethod(driver);
        method.click(xpathForTabApteka);
    }
    public void clickOnWorkingHours(){
        SuppMethod method = new SuppMethod(driver);
        method.click(xpathShowWorkHours);
    }
    public String getCountOfApteks(){
        SuppMethod method = new SuppMethod(driver);
        return method.initObject(countAptek).getText();
    }
    public void presentOfListWithApteka(){
        SuppMethod method = new SuppMethod(driver);
        method.searchElem(xpathForList);
    }
    public void presentOfWorkingHours(){
        SuppMethod method = new SuppMethod(driver);
        method.searchElemts(xpathForRezhymRaboty);
    }
    public void presentOfAdressApteka(){
        SuppMethod method = new SuppMethod(driver);
        method.searchElemts(xpathForAdressApteka);
    }
    public void presentOfPriceAndCountTovara(){
        SuppMethod method = new SuppMethod(driver);
        method.searchElemts(xpathForCountTovara);
        method.searchElemts(xpathForPriceTovara);
    }
    public void presentOfDistance(){
        SuppMethod method = new SuppMethod(driver);
        method.searchElemts(xpathForDistance);
    }
    public String returnTextFromSelect(){
        SuppMethod method = new SuppMethod(driver);
        String option = method.initObject(xpathForSelectOption).getAttribute("value");
        String direction = method.initObject(xpathForSelectDirection).getAttribute("value");
        String s = option +" "+ direction;
        return s;
    }
}
