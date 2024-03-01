package org.serenity.pages.interactions;

import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.serenity.pages.mapeos.MainPage;

public class MainPageInteraction extends PageObject{
    @Page
    private MainPage mainPage;

    public String getTitleMainPage(){
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }
}
