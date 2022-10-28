package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCarte extends BasePage {
    public AddtoCarte(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//ul[@id='homefeatured']//a[@title = 'Add to cart']")
    WebElement addtocartecheck;
    ////a[@data-id-product='2' and @title='Add to cart']

}
