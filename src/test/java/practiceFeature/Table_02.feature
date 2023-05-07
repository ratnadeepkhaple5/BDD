Feature: 
  test login feature with map

  Scenario: 
    to test login with diff credentials for map

    Given open browser and enter url
    
    Then enter user and pwd
      | un         | pwd      | mail           |
      | admin      | admin123 | ram@777.com    |
      | pavan      | pavan111 | pavan@6666.com |
      | pavankumar | pavan11  | pavan@66.com   |
    And click on login button
