package JavaScriptExecuter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSMethods {

    @Test

    public void Test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techtorialacademy.com/");



    }

}
