package HomeworkSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestCase2 {

        //Steps
        //Navigate to "https://www.saucedemo.com/"
        //Enter username "standard_user"
        //Enter password "secret_sauce"
        //Click Login button
        //Select Price (low-high) from drop down box
        //Validate the products are displayed according to their price
        //and they are displayed low price to high price

    @Test
public void priceValidation () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();
        Thread.sleep(1000);

        WebElement drpNames = driver.findElement(By.className("product_sort_container"));
        Select drp = new Select(drpNames);
        drp.selectByVisibleText("Price (low to high)");

        List<WebElement> actual = driver.findElements(By.className("inventory_item_price"));
        List <String> expected = Arrays.asList("$7.99", "$9.99", "$15.99", "$15.99", "$29.99", "$49.99");

        for (int i = 0; i < actual.size(); i++) {
                Assert.assertEquals(actual.get(i).getText(), expected.get(i));
            }

        driver.close();
    }
}
