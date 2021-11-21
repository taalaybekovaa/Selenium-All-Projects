package Apple;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCaseLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.apple.com/");
        driver.getCurrentUrl();
        WebElement shoppingButton=driver.findElement(By.xpath("//*[@id=\"ac-gn-bag\"]/div/a"));
        Thread.sleep(2000);
        shoppingButton.click();
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        loginButton.click();
        Thread.sleep(1000);

        String expectedTitle = "Sign In — Secure Checkout - Apple";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"sorry titles don't match...");
        if (actualTitle.equals(expectedTitle))
            System.out.println("match");
        else
            System.out.println("mismatch");
        Thread.sleep(3000);
        driver.close();
    }
}
//By.partialLinkText("Sign in")