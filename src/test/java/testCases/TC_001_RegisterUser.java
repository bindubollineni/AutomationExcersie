package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.BaseClass;

public class TC_001_RegisterUser extends BaseClass {
    @Test
    public void TC_001_RegisterUser() throws InterruptedException {
        logger.info("TC_001_RegisterUser started");

        //HomePage
        HomePage hp = new HomePage(driver);
        Assert.assertEquals(hp.check_Img(), true);
        logger.info("3: Verifed that home page is visible successfully");
        hp.click_SignUpLogin();
        logger.info("4: Click on 'Signup / Login' button");

        //SignUp/Login Page
        SignupLoginPage slp = new SignupLoginPage(driver);
        Assert.assertEquals(slp.getTextVisibility(), true);
        logger.info("5: Verifed 'New User Signup!' is visible");
        slp.setTxt_Name(generateString());
        slp.setTxt_Email(generateString());
        logger.info("6: Enter name and email address");
        slp.click_Submit();
        logger.info("7. Click 'Signup' button");

        //Account Information Page
        AccountInformationPage aip = new AccountInformationPage(driver);
        Assert.assertEquals(aip.verify_TxtDisplayed(), true);
        logger.info("8: Verify that 'ENTER ACCOUNT INFORMATION' is visible");
        aip.click_Title();
        aip.set_Password(generatePassword());
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        aip.set_Day();
        aip.set_Month();
        aip.set_Year();
        logger.info("9. Fill details: Title, Name, Email, Password, Date of birth");

        aip.setNewsletter();
        logger.info("10. Select checkbox 'Sign up for our newsletter!");
        aip.setOption();
        logger.info("11. Select checkbox 'Receive special offers from our partners!'");

        //Address Information

        aip.setFirstName(generateString());

        aip.setLastName(generateString());
        aip.setCompany(generateString());
        aip.setAddress1();
        aip.setAddress2();

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

        aip.setCountry();
        aip.setState();
        aip.setCity();
        aip.setZipcode(generateNumber());
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        aip.setMobile_number(generateNumber());
        logger.info("12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number");

        aip.click_CreateAccount();
        logger.info("13. Click 'Create Account button");
        AccountCreatedPage acp = new AccountCreatedPage(driver);
        Assert.assertTrue(acp.getTxtDisplayed());
        logger.info("14. Verify that 'ACCOUNT CREATED!' is visible");
        acp.click_Continue();
        logger.info("15. Click 'Continue' button");
        FeatureItemsPage fp = new FeatureItemsPage(driver);
        if (fp.verifyTextLoggedInAs().contains("Logged in as")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        logger.info("16. Verify that 'Logged in as username' is visible");

        fp.click_DeleteAccount();
        logger.info("17. Click 'Delete Account' button");

        AccountDeletedPage adp = new AccountDeletedPage(driver);
        Assert.assertTrue(adp.getTextDisplayMsg());
        adp.click_Continue();
        logger.info("18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button");


    }

}
