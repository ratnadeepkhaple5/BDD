Feature: 
  login to vtiger

  Scenario Outline: 
    :  Login to app with invalid credientials

    Given launch browser
    Then Enter URL
    Then validate LoginPage should be displayed or not
    Then Enter username <username>
    Then Enter password <pwd>
    #here parameterisation will not happened for no method
    #separate methods are created for each data
		#if any common data i.e. here we have 'admin' so here only one common method snippet
		#is generated
		
    Examples: 
      | username | pwd   |
      | admin    | admin |
      | sunny    | admin |