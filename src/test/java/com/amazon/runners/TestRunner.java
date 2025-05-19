package com.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html",
                "json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com.amazon.stepdefinitions",
        monochrome = true,
        dryRun = false,
        tags = "@c"
)
public class TestRunner {

}

