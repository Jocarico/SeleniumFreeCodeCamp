package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScripUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {

    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");

    public void clickBadRequestLink(){
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}


