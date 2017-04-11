package pages;

import supp_method.SuppMethod;
import tests.BaseConfigTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.allure.annotations.Attachment;


public class AptekaTabPage extends SuppMethod
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
    String xpathForAddInBasket = "//div[@class = \"btn-container store-btn-container\"]/a[@id = \"yw0\"]";
    String xpathForBasketTab = "//a[@href = \"#receipt\"]";
    SuppMethod method = new SuppMethod();

    public AptekaTabPage()
    {
        this.driver = BaseConfigTest.driver;
    }

    public void selectFromTheListForTimeDesc(){

        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForPriceDesc(){
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForOstatokDesc(){
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("убыванию");
    }

    public void selectFromTheListForOstatokAsc(){
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void selectFromTheListForPriceAsc(){
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void selectFromTheListForTimeAsc(){
        Select sel = new Select(method.initObject(xpathForSelectOption));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(method.initObject(xpathForSelectDirection));
        sel1.selectByVisibleText("возрастанию");
    }

    public void checkPresenceOfWorkingHours(){
        method.checkArrayForNullSize(xpathForRezhymRaboty);
    }

    public void clickOnAptekaTab(){
        method.click(xpathForTabApteka);
    }

    public void addToBasket(){
        method.click(xpathForAddInBasket);
    }

    public void clickOnBasketTab(){
        method.click(xpathForBasketTab);
    }

    public void clickOnWorkingHours(){
        method.click(xpathShowWorkHours);
    }
    public void presentOfListWithApteka(){
        method.searchElem(xpathForList);
    }

    public String getArrayFromCountOfAptekas(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForFindApteka);
    }

    public String getCountElemWithWorkingHours(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForRezhymRaboty);
    }

    public String getCountElemWithAdressApteka(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForAdressApteka);
    }

    public String getCountElemWithCountTovara(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForCountTovara);
    }

    public String getCountElemWithPrice(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForPriceTovara);
    }

    public String getCountElemWithDistance(){
        return method.searchAllElementsThatPresenceOnTabForActualResult(xpathForDistance);
    }

    public String returnTextFromSelect(){
        String option = method.initObject(xpathForSelectOption).getAttribute("value");
        String direction = method.initObject(xpathForSelectDirection).getAttribute("value");
        String s = option +" "+ direction;
        return s;
    }

    public String getCountOfFoundItems(){
        return method.searchElemThatShowsHowMuchAptekasFoundForExpectedResult(countFoundItems);
    }

    public void compareResultSortBySiteAndManuallyAsc(){
        method.compareResultOfSort(method.sortArrayAscManually(xpathForDistance), method.arrayWithElementSortBySite(xpathForDistance));
    }
    public void compateResultSortBySiteAndManuallyDesc(){
        method.compareResultOfSort(method.sortArrayDescManyally(xpathForDistance), method.arrayWithElementSortBySite(xpathForDistance));
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] attachScreenshotAs(String imageName) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}