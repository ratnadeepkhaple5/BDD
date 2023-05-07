Feature:To test login function

Background:
#Background: List of steps run before each of the scenarios
Given launch browser
Then Enter URL

@smoketest    			#@ (Tags/Labels):To group Scenarios
Scenario: Login to app with valid credientials
Then validate LoginPage should be displayed or not
Then Enter username "admin"
#"admin" --> this will be like hardcoring the actual data into test
Then password "admin" 
And save
Then validate home page is displayed or not

@regressiontest
Scenario: Login to app with managers credientials
Then validate LoginPage should be displayed or not
Then Enter username "rama"
Then Enter password "rama777"
And save
Then validate home page is displayed or not

@regressiontest @smoketest
Scenario: Login to app with managers credientials
Then validate LoginPage should be displayed or not
Then Enter username "rama"
Then Enter password "prabhas123"
And save
Then validate home page is displayed or not
