package pages;

import supp_method.SuppMethod;
import tests.BaseConfigTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.allure.annotations.Attachment;


public class GeoAptekaStartPage extends SuppMethod
{
    WebDriver driver;
    String xpathForSelectOption = ".//*[@id='order_field']";
    String xpathForSelectDirection = ".//*[@id='order_way']";
    String xpathShowWorkHours = "//div[@class = \"pharmacy_title_working has-list\"]";
    String xpathForTabApteka = "//a[@href = \"#table\"]";
    String xpathForList = "//div[@class = \"items\"]";
    String xpathForRezhymRaboty = "//div[@class = \"pharmacy_title_working has-list\"]";
    String xpathForAdressApteka = "//div[@class = \"pharmacy_title_adress\"]";
    String xpathForCountTovara = "//div[@class = \"drug_quant\"]";
    String xpathForPriceTovara = "//div[@class = \"drug_price\"]";
    String xpathForDistance = "//div[contains(@id,'t_shop')]//div[@class='dist onfoot']";
    String countFoundItems = "//div[@class = \"summary\"]";
    String xpathForFindApteka = "//div[@class = \"pharmacy_detale\"]";
    public String searchBoxXpath = "//div[@id = \"s2id_search_select\"]";
    public String searchInputBoxXpath = ".//*[@id='select2-drop']/div/input";

    public GeoAptekaStartPage()
    {
        this.driver = BaseConfigTest.driver;
    }

    public void selectFromTheListForTimeDesc(){

        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForPriceDesc(){
        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForOstatokDesc(){
        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForOstatokAsc(){
        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void selectFromTheListForPriceAsc(){
        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void selectFromTheListForTimeAsc(){
        SuppMethod method = new SuppMethod();
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void clickOnAptekaTab(){
        SuppMethod method = new SuppMethod();
        method.click(xpathForTabApteka);
    }

    public void clickOnWorkingHours(){
        SuppMethod method = new SuppMethod();
        method.click(xpathShowWorkHours);
    }
    public void presentOfListWithApteka(){
        SuppMethod method = new SuppMethod();
        method.searchElem(xpathForList);
    }

    public String getArrayFromCountOfAptekas(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForFindApteka);
    }

    public String getCountElemWithWorkingHours(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForRezhymRaboty);
    }

    public String getCountElemWithAdressApteka(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForAdressApteka);
    }

    public String getCountElemWithCountTovara(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForCountTovara);
    }

    public String getCountElemWithPrice(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForPriceTovara);
    }

    public String getCountElemWithDistance(){
        SuppMethod method = new SuppMethod();
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForDistance);
    }

    public String returnTextFromSelect(){
        SuppMethod method = new SuppMethod();
        String option = method.initObject(xpathForSelectOption).getAttribute("value");
        String direction = method.initObject(xpathForSelectDirection).getAttribute("value");
        String s = option +" "+ direction;
        return s;
    }

    public String getCountOfFoundItems(){
        SuppMethod method = new SuppMethod();
        return method.searchElemThatShowsHowMuchAptekasFoundForExpectedResult(countFoundItems);
    }

    public void compareResultSortBySiteAndManuallyAsc(){
        SuppMethod method = new SuppMethod();
        method.compareResultOfSort(method.sortArrayAscManually(xpathForDistance), method.arrayWithElementSortBySite(xpathForDistance));
    }
    public void compateResultSortBySiteAndManuallyDesc(){
        SuppMethod method = new SuppMethod();
        method.compareResultOfSort(method.sortArrayDescManyally(xpathForDistance), method.arrayWithElementSortBySite(xpathForDistance));
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] attachScreenshotAs(String imageName) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}