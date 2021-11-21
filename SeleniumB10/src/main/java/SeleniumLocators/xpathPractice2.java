package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice2 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com");
        //By.LinkText("Typos")
        //a[@href='/typos]
        ////a[.='Typos']
        //a[text()='Typos']
        WebElement typos=driver.findElement(By.xpath("//a[text()='Typos']"));
        typos.click();
        WebElement p=driver.findElement(By.xpath(""));
        System.out.println(p);
        driver.navigate().back();


    }
}
