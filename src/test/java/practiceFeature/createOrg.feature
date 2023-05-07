Feature: to test create canvass feature

  Scenario Outline: login to app and create canvass
  #Scenario Outline: List of steps for data-driven as an Examples and "<placeholder>"
  
    Given launch chrome browser
    Then enter url
    When enter Credientials and click on login
    Then homepage should be displayed
    When click on org module
    Then org listPage should displayed
    Then click on create new org
    Then should display create org page
    When enter all mandetory fields on test area and save "<orgname>"
    #if we need to pass one data only then we write "adi_01"
    Then Validate created org should display in org listPage

    Examples: 
      | orgname |
      | adi_01  |
      | adi_02  |
