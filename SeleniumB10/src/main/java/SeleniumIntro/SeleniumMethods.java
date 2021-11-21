package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

    public static void main(String[] args)  throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        System.out.println(driver.getCurrentUrl());
        // no matter your code will stop on this line
        Thread.sleep(1000);

        //We can navigate to the page with 2 ways:
       // driver.get();  waiting for that web site will be loaded
        // driver.navigate().to(""); // it is not going to wait until. It's works faster
        //    driver.navigate().to("");  it's going to wait load it's going to work right away
        driver.navigate().to("\"https://www.techtorialacademy.com/\"");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();//google
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();

        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();

        System.out.println(driver.getPageSource());//returns HTML from the page


    }
}
