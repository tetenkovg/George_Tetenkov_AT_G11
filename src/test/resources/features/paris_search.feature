@Paris
Feature: Search for 5-star hotels in Paris

  Scenario: User searches for 5-star hotels in Paris and checks rating
    Given I open Booking home page
    And I accept cookies if present
    And I dismiss sign-in popup if present
    When I enter city "Paris"
    And I select city from list "Paris"
    And I set check-in date after 3 days with 7 nights
    And I set 2 adults and 1 room
    And I click Search
    And I dismiss sign-in popup if present
    And I filter by five stars
    And I open sorter dropdown
    And I sort by property rating desc
    Then first hotel rating should be "5 out of 5"
