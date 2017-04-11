package pages.Basket;

import supp_method.SuppMethod;

/**
 * Created by user on 4/11/17.
 */
public class BasketTabPage extends SuppMethod{

    String xpathForCheckout = ".//*[@id='checkout_button']";
    String cleanAllDrugFromBasket = ".//*[@id='clear_button']";
    String deleteFromBasket = "//a[@class = \"delete\"]";
    String changeCountOfDrug = "//input[@class = \"receipt-input\"]";
    SuppMethod method = new SuppMethod();

    public void checkout(){
        method.click(xpathForCheckout);
    }

    public void cleanAllDrug(){
        method.click(cleanAllDrugFromBasket);
    }

    public void deleteAllDrugFromBasket(){
        method.click(deleteFromBasket);
    }

    public void changeCount(){
        method.sendDate(changeCountOfDrug,"5");
    }
}
