package pages;

import base.BasePage;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Login extends BasePage {
    public Login() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement inputusername;
    @FindBy(id = "passwd")
    WebElement inputpassword;
    @FindBy(id = "SubmitLogin")
    WebElement clickonlogin;

    public void sendkeyUserName(String username) {
        sendKeysToElement(inputusername, username);
    }

    public void sendkeypassword(String password) {
        sendKeysToElement(inputpassword, password);
    }

    public void clickonLogin() {
        clickOnElement(clickonlogin);

    }

    public MyAccount doLogin(String username, String password) {
      sendkeyUserName(username);
      sendkeypassword(password);
      clickonLogin();
      return new MyAccount();
    }
}
