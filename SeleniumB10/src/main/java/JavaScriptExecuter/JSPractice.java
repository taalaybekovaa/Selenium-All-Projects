package JavaScriptExecuter;

import utils.utils.BrowserUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSPractice {

    @Test

    public void test() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.techtorialacademy.com/");

        JavascriptExecutor javaScriptExecuter=(JavascriptExecutor) driver;
        String title=(String) javaScriptExecuter.executeScript(" return document.title"); //get Title
         //document is object name
        //
        System.out.println(title);

        WebElement browseCourse= driver.findElement(By.linkText("Browse Course"));
        javaScriptExecuter.executeScript("arguments[0].click()",browseCourse);
        WebElement copyRights= driver.findElement(By.xpath("//p[contains(text(),'Copyrights')]"));
        javaScriptExecuter.executeScript("arguments[0].scrollIntoView(true)",copyRights);

        Thread.sleep(1000);

        WebElement login=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[contains(text(),'Student login')]"));
        javaScriptExecuter.executeScript("arguments[0].scrollIntoView(true)",login);

        WebElement copyRight= driver.findElement(By.xpath("//p[contains(text() ,'Copyrights')]"));
        BrowserUtils.scrollToView(driver,copyRight);

        Point location=copyRights.getLocation();
        System.out.println(location.getY());
        System.out.println(location.getX());
        int xCord= location.getX();
        int yCord=location.getY();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo("+xCord+","+yCord+")");

        js.executeScript("history.go(0)");//refresh
       // driver.navigate().refresh();// other way to refresh
       // ?/we need to cast driver executer
                //if you declare Webdriver driver -- you don't have to cast

        //using JavaExecuter we can send the keys,
    }
}
