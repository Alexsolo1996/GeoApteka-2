package pages.Basket;

import supp_method.SuppMethod;

/**
 * Created by user on 4/11/17.
 */
public class BasketModalWindow extends SuppMethod{

    String xpathForPlaceOrder = ".//*[@id='checkout_button']";
    String xpathForContinueSearch = ".//*[@id='cont_srch_button']";
    String xpathForDeleteFromBasket = "//i[@class = \"icon-big-trash\"]";
    String xpathForChangeCountOfaDrug = ".//*[@id='qty_input_4']";
    String xpathForCloseModalWindow = ".//*[@id='booking_modal']/div[1]/div[1]/a";
    SuppMethod supp = new SuppMethod();

    public void placeAnOrder(){
        supp.click(xpathForPlaceOrder);
    }

    public void continueSearch(){
        supp.click(xpathForContinueSearch);
    }

    public void deleteFromBasket(){
        supp.click(xpathForDeleteFromBasket);
    }

    public void setCountOfaDrug(){
        supp.sendDate(xpathForChangeCountOfaDrug,"5");
    }

    public void setCloseModalWind(){
        supp.click(xpathForCloseModalWindow);
    }
}