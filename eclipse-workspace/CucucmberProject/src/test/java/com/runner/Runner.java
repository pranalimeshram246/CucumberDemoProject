package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\CucucmberProject\\src\\test\\resources\\Features", glue = {
		"com.stepDefiniton" }, 
dryRun =false,
monochrome = true, 
plugin = { "pretty", "junit:target/JunitReports/reports.xml","json:target\\JsonReports\\reports.json","junit:target\\HtmlReports\\reports.html" },
tags = "@smoketest"
)

public class Runner {

}
