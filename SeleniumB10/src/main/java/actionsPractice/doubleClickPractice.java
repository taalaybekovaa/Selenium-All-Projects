package actionsPractice;

import utils.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class doubleClickPractice {

    @Test

    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.primefaces.org/showcase/ui/misc/effect.xhtml?jfwid=babe5");
        List<WebElement> buttons = driver.findElements(By.xpath("//div[contains(text(),'click')]"));
        //wrong locator find elements empty list
        // wrong element is elemet no such element exception
        Actions actions = new Actions(driver);

        for (WebElement button : buttons) {
            if (BrowserUtils.getText(button).equals("click")) {
                button.click();
            } else {
                actions.doubleClick(button).perform();

            }
        }

    }
    }