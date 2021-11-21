package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionMethods {

    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement searchBox= driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)//upper case
                .sendKeys("elenium")
                .doubleClick()
                .keyDown(Keys.CONTROL)//press
                .sendKeys("c")
                .keyUp(Keys.CONTROL)//remove
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.RETURN)//Enter
                .perform();


    }
}
