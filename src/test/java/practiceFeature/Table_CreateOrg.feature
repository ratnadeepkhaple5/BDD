Feature: Create organisation

  Scenario: to create org with 3 values
    Given launch browser
    And Enter URL
    And Enter un_pwd and login
    Then click on org module
    When click on create new org image plus
    And enter values in fields
      | Ratan_01 | 9422655270 | ratankhaple55@gmail.com |
      | Ratan_02 | 9423541270 | ratankhaple123@gmail.com |
    And Click on create org
