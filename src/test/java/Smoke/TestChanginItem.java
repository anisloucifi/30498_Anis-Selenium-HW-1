package Smoke;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.SearchResult;

public class TestChanginItem extends BasePage {

    @Test
    public void testChangingQty() {
        HomePage home = new HomePage();
        ItemPage itm = new ItemPage();
        SearchResult sr = new SearchResult();

        home.doSearch("Printed Dress");
        sr.clickonWantedtem();
        itm.clickonPlusButton();
        itm.clickonAddtoCart();
        itm.clickOnContinueShoppingButton();
        Assert.assertTrue(itm.checkIteminCart()>1,"quantity is increased ");


    }

    @Test
    public void testChangingColor(){
        HomePage home = new HomePage();
        ItemPage itm = new ItemPage();
        SearchResult sr = new SearchResult();
        String col="Pink";
        home.doSearch("Printed Dress");
        sr.clickonWantedtem();
        itm.changeColor();
        itm.clickonAddtoCart();
        itm.clickOnContinueShoppingButton();
        try {
            Assert.assertTrue(itm.getItemColor().contains(col), "the color changed");
        }catch (Exception e){
            System.out.println("something went wrong");
        }



    }

}

