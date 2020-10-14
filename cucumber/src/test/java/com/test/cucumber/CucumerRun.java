package com.test.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "Modulos/pageEmpleos/filtrosPagina.feature", tags = "@tags1")
public class CucumerRun {

}
