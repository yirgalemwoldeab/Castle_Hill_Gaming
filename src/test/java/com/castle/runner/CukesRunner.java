package com.castle.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

        },
        features = "src/test/resource/feature" ,
        glue = "com/castle/step_definitions",
        dryRun = false,
        tags = "",
        publish=true
)




public class CukesRunner {


}
