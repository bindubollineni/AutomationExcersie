package testBase;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.File;
import java.io.IOException;


import java.time.Duration;
import java.util.Random;
import java.util.ResourceBundle;

public class BaseClass {

    public static WebDriver driver;

    public ResourceBundle rb;
    public Logger logger;
    public JavascriptExecutor js;
    public WebDriverWait wait;

    @BeforeClass

    public void setUp() {

        rb = ResourceBundle.getBundle("config");
        logger = LogManager.getLogger(this.getClass());

        if (rb.getString("browser").equals("chrome"))
        {
            driver = new ChromeDriver();
            logger.info("1. Launch browser");
        } else
        {
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(rb.getString("url"));
       logger.info(" 2. Navigate to url 'http://automationexercise.com'");
        driver.manage().window().maximize();
        js =(JavascriptExecutor) driver;
    }

    @AfterClass

    public void tearDown() {
        driver.quit();
    }


    public String generateString()
    {
       String string =  RandomStringUtils.randomAlphabetic(5);
       return string;

    }
    public String  generatePassword()
    {
       String password =  RandomStringUtils.randomAlphanumeric(7);
       return password;
    }

    public String generateNumber()
    {
       String number =  RandomStringUtils.randomNumeric(6);
       return number;
    }

    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = "./Screenshots/" + tname + "_" + timeStamp + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }
        return destination;

    }

}
