package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementsPractice {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
       // driver.findElement(); one element
        // driver.findElements();  we need to use find elements method to store all matching elements from the locator.
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links=driver.findElements(By.xpath("//li/a"));
        //If you are puting something which is not exist it's not giving you No sUch element Excpetion,
        // it will run and give you null
        //print all the text from the list which has less than 12 characters
        int count=0;
        for (WebElement link:links){
            if(link.getText().length()<12){
                System.out.println(link.getText());
                System.out.println(link.getAttribute("href"));
                count++;

            }
        }
        System.out.println(count++);

        }
            }
