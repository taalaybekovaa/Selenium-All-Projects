package com.test.etsy.tests;

import com.test.etsy.pages.EtsyHomePage;
import com.test.sentrifugo.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EtsyTest extends TestBase {

    @Parameters("item")
    @Test
    public void etsySearchTest(String item){
        EtsyHomePage homePage= new EtsyHomePage(driver);
        homePage.searchItem(item);
        Assert.assertTrue(homePage.vaildateTitle());
    }

    //homework: change validateTitle implementation method that will work with all the search values.
    //now it is working only with "java programming mug"

    @Test
    public void test(){
        EtsyHomePage homePage=new EtsyHomePage(driver);
        homePage.searchItem("winter gloves");
        Assert.assertTrue(homePage.vaildateTitle());
    }
}
