package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features = {"./FeatureFile/stock.feature"},monochrome = true,glue = {"setpDefinations"},dryRun = false,plugin = {"pretty","html:target/stockfunctions.html"})

public class run extends AbstractTestNGCucumberTests{
	
	

}
