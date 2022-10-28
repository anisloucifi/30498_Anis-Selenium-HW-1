package pages;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Search extends BasePage {
    @FindBy (id="search_query_top")
    public WebElement searchbar;
    @FindBy (xpath = "//*[@id=\"searchbox\"]/button")
    public WebElement clickBotton;

    public Search() {
        PageFactory.initElements(driver, this);
    }
    public void inputTextonSearchbar(String search){
        sendKeysToElement(searchbar,search);
    }
    public void ClickonsearchBotton(){
        clickOnElement(clickBotton);

    }
}
