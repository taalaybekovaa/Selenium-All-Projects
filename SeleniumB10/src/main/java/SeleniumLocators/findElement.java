package SeleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement {

    public static void main(String[] args) throws InterruptedException {

    //
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver= new FirefoxDriver();
    driver.navigate().to("https://www.google.com");

    WebElement search=driver.findElement(By.name("q"));
    search.sendKeys("Iphone13");
    Thread.sleep(2000);
    WebElement searchButton=driver.findElement(By.name("btnk"));
    searchButton.sendKeys(Keys.ENTER);
    Thread.sleep(2000);

    WebElement result=driver.findElement(By.tagName("nobr"));
    String res=result.getText().replaceAll("[!0-9.]", " ");
//    search.sendKeys(Keys.ENTER);
    double sec=Double.parseDouble(res);

    if(sec<3){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    }
}
