package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends BasePage{


    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement textVisible;

    public boolean getTextVisibility()
    {
       boolean visible =  textVisible.isDisplayed();
       return visible;
    }

    @FindBy(xpath = "//input[@name='name']")
    WebElement  txt_Name;
    public void setTxt_Name(String name)
    {
        txt_Name.sendKeys(name);
    }

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement txt_Email;

    public void setTxt_Email(String email)
    {
        txt_Email.sendKeys(email+"@gmail.com");
    }

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement btn_Submit;

    public void click_Submit()
    {
        btn_Submit.click();
    }
}
