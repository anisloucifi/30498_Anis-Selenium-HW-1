package Smoke;

import base.BasePage;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Login;
import pages.MyAccount;

public class testAutentofication extends BasePage {
    /*
    1-lunch application
    2-click on sing in
    3-input text email and password
    4-click on login
    5-Verify the existence of the sing ou link

     */
    @Test

    public void testValidLogin(){
        HomePage hp = new HomePage();
        Login lg= hp.clickonSingInLink();
        MyAccount myaccnt=lg.doLogin(config.appUser,config.appPassword);
        Assert.assertTrue(myaccnt.isSingOutLinkDisplay());


    }
}
