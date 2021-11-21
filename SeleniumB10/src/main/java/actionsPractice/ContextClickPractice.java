package actionsPractice;

import utils.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContextClickPractice {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

     @Test

     public void hoverOver(){
         WebDriver driver1= new ChromeDriver();
         driver1.get("https://the-internet.herokuapp.com/hovers");
        //Webelement comes from Generics
         List<WebElement> names=driver1.findElements(By.xpath("h5"));
         List<WebElement> pictures=driver1.findElements(By.xpath("//div/img"));
         Actions actions= new Actions(driver1);

         List<String> actualNames= new ArrayList<>();
         List<String> expectedNames= Arrays.asList("name: user1","name: user2","name: user3");

         for (int i = 0; i < names.size() ; i++) {
             actions.moveToElement(pictures.get(i)).perform();// If you don't put pefromw its not going to move th emouse
            //You need to use moveElement othervise it' goint to give you false
             System.out.println(BrowserUtils.getText(names.get(i)));

         }
         Assert.assertEquals(actualNames, expectedNames);

        }

    }
