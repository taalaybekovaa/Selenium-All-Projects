package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
        System.out.println("You can use that one to set up your properties, delete cookies, set up screen size, remote driver");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
        System.out.println("Launch the browser. ");
    }
@BeforeClass
public void BeforeClass(){
    System.out.println("Before Class");
    System.out.println("Navigate to the website");
}
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void Test1(){
        System.out.println("Test-1");
    }
    @Test
    public void test2(){
        System.out.println("Test -2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        System.out.println("Take a screenshot for failed test annotation");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
        System.out.println("driver.quit");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
