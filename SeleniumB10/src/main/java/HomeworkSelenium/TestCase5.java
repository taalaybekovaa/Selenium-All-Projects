package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCase5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        List<WebElement> products=driver.findElements(By.className("inventory_item_name"));

        String actualBackpack= products.get(0).getText();// First element from this outputs is name
        String bikeLight= products.get(1).getText();
        String tShirt= products.get(2).getText();
        String jacket= products.get(3).getText();
        String onesie=products.get(4).getText();
        String tShirtRed=products.get(5).getText();

        List <String> allProducts=new ArrayList<>();
        allProducts.add(actualBackpack);
        allProducts.add(bikeLight);
        allProducts.add(tShirt);
        allProducts.add(jacket);
        allProducts.add(onesie);
        allProducts.add(tShirtRed);



        Set <String> expectedAscending=new TreeSet<>();
        expectedAscending.addAll(allProducts);
        Assert.assertEquals(allProducts,expectedAscending," Your products name is not unique");
        driver.close();
    }
}
