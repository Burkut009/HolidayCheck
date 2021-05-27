

Feature: holidday check

  @wip
  Scenario: search for hotels
    Given the user is on the home page
    When the user clicks on "search"
    And the user enters "Berlin" in search box
    And the user selects the first suggested result
    Then all search result should contain "Berlin" in search result title


