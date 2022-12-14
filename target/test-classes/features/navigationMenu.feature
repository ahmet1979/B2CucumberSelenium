@navigationMenu

Feature: Krafttech navigateMenu in Test

  Scenario: Login as Mike
    Given Get the text of dashboard
    When Go to Developers menu
    Then  Get the text of Developer

  Scenario: Login as Sebastian
    Given Get the text of dashboard
    When Go to Edit Profile menu
    Then  Get the text of Edit User Profile

  Scenario: Login as Jhon Nash
    Given Get the text of dashboard
    When Go to My Profile menu
    Then Get the text of User Profile