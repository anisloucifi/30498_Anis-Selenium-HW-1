package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount  extends BasePage {
    public MyAccount(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//a[@title='Log me out']")
    public WebElement singOutLink;
    @FindBy(xpath = "//a[@title='Addresses']/span")
    WebElement addresses;

    public boolean isSingOutLinkDisplay(){
        return isElementVisible(singOutLink);


    }
    public Myaddresses clickOnAdresses() {
        clickOnElement(addresses);
        return new Myaddresses();


    }

}
