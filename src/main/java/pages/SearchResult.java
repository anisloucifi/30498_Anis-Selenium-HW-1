package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult extends BasePage {

    public SearchResult() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement item;

    public ItemPage clickonWantedtem() {
        clickOnElement(item);
        return new ItemPage();

    }
}

