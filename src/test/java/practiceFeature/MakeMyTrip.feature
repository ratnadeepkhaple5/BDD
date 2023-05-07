Feature: Make MyTrip

  Scenario Outline: book flights
    Given open browser
    Then enter makeMyTrip url
    Then select source "<src>"
    And select destination "<dest>"
    And select passenger "<passenger>"
    Then click on applyFlight

    Examples: 
      | src    | dest      | passenger |
      | Pune   | Bengaluru |         2 |
      | Mumbai | Hyderabad |         5 |
