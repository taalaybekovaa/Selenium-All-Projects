package alert;

import utils.utils.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SweetAlert {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sweetalert.js.org/");
        System.out.println("It will run before each test annotation");
        Thread.sleep(1000);
    }

    @Test
    public void sweetAlert() throws InterruptedException {
        SoftAssert softAssert= new SoftAssert();
        WebElement swal = driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        swal.click();
        Thread.sleep(1000);

        WebElement popupMessage = driver.findElement(By.xpath("//div[@class='swal-text']"));
        String actualessge = BrowserUtils.getText(popupMessage).trim();
        softAssert.assertEquals(actualessge, "Something");

        WebElement okButton = driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]"));
        okButton.click();
        Thread.sleep(1000);

        softAssert.assertFalse(okButton.isDisplayed());
        softAssert.assertAll();//without this it will pass even if it is false
    }

    @Test
    public void jsAlert() throws InterruptedException {

        WebElement alert = driver.findElement(By.xpath("//button[contains(@onclick,'alert')]"));
        alert.click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("It will run after each test annotation");
        driver.quit();


    }
}