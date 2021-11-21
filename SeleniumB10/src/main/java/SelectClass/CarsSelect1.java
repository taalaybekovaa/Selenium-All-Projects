package SelectClass;

import utils.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsSelect1 {

        @Test
        public void testCars() throws InterruptedException {

            ChromeDriver driver= new ChromeDriver();
            driver.get("https://www.cars.com/");

            WebElement newUsed=driver.findElement(By.id("make-model-search-stocktype"));
            WebElement make=driver.findElement(By.id("makes"));
            WebElement model=driver.findElement(By.id("models"));
            WebElement searchButton=driver.findElement(By.xpath("//div[@id='by-make-tab']//button"));

            BrowserUtils.selectBy(newUsed,"New cars","text");
            BrowserUtils.selectBy(make, "porsche","value");
            BrowserUtils.selectBy(model, "4", "index");

//        Select select = new Select(newUsed);
//        select.selectByVisibleText("New cars");
//        Select select1= new Select(makes);
//        select.selectByValue("porsche");
//        Select select2= new Select(allmodels);
//        select2.selectByIndex(4);

            searchButton.click();
            Thread.sleep(2000);
            WebElement header=driver.findElement(By.xpath("//h1"));
            String actual=BrowserUtils.getText(header);
            String expected="New Porsche 911 for sale";
            Assert.assertEquals(actual,expected);

            driver.close();

                }
            }

