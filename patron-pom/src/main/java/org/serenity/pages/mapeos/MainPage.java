package org.serenity.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/login")
public class MainPage extends PageObject{

    @FindBy(xpath = "//h1[text()='Tablero']")
    public WebElementFacade txtTitleMainPage;

}
