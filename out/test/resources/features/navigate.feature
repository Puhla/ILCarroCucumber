Feature: Home page

  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    Then User verifies HomePage title is displayed
    Then User enter the city and dates
    Then User clicks on Yalla button to find car
    And User quites browser

#