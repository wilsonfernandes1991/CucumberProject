Feature: Test Login Feature
  I need to test the login functionlity

  Scenario: Test login with valid credentials
    Given I open the Browser
    When I enter userName and password
    Then I verify home page

  Scenario Outline: 
    Given I open the Browser
    When I enter "<username>" and "<password>"
    Then I verify home page
    Then I close the browser

    Examples: 
      | username | password   |
      | wilson-1 | password-1 |
      | wilson-2 | password-2 |
      | wilson-3 | password-3 |
      | wilson-4 | password-4 |
