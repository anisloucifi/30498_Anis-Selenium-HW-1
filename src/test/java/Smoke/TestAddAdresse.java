package Smoke;

import base.BasePage;
import com.google.common.util.concurrent.FakeTimeLimiter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import com.github.javafaker.Faker;

public class TestAddAdresse extends BasePage {
    @Test
    public void testAddNewAdresse(){
        HomePage hp = new HomePage();
        Myaddresses listadres = new Myaddresses();
        MyNewAdresse newadres = new MyNewAdresse();
        MyAccount account = new MyAccount();
        Login lg= hp.clickonSingInLink();
        MyAccount myaccnt=lg.doLogin(config.appUser,config.appPassword);
        account.clickOnAdresses();
        listadres.clickOnAddNewAdr();
        newadres.updatenewAddress("astoria", "newyork" , "New York", "11103","United States", "333222444","new address");

        WebElement addressesHeader = Myaddresses.subheading;

        Assert.assertTrue(addressesHeader.isDisplayed(), "this  header should be displayed");

    }
}
