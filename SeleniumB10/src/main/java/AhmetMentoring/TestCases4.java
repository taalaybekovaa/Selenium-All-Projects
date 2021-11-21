package AhmetMentoring;

import io.netty.channel.socket.ChannelInputShutdownReadComplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases4 {

    public static void main(String[] args) {

//        Test Case 1 - Automate first Menu link of amazon.in and print page title
//        Steps to Automate:
//        1. Launch browser of your choice say., firefox, chrome etc.
//        2. Open this URL -  www.amazon.in
//        3. Maximize or set size of browser window.
//        4. Get the page title and print it.
//        5. Now, click on first menu link say 'Amazon Pay' (or choose any other link from the menu list)
//        6. Get the page title and print it.
//        7. Navigate back to Home Page.
//        8. Get the page title and print it. Verify that value matches with output of point no. 4
//        9. Close the browser.

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("www.amazon.in");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement amazonPay=driver.findElement(By.className("nav-a  "));
        amazonPay.click();
        String getTitle=driver.getTitle();
        System.out.println(getTitle);
        driver.navigate().back();
        System.out.println(driver.getTitle());

        if(getTitle.equals("Online shopping site")){
            System.out.println("pass");
        }else{
            System.out.println("Failed");
        }
        driver.close();

    }
}
