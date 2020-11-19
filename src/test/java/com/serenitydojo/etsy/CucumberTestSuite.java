package com.serenitydojo.etsy;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        tags = "@current",
        features = "src/test/resources/features"
)
public class CucumberTestSuite {}
