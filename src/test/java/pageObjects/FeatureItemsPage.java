package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeatureItemsPage extends BasePage{
    public FeatureItemsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement txt_LoggedIn;
    public String verifyTextLoggedInAs()
    {
        String txt = txt_LoggedIn.getText();
        return txt;
    }

    @FindBy(linkText = "Delete Account")
    WebElement linkDeleteAccount;
    public void click_DeleteAccount()
    {
        linkDeleteAccount.click();
    }


}
