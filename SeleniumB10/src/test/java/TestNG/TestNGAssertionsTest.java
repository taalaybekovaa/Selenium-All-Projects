package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    //create one method that takes two parameter as a Integer
    // and return the multiplication of these two number.
    public int multilplication(int a, int b) {
        return a * b;
    }
    @Test
    public void validateMulti() {
        int result = multilplication(-2, 4);
        int expected = -6;
        Assert.assertEquals(result, expected, "It is for -2 and 4");
    }
    @Test
    public void validateZero() {
        int result = multilplication(3, 0);
        int expected = 0;
        Assert.assertEquals(result, expected, "it is for 3 and 0");
    }
    @Test
    public void validatePositive(){
        int result=multilplication(2,3);
        Assert.assertTrue(result==6);
    }
    @Test
    public void validateNegative(){
        int result= multilplication(-2,-3);
        int expected=5;
        Assert.assertEquals(result,expected);//When assert fails the next line will not be executed
        //This type of assertions called hard assertion
        System.out.println("Negative test");



    }
}


