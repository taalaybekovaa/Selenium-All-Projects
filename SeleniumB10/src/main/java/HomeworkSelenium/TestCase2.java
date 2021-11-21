package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesButton = driver.findElement(By.xpath("//label[contains(@for, 'yesRadio')]"));
        yesButton.click();
        if (yesButton.getText().equals("Yes")) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        WebElement impressiveButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveButton.click();
        String actualClickedImpressive= impressiveButton.getText();
        String expectedImpressive = "You have selected Impressive";

        if (impressiveButton.getText().equals("Impressive")) {
            System.out.println("Impressive Test passed");
        }else {
            System.out.println("Impressive Test failed");
        }

        WebElement noButton= driver.findElement(By.xpath("//input[@id='noRadio']"));

        if(noButton.isEnabled()){
            System.out.println("No button is enabled");
        }else{
            System.out.println("No button is disabled");
        }
        Thread.sleep(2000);
        driver.close();

    }
}





