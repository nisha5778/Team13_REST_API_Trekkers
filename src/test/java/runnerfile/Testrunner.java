package runnerfile;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.*;
//import org.junit.AfterClass;
//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;



//@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty","html:Report/cucumber-reports.html"
		,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
			monochrome=true,  //console output color and removes unecessary options
			dryRun=false ,
			//tags=("@Postbatchcreate"),
			//tags=("@1CreateDataP"),// ifid tue then that means all the steps in feature have been defined or not
			//features = {".\\src\\test\\resources\\Features\\AssignmentPositiveScenarios.feature"},
				features = {"src\\test\\resources\\Features"
//						"src\\test\\resources\\Features\\2ProgramNegative.feature"
////						"src\\test\\resources\\Features\\2PositiveScenariosForUser.feature",
////						"src\\test\\resources\\Features\\3AssignmentPositiveScenarios.feature",
////						"src\\test\\resources\\Features\\4postsubassignment.feature",
////						"src\\test\\resources\\Features\\Delete.feature"
						},
			glue= "stepdefinitions")
public class Testrunner extends AbstractTestNGCucumberTests {

}

//AssignmentPositiveScenarios.feature
//postsubassignment.feature
//@1CreateDataP
//@assign
//@assignid- showing not found   id for already created assginment id-get grades