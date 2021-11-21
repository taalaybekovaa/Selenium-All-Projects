package com.test.etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.utils.BrowserUtils;
import utils.utils.ConfigReader;
import utils.utils.Driver;

import java.security.CodeSigner;
import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=Driver.getDriver();
        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicity will wait until all pages elements my Driver pointing.
        // If it still not loaded in 5 sec It will trow NoSuchElementException
        driver.get(ConfigReader.readProperty("etsyUrl"));
}

    @AfterMethod
    public void tearDown(ITestResult result){//it will check result
        Driver.tearDown();

        if(!result.isSuccess()){
            BrowserUtils.getScreenShot(driver,"etsyscreenshots");
        }
        Driver.tearDown();

    }
}


