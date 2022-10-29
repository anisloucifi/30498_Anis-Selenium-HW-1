package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyNewAdresse extends BasePage {
    public MyNewAdresse(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "address1")
    WebElement inputAddress;
    @FindBy (id = "city")
    WebElement inputCity;
    @FindBy (id = "id_state")
    WebElement selectState;
    @FindBy (id = "postcode")
    WebElement inputZipcode;
    @FindBy (id = "id_country")
    WebElement selectCountry;
    @FindBy (id = "phone_mobile")
    WebElement inputMobilPhone;
    @FindBy (id = "alias")
    WebElement title;
    @FindBy (id = "submitAddress")
    WebElement submit;


    public void inputAddressField(String address) {
        sendKeysToElement(inputAddress, address);
    }

    public void inputCityField(String city) {
        sendKeysToElement(inputCity, city);
    }

    public void selectState(String state) {
        selectFromDropdownByVisibleText(selectState, state);
    }

    public void inputZipCodeField(String zipCode) {
        sendKeysToElement(inputZipcode, zipCode);
    }
    public void selectCountryField(String country) {
        clearSendKeysToElement(selectCountry, country);
    }
    public void inputPhoneField(String phone) {
        sendKeysToElement(inputMobilPhone, phone);
    }
    public void inputTitleField(String title) {
        sendKeysToElement(inputMobilPhone, title);
    }

    public void clickOnSaveButton() {
        clickOnElement(submit);
    }
    public Myaddresses updatenewAddress(String address, String city, String state, String zipCode,String country, String phone,String title) {
        inputAddressField(address);
        inputCityField(city);
        selectState(state);
        inputZipCodeField(zipCode);
        selectCountryField(country);
        inputTitleField(title);
        inputPhoneField(phone);
        clickOnSaveButton();
        return new Myaddresses();

    }
}
