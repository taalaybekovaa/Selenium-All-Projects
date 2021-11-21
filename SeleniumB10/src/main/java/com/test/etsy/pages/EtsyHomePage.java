package com.test.etsy.pages;

import utils.utils.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsyHomePage {

    public EtsyHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "global-enhancements-search-query")
    WebElement searchBox;


    @FindBy(xpath = "//li//h3")
    List<WebElement> searchTitle;

    public void searchItem(String searchValue) {
        searchBox.sendKeys(searchValue, Keys.ENTER);
    }

    public boolean vaildateTitle() {

        boolean hasKey = false;
        for (WebElement title : searchTitle) {
            String titileName = BrowserUtils.getText(title).toLowerCase();
            if (titileName.contains("java") || titileName.contains("programming") || titileName.contains("mug")) {
                hasKey = true;
            } else {
                System.out.println(titileName);
                return false;
            }
        }
        return hasKey;
    }
}



