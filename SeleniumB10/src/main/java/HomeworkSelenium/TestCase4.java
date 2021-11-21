package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Selenium");
        Thread.sleep(2000);

        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        String currentUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(currentUrl,expectedUrl,"Test case has failed, information is not matching ");
        }
    }

