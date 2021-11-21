package AhmetMentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) {

//        Test Case 2 - Automate all the Menu links of techlistic.com
//        Steps to Automate:
//        1. Launch browser of your choice say., firefox, chrome etc.
//        2. Open this URL -  https://www.techlistic.com/
//        3. Maximize or set size of browser window.
//        4. Click on 'Java Tutorial' link and validate page title.
//        5. Navigate back to Home Page.
//        6. Click on 'Selenium Tutorial' link and validate page title.
//        7. Navigate back to Home Page.
//        8. Click on 'Selenium Blogs' link and validate page title.
//        9. Navigate back to Home Page.
//        10. Click on 'TestNG Blogs' link and validate page title.
//        11. Close the browser.

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.techlistic.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        if (title.equals("Techlistic - RSS\"")){
            System.out.println("true");
        }else{
            System.out.println("failed");
        }
        driver.navigate().back();

        if(title.equals("Techlistic")){
            System.out.println("pass");

    }else{
            System.out.println("failed");
        }
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[5]/a"));

}
}