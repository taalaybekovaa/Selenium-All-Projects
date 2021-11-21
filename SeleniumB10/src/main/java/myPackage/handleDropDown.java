package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.module.FindException;
import java.util.List;

public class handleDropDown {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();//instance
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement drpCountryEle=driver.findElement(By.id("input-country"));

        Select drpCountry = new Select(drpCountryEle); // To access methods
        drpCountry.selectByVisibleText("Denmark");// Visible text Whatever we passed will select
        drpCountry.selectByValue("10");//We are passing value 10 from HTML. It will select by value which is Argentina
        drpCountry.selectByIndex(13);//starting from 0 its not visible from HTML you need to count which is Australia
        // even you don't have value you need to count as an index

        //How we can handle dropdown in select class but without his methods

        //selecting option from dropdown without Select methods

        // we need to take the all options
        List<WebElement> allOptions=drpCountry.getOptions(); //Returning list of webElements. Every option is a web elements
        //to get each element

        for (WebElement option:allOptions) {
          if  (option.getText().equals("Cuba")){
              option.click(); //if element is equals to Cuba, click
              break;
          }
        }
// We can also
    }
}
