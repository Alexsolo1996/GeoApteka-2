package pages;

import supp_method.SuppMethod;

/**
 * Created by user on 4/6/17.
 */
public class MainPage extends SuppMethod{
    public String searchBoxXpath = "//div[@id = \"s2id_search_select\"]";
    public String searchInputBoxXpath = ".//*[@id='select2-drop']/div/input";
    SuppMethod method = new SuppMethod();

    public void setTheCursorInTheInputField(){
        method.click(searchBoxXpath);
    }

    public void sendDataInSearchField(String mess){
        method.sendDate(searchInputBoxXpath,"Аспирин");
    }

    public void pressEnterInField(){
        method.pressEnterInTextField(searchInputBoxXpath,"'\ue007'");
    }
}
