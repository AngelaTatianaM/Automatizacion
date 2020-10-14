package com.test.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="Modulos/pageEmpleos/filtrosPagina.feature", glue= "", tags = "@tag1")
public class CucumberRunner {

}
