package Smoke;

import base.BasePage;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Login;
import pages.MyAccount;

public class testAutentofication extends BasePage {

    @Test

    public void testValidLogin(){
        HomePage hp = new HomePage();
        Login lg= hp.clickonSingInLink();
        MyAccount myaccnt=lg.doLogin(config.appUser,config.appPassword);
        Assert.assertTrue(myaccnt.isSingOutLinkDisplay());


    }
}
