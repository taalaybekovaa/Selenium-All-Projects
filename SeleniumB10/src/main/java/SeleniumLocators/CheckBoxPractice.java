package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demoqa.com/checkbox");

        WebElement home=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        home.click();

        WebElement arrowHome=driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        WebElement arrowDesktop=driver.findElement(By.xpath("//li[.='Desktop']/span/button"));

        arrowDesktop.click();

        //Task: Click to the download arrow
        WebElement arrowDownload= driver.findElement(By.xpath("//li[.='Downloads']/span/button"));
        arrowDownload.click();

        WebElement arrowDocuments= driver.findElement(By.xpath("//li[.='Documents']/span/button"));
        arrowDocuments.click();

        WebElement officeText= driver.findElement(By.xpath("//span[.='Office']"));
        System.out.println(officeText.getText());


    }
}
