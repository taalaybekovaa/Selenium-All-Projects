package openEmr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        // It will initialize the elements that we stored inside this class.

        //We cannot use find by annotation without this
    }

    @FindBy(id="username")
    public WebElement username;

    @FindBy(name = "password")
    WebElement password;

}
