package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        WebElement searchButton=driver.findElement(By.name("btnK"));
        String actual= searchButton.getAttribute("value");
        String expected="Google Search";

        if(actual.equals(expected)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
