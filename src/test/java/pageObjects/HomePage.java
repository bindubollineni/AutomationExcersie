package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    WebElement img_homeURL;

    public boolean check_Img() {
        boolean display = img_homeURL.isDisplayed();
        return display;
    }


    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginlnk;

    public void click_SignUpLogin()
    {
        signupLoginlnk.click();
    }

}
