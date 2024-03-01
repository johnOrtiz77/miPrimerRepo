package org.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity
//@RunWith(SerenityRunner.class)
//@RunWith(JUnit4.class)
@CucumberOptions(
                   features = "src/test/resources/features/Login.feature",
                   glue = "org.serenity.definitions", //POM
                   //glue = "co.com.reliquias.software.stepdefinitions", //Screenplay
                   tags = ("@InicioSesionExitoso"),
                   snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
                   plugin = {
                             "pretty",
                             "json:target/serenity-reports/login/cucumber.json",
                             "html:target/serenity-reports/login/serenity-html-report.html",
                             "rerun:target/serenity-report/login/rerun.txt"

                            }

)
public class LoginRunner {
}
