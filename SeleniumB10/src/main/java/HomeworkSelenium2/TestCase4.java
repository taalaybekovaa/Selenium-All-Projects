package HomeworkSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestCase4 {

    /*Steps
Navigate to "https://www.saucedemo.com/"
Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Find the highest priced two product on the page
Add them to the cart
Click cart button
Click CheckOut Button

Fill out First Name, Last Name and Zip Code
Click continue button
Validate Item total price is equals to total price of
selected product
Validate Total is equals to Item Total price plus Tax
amount
Validate the Url contains "checkout"
Click finish button
Validate "THANK YOU FOR YOUR ORDER" message is
displayed
     */

    @Test
    public void checkoutValidation() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.navigate().to(" https://www.saucedemo.com");

    WebElement userName = driver.findElement(By.id("user-name"));
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    userName.sendKeys("standard_user");
    password.sendKeys("secret_sauce");

    WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
    loginButton.click();
    Thread.sleep(2000);

 WebElement drp= driver.findElement(By.className("product_sort_container"));
 Select select= new Select(drp);
 select.selectByVisibleText("Price (high to low)");
 List <WebElement> productPrices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
 List <WebElement> productNames=driver.findElements(By.xpath("inventory_item_name"));
 WebElement cart= driver.findElement(By.xpath("shopping_cart_link"));
 List<WebElement> addToCart=driver.findElements(By.className("btn btn_primary btn_small btn_inventory"));

// addToCart.get(0).click();
// addToCart.get(1).click();
//
// String firstProductName=productNames.get(0).getText();
// double firstProductPrice=Double.parseDouble(productPrices.get(0).getText().trim().substring(1));
//
// String secondProductName=productNames.get(1).getText();
// double secondProductPrice=Double.parseDouble(productPrices.get(1).getText().trim().substring(1));
//
// Map<String,Double> map = new TreeMap<>();
// map.put(firstProductName,firstProductPrice);
// map.put(secondProductName,secondProductPrice);
//
//
//       cart.click();
//       Thread.sleep(500);
//       driver.findElement(By.xpath("//button[@id='checkout']")).click();
//       Thread.sleep(500);
//
//        WebElement firstName=driver.findElement(By.id("first-name"));
//        WebElement lastName=driver.findElement(By.id("lastName"));
//        WebElement zipCode= driver.findElement(By.id("postal-code"));
//
//        firstName.sendKeys("Altynai");
//        lastName.sendKeys("Taalaybekova");
//        zipCode.sendKeys("60018");
//
//        WebElement continueButton=driver.findElement(By.id("continue"));
//        continueButton.click();
//        Thread.sleep(1000);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

}
}
