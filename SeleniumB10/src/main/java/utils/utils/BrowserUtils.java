package utils.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowserUtils {
    //we will create our reusable methods related with browser
    //inside the BrowserUtils class

    //Method that accepts two param - WebElement and Value SelectByVisibleText

    public  static void switchByTitle(WebDriver driver,String title){
        Set<String> ids=driver.getWindowHandles();
        for (String id: ids){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("About Us")) {
                break;
            }
        }

    }

    public static void closeWindowsByTitle(WebDriver driver, String title){
        Set<String> titles=driver.getWindowHandles();

        for (String id: titles) {
            driver.switchTo().window(id);
            if (!driver.getTitle().equals(titles)){
                driver.close();
            }
//
        }
    }

    public static void scrollToView(WebDriver driver,WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);

    }


    //implement the methods whcih will swith th e methods by this URL
    public static void selectBy(WebElement element, String value, String methodName) {
        Select select = new Select(element);
        // method can be text, index, value
        switch (methodName) {
            case "text":
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name si snot available, please use text value or index for method");
        }

    }
//Method will get the text from the webelement and trim it
    public static String getText(WebElement element) {
        return element.getText().trim();
    }
public static void getScreenShot(WebDriver driver,String packageName){//i need to call after my method annotation
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//getScreenShotAs method is taking a screenshot and returning the file of this screen.
    String location=System.getProperty("user.dir")+"/src/main/java/screenshot/"+packageName+"/";
    try {
        FileUtils.copyFile(file,new File(location+System.currentTimeMillis()+".png"));//store screenshot to the location
    } catch (IOException e) {
        System.out.println("Screenshot is not stored.");
        e.printStackTrace();
    }
    //Screenshot will be different and we need different names

    }
}
