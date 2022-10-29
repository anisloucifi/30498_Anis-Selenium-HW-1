package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import java.util.List;

public class Myaddresses extends BasePage {


    public Myaddresses() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Add an address']")
    WebElement newAddress;
    @FindBy (xpath = "//h3[@class='page-subheading']")
    public static WebElement subheading;


    public MyNewAdresse clickOnAddNewAdr(){
        clickOnElement(newAddress);
        return new MyNewAdresse();
    }

}
