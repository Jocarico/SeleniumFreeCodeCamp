package com.saucedemo.pages;

import org.openqa.selenium.By;

//Inhernce use with extends keyword
public class LoginPage extends BasePage{

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    public void setUsernameField(String username) {
        set(usernameField, username);
    }

    public void setPasswordField(String password) {
        set(passwordField, password);
    }

    public ProductPage clickLoginButton(){
        click(loginButton);
        return new ProductPage();
    }

    public ProductPage logIntoApplication(String username, String password){
        setUsernameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
}
