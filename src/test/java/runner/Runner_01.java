package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.*;

@CucumberOptions
(features = "./src/test/java/practiceFeature/Login.feature",
glue = {"SDF_table","hook"},
dryRun = false,
tags = "@smoketest",
monochrome = true,
plugin = {"pretty","html:reports/cucumber.html"}
)
public class Runner_01 extends AbstractTestNGCucumberTests{

//AbstractTestNGCucumberTests-> to run each scenario found in feature as separated test	
	
/**features
 * here we need to provide feature file path
 */
	
/**glue
 * 	here we need to provide "package name" of StepDefinationFile
 * it takes inputs as string or string array
 * in array we can write package names e.g.{"SDF_table","hook"}
 * here hook is also a package name
 */
	
/**draRun
 * 	if dryRun=true-> it check only for each test of feature file there
 * 					 is a method or not in StepDefinationFile and will
 * 					 will not execute the code
 * 
 * if dryRun=false-> it will do execution as per the code
 */
	
/**@tags
 * 	
 * for each scenario we can give tags "to group the scenario's"
 * & in runner we can execute specific or required tags/groups
 * e.g-> "@smoketetest",
 * 		 "not @smoketest",
 * 		  "@smoketest and @regressiontest"
 * 			"@smoketest or @regressiontest"
 *  
 */
	
/**monochrome
 * if monochrome=true-> it will clear unwanted data from console
 * 						& only shows required data
 * 	if false-> then console will remain same
 */
	
/**plugin
 * it take data as string or string array
 * 	
 * if plugin="pretty" then in console we can watch execution b,coz
 * 			  it gives execution steps as per featureFile Steps
 * 			  in console
 * 
 * for generating reports we need to pass path along with pretty in array
 * 
 * e.g.-> plugin={"pretty","html:folderName/ReportName.html"}
 * 
 */
}
