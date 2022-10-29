package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends BasePage {
    public ItemPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@id='add_to_cart']/button")
    WebElement addtocartecheck;

    @FindBy(xpath = "//p[@id='quantity_wanted_p']/a[2]/span/i")
    WebElement plusbutton;
    @FindBy(id = "color_24")
    WebElement color;
    @FindBy(xpath = "//span[@title = 'Continue shopping']")
     WebElement continueShoppingButton;
    @FindBy(xpath = "//a[@title = 'View my shopping cart']")
     WebElement myshoppingcart;
    @FindBy(xpath = "//span[@class='quantity']")
     WebElement numbofIteminCart;
    @FindBy (xpath = "//div[@class='product-atributes']//a")
    WebElement colorInCart;



    public void clickonAddtoCart() {
        clickOnElement(addtocartecheck);

    }

    public void clickonPlusButton() {
        clickOnElement(plusbutton);
    }

    public void changeColor() {
        clickOnElement(color);
    }

    public void clickOnContinueShoppingButton() {

        clickOnElement(continueShoppingButton);
    }

    public void hoverOnShoppingCart() {

        hoverOverElement(myshoppingcart);
    }

    public int checkIteminCart() {
        hoverOnShoppingCart();
        return Integer.parseInt(getTrimmedElementText(numbofIteminCart));
    }



    public String getItemColor(){
        hoverOnShoppingCart();
        return getTrimmedElementText(colorInCart);
    }
}
