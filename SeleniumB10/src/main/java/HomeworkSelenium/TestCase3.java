package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver= new ChromeDriver();
       driver.navigate().to("https://www.saucedemo.com/");
       WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
       username.sendKeys("Java");
       Thread.sleep(2000);
       WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
       password.sendKeys("Selenium");
       Thread.sleep(2000);
       WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
       login.click();

      WebElement message= driver.findElement(By.xpath("//h3[contains(@data-test,'error')]"));
      String expectedResult="Username and password do not match any user in this service";
      String actualResult=message.getText();

      Assert.assertEquals(actualResult,expectedResult,"Test case has failed. Message not matching");
      driver.close();




    }
}
