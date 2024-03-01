package org.serenity.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.serenity.pages.mapeos.LoginPage;
import org.serenity.pages.interactions.MainPageInteraction;

import static org.hamcrest.MatcherAssert.assertThat;
import static  org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class LoginSteps extends PageObject {



    @Page
    private LoginPage loginPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("User opens login page@")
    public void openLoginPage(){
        loginPage.open();
    }

    @Step("Clear user and password fields")
    public void clearFieldsLogin(){
        loginPage.inputUserName.type("");
        loginPage.inputPassword.type("");
    }

    @Step("Enter credentials")
    public void enterCredentials(String username, String password){
        loginPage.inputUserName.type(username);
        loginPage.inputPassword.type(password);
    }

    @Step("Access the system")
    public void accessSystem(){
        loginPage.buttonAutentication.waitUntilClickable().click();
    }

    @Step("Validate successful login")
    public void validateSuccessfulLogin(){
        final String mensajeError = "Login was unsuccessful.";
        assertThat(mensajeError,mainPageInteraction.getTitleMainPage(),is(equalTo("Tablero")));
    }



}
