package com.perfleet.pages;


import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement loginBox;

    @FindBy(id="prependedInput2")
    public WebElement passwordBox;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(css = "a[href='/user/reset-request']")
    public WebElement forgotYourPassword;

    @FindBy(css = "div[class='alert alert-error']>div")
    public WebElement errorMessage;

    @FindBy(css = "div[class='alert alert-warn']")
    public WebElement updatePasswordMessage;

    @FindBy(css = "span[class='custom-checkbox__text']")
    public WebElement rememberMeOnThisComputer;

    @FindBy(id = "remember_me")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Driver']")
    public WebElement carRow;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/h5")
    public WebElement genInfoText;

    @FindBy(xpath = "//a[@title='Edit Car']")
    public WebElement editButton;

    @FindBy(xpath = "//a[@title='Delete Car']")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;

    // delete btn //a[@title='Delete Car']
    // add event /a[@title='Add an event to this record']
    public void login(String userNameStr, String passwordStr) {
        loginBox.sendKeys(userNameStr);
        passwordBox.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}