package org.serenity.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demo.serenity.is/Account/login")
public class LoginPage extends PageObject{

    @FindBy(xpath = "//input[contains(@id,'Username')]")
    public WebElementFacade inputUserName;

    @FindBy(xpath = "//input[contains(@id,'Password')]")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[contains(@id,'LoginButton')]")
    public WebElementFacade buttonAutentication;
}
