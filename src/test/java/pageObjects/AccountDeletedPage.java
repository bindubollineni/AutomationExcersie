package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage{
    public AccountDeletedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    WebElement txtDisplayMsg;
    public boolean getTextDisplayMsg()
    {
        boolean msg = txtDisplayMsg.isDisplayed();
        return msg;
    }

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement lnkContinue;
    public void click_Continue()
    {
        lnkContinue.click();
    }


}
