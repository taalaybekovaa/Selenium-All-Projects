package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {

public static void main(String[] args) {

    WebDriver driver= new ChromeDriver();
    driver.get(" file:///C:/Users/Altynai/Downloads/Techtorial.html");

        WebElement header= driver.findElement(By.id("techtorial1"));
        String hdr= header.getText();
        String expected="Techtorial Academy"; // from business requirement or acceptance critera
        System.out.println(header.getText());//returns tags of the elements

        if(hdr.equals(expected)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        WebElement checkBoxTitle=driver.findElement(By.className("group_checkbox"));
        String actTitle= checkBoxTitle.getText();
        String expectedTitle="All Tools";

        if(actTitle.equals(expectedTitle)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        WebElement fName= driver.findElement(By.name("firstName"));
        WebElement lName=driver.findElement(By.name("lastName"));
        WebElement phone= driver.findElement(By.name("phone"));
        WebElement email= driver.findElement(By.name("userName"));

        fName.sendKeys("David");// Will send to your web element
        lName.sendKeys("Turan");
        phone.sendKeys("2345673345");
        email.sendKeys("trn@gmail.com");

        //Store web element or check boxes--> JAva, Selenium, TestNG, Cucumber

      WebElement java= driver.findElement(By.id("cond1"));
      WebElement sel= driver.findElement(By.id("cond2"));
      WebElement testNg= driver.findElement(By.id("cond3"));
      WebElement cucumber=driver.findElement(By.id("cond4"));

      java.click();
        System.out.println(java.isSelected());//true
        System.out.println(testNg.isSelected());//false
        System.out.println(cucumber.isDisplayed());//it will return true since cucumber
        // elements are displayed on the page


}
}