Feature: 
  login to vtiger

  Scenario Outline: 
    :  Login to app with invalid credientials

    Given launch browser
    Then Enter URL
    Then validate LoginPage should be displayed or not
    Then Enter username "<username>"
    Then Enter password "<pwd>"
    #for parameterisation we both need tags<> as well as quates " "

    Examples: #Examples: Container for s table
   #example is like data provider where we are data required for test 
   
      | username | pwd   |
      | admin    | admin |
      | sunny    | admin |

      
      #			""  (Doc Strings)
			#     |    (Data Tables)