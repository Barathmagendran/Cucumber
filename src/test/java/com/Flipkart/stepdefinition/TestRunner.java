package com.Flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Feature"
                            ,glue="C:\\Users\\SRITHAR\\eclipse-workspace\\Cucumber-parctice\\src\\test\\java\\com\\Flipkart\\stepdefinition"
                            ,plugin="html:target",monochrome=false,dryRun=true,tags= {"@barath,@berry"})
public class TestRunner {

}
