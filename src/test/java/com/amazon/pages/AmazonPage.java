package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#nav-logo-sprites")
    public WebElement logo;

    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    public WebElement navigateIcon;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    public WebElement signBtn;

    @FindBy(css = "#ap_email")
    public WebElement inputUserName;

    @FindBy(xpath = "//span[@id='continue']")
    public WebElement continueBtn;

    @FindBy(css = "#ap_password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signBtn2;

    public void login(String username, String password){
        inputUserName.sendKeys(username);
        continueBtn.click();
        inputPassword.sendKeys(password);
        signBtn2.click();
    }
}
