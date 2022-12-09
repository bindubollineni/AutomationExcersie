package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage extends BasePage{
    public AccountInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    WebElement txt_Displayed;

    public boolean verify_TxtDisplayed()
    {
        boolean verify = txt_Displayed.isDisplayed();
        return verify;
    }

    @FindBy(xpath = "//input[@value='Mrs']")
    WebElement set_Title;

    public void click_Title()
    {
        set_Title.click();
    }

    @FindBy(id = "password")
    WebElement password;

    public void  set_Password(String setPassword)
    {
        password.sendKeys(setPassword);
    }

    @FindBy(id = "days")
    WebElement days;

    public void set_Day()
    {
        Select select = new Select(days);
        select.selectByVisibleText("18");
    }

    @FindBy(id = "months")
    WebElement month;

    public void set_Month()
    {
        Select select = new Select(month);
        select.selectByVisibleText("August");
    }

    @FindBy(id = "years")
    WebElement year;

    public void set_Year()
    {
        Select select = new Select(year);
        select.selectByVisibleText("1982");
    }

    @FindBy(id = "newsletter")
    WebElement newsletter;
    public void setNewsletter()
    {
        newsletter.click();
    }

    @FindBy(id="optin")
    WebElement option;

    public void setOption()
    {
        option.click();
    }

@FindBy(id="first_name")
    WebElement firstName;
    public void setFirstName(String firstname)
    {
        firstName.sendKeys(firstname);
    }

    @FindBy(id="last_name")
    WebElement lastName;
    public void setLastName(String lastname)
    {
        lastName.sendKeys(lastname);
    }

    @FindBy(id="company")
    WebElement company;
    public void setCompany(String company1)
    {
        company.sendKeys(company1);
    }
    @FindBy(id="address1")
    WebElement address1;
    public void setAddress1()
    {
        address1.sendKeys("Address1");
    }


    @FindBy(id="address2")
    WebElement address2;
    public void setAddress2()
    {
        address2.sendKeys("Address2");
    }
    @FindBy(id="country")
    WebElement country;

    public void setCountry()
    {
        Select select = new Select(country);
        select.selectByVisibleText("India");
    }

    @FindBy(id="state")
    WebElement state;

    public void setState()
    {
        state.sendKeys("state");
    }

    @FindBy(id="city")
    WebElement city;
    public void setCity()
    {
        city.sendKeys("city");
    }
    @FindBy(id="zipcode")
    WebElement zipcode;
    public void setZipcode(String zipCode)
    {
        zipcode.sendKeys(zipCode);
    }

    @FindBy(id="mobile_number")
    WebElement mobile_number;
    public void setMobile_number(String mobileNumber)
    {
        mobile_number.sendKeys(mobileNumber);
    }
    @FindBy(xpath = "//button[text()='Create Account']")
    WebElement btn_CreateAccount;

    public void click_CreateAccount()
    {
        btn_CreateAccount.click();
    }

}
