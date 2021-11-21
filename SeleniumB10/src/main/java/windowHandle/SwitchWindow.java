package windowHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;

public class SwitchWindow {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        //find the webelement for click here
        //print the text
        //find the webelement of new window text on the page

        WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        click.click();
        Thread.sleep(1000);

        String mainWindowId = driver.getWindowHandle();//123
        Set<String> ids = driver.getWindowHandles();//123-124

        for (String id : ids) {
            if (!id.equals(mainWindowId)) {
                driver.switchTo().window(id);

            }
        }
//        driver.switchTo().window("");
//        driver.switchTo().window("");

        WebElement newWindow = driver.findElement(By.xpath("//h3[.='New Window']"));

        String actual = newWindow.getText();
        String expected = "New Window";
        Assert.assertEquals(actual, expected, "New window validation");

        driver.quit();
    }
        @Test
          public void Test2(){
            WebDriver driver =new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/windows");

            WebElement clickHere=driver.findElement(By.xpath("//a[.='Click Here']"));
            clickHere.click();

            String mainWindow=driver.getWindowHandle();
            Set <String> ids=driver.getWindowHandles();
//close only second window
            for (String id:ids) {
             if(!id.equals(mainWindow)){
                 driver.switchTo().window(id);
                 driver.close();//close only one window
             }
            }
            driver.switchTo().window(mainWindow);
            Assert.assertEquals(driver.getTitle(), "The internet");

        }
    }

