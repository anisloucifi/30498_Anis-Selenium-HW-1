package Smoke;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.SearchResult;

public class test_addtocard extends BasePage {
    @Test
    public void testaddingtocart() {
        HomePage home = new HomePage();
        ItemPage itm = new ItemPage();
        SearchResult sr = new SearchResult();
        home.doSearch("Printed Dress");
        sr.clickonWantedtem();
        itm.clickonAddtoCart();
        itm.clickOnContinueShoppingButton();
        Assert.assertTrue(itm.checkIteminCart() == 1, "the item successfully added to cart");

    }

}
