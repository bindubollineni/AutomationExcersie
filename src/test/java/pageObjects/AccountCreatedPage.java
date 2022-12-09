package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

public class AccountCreatedPage extends BasePage {
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[text()='Account Created!']")
    WebElement txtDisplayed;
    public boolean getTxtDisplayed()
    {
        boolean acc_message = txtDisplayed.isDisplayed();
        return acc_message;
    }

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement btn_Continue;

    public void click_Continue()
    {
        btn_Continue.click();
    }


}
