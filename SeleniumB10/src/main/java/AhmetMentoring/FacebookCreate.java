package AhmetMentoring;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreate{
//    Facebook Sign up:
//    Scenario:
//    Open a Chrome browser.
//    Navigate to "http://www.fb.com"
//    Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
//    Verify that there is a "Create an account" section on the page.
//    Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
//    Update the date of birth in the drop-down.
//    Select gender.
//    Click on "Create an account".
//    Verify that the account is not created.

    //SUGGESTIONS :
    //1.ONCE YOU BELIEVE THE PATH IS CORRECT BUT IT IS NOT WORKING. CHECK THE LOCATER(ATTRIBUTE)
    // TO MAKE SURE IT IS NOT DYNAMIC.
    //2. DO NOT TYPE IT MANUALLY ********
    //3.IF YOU ARE GETTING NO SUCH ELEMENT OR INTERACTABLE EXCEPTION **** GO AND CHECK YOUR
    //LOCATER FIRST IF IT IS CORRECT THEN MAXIMIZE YOUR SCREEN IF IT IS STILL FAILING
    //GO AND PUT THREAD SLEEP BEFORE OR AFTER CLICK METHOD


    //IF you are getting no such element or interactable exception **** Go and check your locator first if it correct than
    // maximize your screen if it is still failing


public static void main(String[] args) throws InterruptedException {

    WebDriver driver= new ChromeDriver();
    driver.navigate().to("http://www.fb.com");
    driver.getCurrentUrl();

    WebElement button=driver.findElement(By.className("//a[@data-testid='open-registration-form-button']"));
    button.click();
    Thread.sleep(2000);

    String actualResult=button.getText();
    String expectedResult="Button";

    if(button.equals(expectedResult)){
        System.out.println(true);
    }else{
        System.out.println(false);
    }

    WebElement firstName=driver.findElement(By.name("firstname"));
    Thread.sleep(2000);
    firstName.sendKeys("Altynai");
    Thread.sleep(2000);
    WebElement lastName=driver.findElement(By.name("lastname"));
    lastName.sendKeys("Taalaybekova");
    Thread.sleep(2000);
    WebElement email=driver.findElement(By.name("reg_email__"));
    WebElement password=driver.findElement(By.name("reg_passwd__"));
    WebElement month=driver.findElement(By.name(" month"));
    WebElement day=driver.findElement(By.name("birthday_day"));
    WebElement year=driver.findElement(By.id("year"));

    email.sendKeys("taalaybekovaa@gmail.com");
    password.sendKeys("yuteujhdj");
    month.sendKeys("Aug");
    day.sendKeys("31");
    year.sendKeys("2017");

    WebElement femaleGender= driver.findElement(By.className("_58mt"));
    femaleGender.click();
    WebElement sumbit= driver.findElement(By.name("websubmit"));
    sumbit.click();





















}
}
