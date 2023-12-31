package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@VYT-123"

        // I've added this conde from featureBranch1

        //I've added a new code from the feature branch
        // this is my second code of line from feature branch

)
public class CukesRunner {
}
