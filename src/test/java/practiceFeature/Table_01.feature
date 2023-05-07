Feature: 
  test login feature

  Scenario: 
    to test login with diff credentials

    Given open browser and enter url
    Then enter un and pwd
      | admin | admin123 | ram@777.com    |
      | pavan | pavan111 | pavan@6666.com |
      
    And click on login btn
