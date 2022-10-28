package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
        @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
        public WebElement singInLink;

    public Login clickonSingInLink(){
        clickOnElement(singInLink);
        return new Login();
    }
    }
