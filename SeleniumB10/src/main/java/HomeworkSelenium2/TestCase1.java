package HomeworkSelenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestCase1 {

@Test
public void productsOrderValidation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.saucedemo.com");

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement drpNames = driver.findElement(By.className("product_sort_container"));
        Select drp = new Select(drpNames);
        drp.selectByVisibleText("Name (Z to A)");

        List<WebElement> actualOrder = driver.findElements(By.className("inventory_item_name"));
        System.out.println(actualOrder);
        List<String> expectedOrder = Arrays.asList("Test.allTheThings() T-Shirt (Red)",
                "Sauce Labs Onesie",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Bike Light",
                "Sauce Labs Backpack");


        for (int i = 0; i < actualOrder.size(); i++) {

                Assert.assertEquals(actualOrder.get(i).getText(),expectedOrder.get(i));
        }
        driver.close();
}
}

