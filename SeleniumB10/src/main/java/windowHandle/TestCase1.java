package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class TestCase1 {
    @Test
    public static void Test() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/");
        WebElement latentView=driver.findElement(By.xpath("//a[.=' LatentView Analytics Pvt Ltd.']"));
//        latentView.click();
//        Thread.sleep(1000);

    }
}
