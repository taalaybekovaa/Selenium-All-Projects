package actionsPractice;

import utils.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropPractice {
    @Test

    public void Test() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");

        WebElement dtaggable=driver.findElement(By.id("draggable"));
        WebElement orange= driver.findElement(By.className("test2"));
        WebElement blue= driver.findElement(By.className("test1"));

        String actualText= BrowserUtils.getText(orange);
        String expectedTexrOrange="... Or here.";

        Assert.assertEquals(actualText,expectedTexrOrange);


        WebElement cookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Thread.sleep(1000);

        Actions actions= new Actions(driver);
        actions.dragAndDrop(dtaggable,orange).perform();

        orange=driver.findElement(By.className("test2"));
        //We should reinitialize the orange box to overcome the staleElement Exception
        String successMessage=BrowserUtils.getText(orange);
        String expectedSuccessMessage="You did great!";

        Assert.assertEquals(successMessage,expectedSuccessMessage);

        String cssValue=orange.getCssValue("background-color");
//        System.out.println(cssValue);
        Assert.assertEquals(cssValue,"rgba(238, 111, 11, 1)");

    }
    @Test

    public void test2() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();

        WebElement dtaggable=driver.findElement(By.id("draggable"));
        WebElement orange= driver.findElement(By.className("test2"));
        WebElement blue= driver.findElement(By.className("test1"));

        WebElement cookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.click(dtaggable).moveToElement(blue).release().perform();

    }
}
