package SeleniumIntro;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

public static void main(String[] args) {
// We are defining the chrome driver into the Project as a property. Otherwise, it's not going to understand
System.setProperty("webdriver.chrome.driver","chromedriver.exe");// file location of the driver

WebDriver driver= new ChromeDriver();

System.out.println(driver.getTitle());
// get method navigates to the given url
driver.get("https://www.techtorialacademy.com/");
//getTitle() method gets teh title from page and returns String
String title = driver.getTitle();
  // Navigates to Home page Techtorial
if(title.equals("Home Page - Techtorial"))
    System.out.println("true");
else
    System.out.println("false");


        System.out.println(driver.getCurrentUrl());
    }
}
// if you don't have else you can put a lot of line of IF, if you have else you can do it