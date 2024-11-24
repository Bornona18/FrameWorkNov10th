Feature: google search

  Scenario Outline: simple search
    Given I am on the goggle homepage
    When I enter the search "<term>"
    And I click on the google search button
    Then I receive related search result

    Examples: 
      | term              |
      | Quality Assurance |
      | Software Testing  |
