package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class handleMuliplyDropDowns {
    //using genereric method

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        WebElement button=driver.findElement(By.className("//a[@data-testid='open-registration-form-button']"));
        button.click();
        Thread.sleep(2000);
//        Select birthdayMont = new Select(driver.findElement(By.name("birthday_month")));
//        birthdayMont.selectByValue("Aug");
//
//        Select birthDay = new Select(driver.findElement(By.name("birthday_day")));
//        birthDay.selectByValue("14");

        WebElement birthdayMonthElement = driver.findElement(By.name("birthday_month"));
        selectOptionFromDropDown(birthdayMonthElement,"Aug");
        WebElement birthDayElement = driver.findElement(By.name("birthday_day"));
        selectOptionFromDropDown(birthDayElement,"12");

        WebElement birthYear = driver.findElement(By.name("birthday_year"));
        selectOptionFromDropDown(birthYear,"2020");

    }

    public static void selectOptionFromDropDown(WebElement element, String value){// will select method
        // and dropdown and you don't need to call generic everytime

        Select ele=new Select(element);// we got dropdown
        List<WebElement> allOptions=ele.getOptions();//we are getting all oprions

        for (WebElement option:allOptions) {//every each option
            if  (option.getText().equals("2020")){
                option.click(); //if element is equals to Cuba, click
                break;
            }
        }


    }

}















