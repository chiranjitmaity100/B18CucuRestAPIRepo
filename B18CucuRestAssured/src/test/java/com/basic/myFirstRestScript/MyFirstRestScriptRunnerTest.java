package com.basic.myFirstRestScript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/myFirstRestScript"},
		glue={"com/basic/myFirstRestScript"}
		
		
		)


public class MyFirstRestScriptRunnerTest {

}
