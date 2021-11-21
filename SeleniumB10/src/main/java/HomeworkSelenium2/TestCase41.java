package HomeworkSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestCase41 {

    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        WebElement sort = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(sort);
        select.selectByVisibleText("Price (high to low)");

        List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
        WebElement cart = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
        List<WebElement> addToCart = driver.findElements
                (By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"]"));

        addToCart.get(0).click();
        addToCart.get(1).click();

        String firstProductName = productNames.get(0).getText();
        double firstProductPrice = Double.parseDouble(productPrices.get(0).getText().trim().substring(1));
        String secondProductName = productNames.get(1).getText();
        double secondProductPrice = Double.parseDouble(productPrices.get(1).getText().trim().substring(1));

        Map<String, Double> map = new TreeMap<>();
        map.put(firstProductName, firstProductPrice);
        map.put(secondProductName, secondProductPrice);
        System.out.println(map);

        cart.click();
        WebElement checkOutButton = driver.findElement(By.xpath("//button[contains(text() ,'Checkout')]"));
        checkOutButton.click();


        //Fill out First Name, Last Name and Zip Code Click continue button
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder=\"Zip/Postal Code\"]"));
        WebElement continueButton = driver.findElement(By.xpath("//input[@data-test=\"continue\"]"));

        firstName.sendKeys("Bota");
        lastName.sendKeys("Idris");
        zipCode.sendKeys("60640");
        continueButton.click();

        //Validate Item total price is equals to total price of selected product
        WebElement itemtotal = driver.findElement(By.className("summary_subtotal_label"));
        WebElement tax = driver.findElement(By.className("summary_tax_label"));
        WebElement total = driver.findElement(By.className("summary_total_label"));

        double ItemTotal = Double.parseDouble(itemtotal.getText().replace("Item total: $79.98", "79.98"));
        double selectedTotal = firstProductPrice + secondProductPrice;
        Assert.assertEquals(ItemTotal, selectedTotal);

        //Validate Total is equals to Item Total price plus Tax amount
        String actualTotal = total.getText();
        //System.out.println(actualTotal);
        String expectedTotal = "86.38";
        actualTotal = total.getText().replace("Total: $86.38", "86.38").trim();
        Assert.assertEquals(actualTotal, expectedTotal);


        //Validate the Url contains "checkout"
        String urlCheckOut = driver.getCurrentUrl();
        String expectedUrlCheckOut = "https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(urlCheckOut, expectedUrlCheckOut);

  /* Click finish button
   Validate "THANK YOU FOR YOUR ORDER" message is displayed */
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
        WebElement thankYouPage = driver.findElement(By.xpath("//h2[contains(text(), 'THANK YOU FOR YOUR ORDER')]"));
        Assert.assertTrue(thankYouPage.isDisplayed());


    }
}
