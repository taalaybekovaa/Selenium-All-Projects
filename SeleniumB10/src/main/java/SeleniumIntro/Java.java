package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getCurrentUrl());;

//        WebElement email3=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div[1]/img"));//full absolute

        WebElement email =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img"));// relative xpath
        WebElement pass=driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));

        email.sendKeys("taalaybekovaa@gmail.com");
        pass.sendKeys("Thailand");



    }
}