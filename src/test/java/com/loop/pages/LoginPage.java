package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@type='submit']//span")
    public WebElement continueButton;

    public void loginDocuport(String username, String password){
//        BrowserUtils.waitForVisibility(usernameInput, DocuportConstants.small);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
//        BrowserUtils.waitForClickable(loginButton, DocuportConstants.small);
        loginButton.click();
//        BrowserUtils.justWait(DocuportConstants.small);
        if (BrowserUtils.waitForVisibility(continueButton, DocuportConstants.small).isDisplayed()) {
            continueButton.click();
        }
    }

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}