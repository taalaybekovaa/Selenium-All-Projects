package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
        Thread.sleep(2000);

        WebElement usernameField= driver.findElement(By.xpath("//input[@id=\"userName\"]"));
        WebElement emailField=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
        WebElement currentAddressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAdressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement outPut = driver.findElement(By.xpath("//div[@id='output']"));

        usernameField.sendKeys("Altynai");
        emailField.sendKeys("taalaybekovaa@gmail.com");
        currentAddressField.sendKeys("Chicago");
        permanentAdressField.sendKeys("Rosemont");
        Thread.sleep(2000);
        submitButton.click();
        List<WebElement> outputs = driver.findElements(By.xpath("//p[@class=\"mb-1\"]"));

        String actualName= outputs.get(0).getText();// First element from this outputs is name
        String actualEmail= outputs.get(1).getText();
        String actualCurrentAddress= outputs.get(2).getText();
        String actualPermanentAddress= outputs.get(3).getText();
        String expectedName="Name:"+"Altynai";
        String expectedEmail="Email:"+"taalaybekovaa@gmail.com";
        String expectedCurrentAddress="Current Address :"+"Chicago";
        String expectedPermanentAddress="Permananet Address :"+"Rosemont";

        boolean isNameDisplayed=actualName.equals(expectedName);
        if (isNameDisplayed){
            boolean isEmailDisplayed= expectedEmail.equals(actualEmail);
            if (isEmailDisplayed){
                boolean isCurrentAddressDisplayed=expectedCurrentAddress.equals(actualCurrentAddress);
                if (isCurrentAddressDisplayed){
                    if (expectedPermanentAddress.equals(actualPermanentAddress)){
                        System.out.println("Information has been displayed correctly");
                    }else{
                        System.out.println("Permanent adress display is failed!");
                    }
                }else {
                    System.out.println("Current address display is failed!");

                }
            }else {
                System.out.println("Email display is failed!");
            }
        }else {
            System.out.println("Name display is failed!");
        }
    }
}

