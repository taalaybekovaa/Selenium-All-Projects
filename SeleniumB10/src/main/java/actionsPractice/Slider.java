package actionsPractice;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
    @Test
    public void sliderTest() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

        WebElement text=driver.findElement(By.id("range"));

        navigateToTarget(slider,text,driver,4.5);

//        Actions actions = new Actions(driver);
//        actions.clickAndHold(slider).moveByOffset(50, 0).build().perform();

        Point point = slider.getLocation();

        System.out.println(point.getX());
        System.out.println(point.getY());//coordinate of the elements \. Return the location of this element

        // -> find the webElement of the target then using the Point class (getLocation() method,
        // you can provide tge x and y coordinate

        //Task: Create a function that takes WebElement, driver, target number
    }

    // TASK: create the function that takes webElementSlider,webElementNumText, driver, target number
// navigateToTarget(slider, text, driver, 4);
    @Test
    public void navigateToTarget(WebElement slider, WebElement text, WebDriver driver, double targetNumber) {

        Actions actions = new Actions(driver);
        if (targetNumber == 2.5) {
            actions.click(slider).perform();
        } else if (targetNumber > 2.5) {
            int count = 10;//3,5
            while (!text.getText().equals(String.valueOf(targetNumber))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count += 5; //20
            }

        } else {
            int count = -10;
            while (!text.getText().equals(String.valueOf(targetNumber))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count -= 5;//-20 //-30

            }
        }
    }
}
