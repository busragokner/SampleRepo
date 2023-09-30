package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
    features = "@target/rerun.txt",
        glue = "com/vytrack/step_definitions"
        //I've done some changes here from featureBranch
)
public class FailedTestRunner {
}
