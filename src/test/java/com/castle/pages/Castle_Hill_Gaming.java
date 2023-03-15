package com.castle.pages;

import com.castle.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Castle_Hill_Gaming {

    public Castle_Hill_Gaming() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="user-name")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(xpath="//img[@class='inventory_item_img']")
    public WebElement appLogo;


    @FindBy(xpath="//h3[@data-test='error']")
    public WebElement errorMessage;

}
