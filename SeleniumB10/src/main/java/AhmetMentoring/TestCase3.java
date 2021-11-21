package AhmetMentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
//    //
//    Test Case 3 - Open Godaddy.com and Validate Page Title
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and validate it with expected value.
//            5. Get URL of current page and validate it with expected value.
//6. Get Page source of web page.
//            7. And Validate that page title is present in page source.
//            8. Close browser.
//    Try writing program for above assignments and execute. If you find any difficulty in writing code for above assignments, you can refer following link for help:
//    Selenium Webdriver Browser Commands
//2. Automate Amazon Website Menu links with Selenium
//    This assignment helps you learn those Selenium commands which are useful in clicking on links and navigate to different pages. It is the most usual thing testers do. By automating this assignment, you will verify that, clicking on menu links landing users on correct web pages. I am assuming that you have already gone through
//    Assignment 1 and aware of basic commands of Selenium. Try to automate all the 3 test cases shared in this post, the more you practice more you get confidence.
//


    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();

        String currentTitle=driver.getTitle();
        String expectedTitle="";
        if(driver.equals("Domain_Names")){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
        driver.close();
    }
}
